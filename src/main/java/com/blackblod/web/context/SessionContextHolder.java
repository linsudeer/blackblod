package com.blackblod.web.context;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.mock.web.MockHttpSession;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class SessionContextHolder {
	
	private static HttpSession MOCK_SESSION = new MockHttpSession();

	@SuppressWarnings("unchecked")
	public static <T> T get(String key, Class<T> clazz) {
		return (T) get(key);
	}

	public static Object get(String key) {
		return getSession().getAttribute(key);
	}

	public static void put(String key, Object value) {
		getSession().setAttribute(key, value);
	}

	public static void remove(String key) {
		getSession().removeAttribute(key);
	}
	
	public static HttpSession getSession(){
		HttpSession session = null;
		
		if(PropertiesContextHolder.isProduction()){
			RequestAttributes ra = RequestContextHolder.getRequestAttributes();
			HttpServletRequest request = ((ServletRequestAttributes) ra).getRequest();
			session = request.getSession();
		}else{
			session = MOCK_SESSION;
		}
		return session;
	}
}
