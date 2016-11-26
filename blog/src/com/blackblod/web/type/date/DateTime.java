package com.blackblod.web.type.date;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.blackblod.web.util.DateUtils;

/**
 * 自定义DateTime类型
 * @author Songli Li
 * @date 2016年11月19日 下午5:38:06
 */
public class DateTime extends java.util.Date{

	private static final long serialVersionUID = 1L;
	
	//正常模式
	private static final String SECOND_FMT = "yyyy-MM-dd HH:mm:ss";
	private static final String MINUTE_FMT = "yyyy-MM-dd HH:mm";
	private static final String HOUR_FMT = "yyyy-MM-dd HH";
	private static final String DAY_FMT = "yyyy-MM-dd";
	private static final String MONTH_FMT = "yyyy-MM";
	private static final String YEAR_FMT = "yyyy";
	
	//精简模式
	private static final String SHORT_SECOND_FMT = "yyyyMMddHHmmss";
	private static final String SHORT_MINUTE_FMT = "yyyyMMddHHmm";
	private static final String SHORT_HOUR_FMT = "yyyyMMddHH";
	private static final String SHORT_DAY_FMT = "yyyyMMdd";
	private static final String SHORT_MONTH_FMT = "yyyyMM";
	private static final String SHORT_YEAR_FMT = "yyyy";
	
	/**
	 * 日期类型
	 */
	private DateType type;
	
	/**
	 * 日期值
	 */
	private Date value;
	
	/**
	 * 将字符串转换为DateTime类型
	 * @param value
	 */
	public DateTime(String value){
		String trimValue = StringUtils.trim(value);
		if(StringUtils.contains(trimValue, '-') || StringUtils.contains(trimValue, ' ') || StringUtils.contains(trimValue, ':')){
			initFmt(value);
		}else{
			initShortFmt(value);
		}
	}
	
	public String toString() {
		String fmtStr = null;

		switch (type) {
		case SECOND:
			fmtStr = DateUtils.format(value, SECOND_FMT);
			break;
		case MINUTE:
			fmtStr = DateUtils.format(value, MINUTE_FMT);
			break;
		case HOUR:
			fmtStr = DateUtils.format(value, HOUR_FMT);
			break;
		case DAY:
			fmtStr = DateUtils.format(value, DAY_FMT);
			break;
		case MONTH:
			fmtStr = DateUtils.format(value, MONTH_FMT);
			break;
		case YEAR:
			fmtStr = DateUtils.format(value, YEAR_FMT);
			break;
		}

		return fmtStr;
	}

	public String toShortString() {
		String fmtStr = null;

		switch (type) {
		case SECOND:
			fmtStr = DateUtils.format(value, SHORT_SECOND_FMT);
			break;
		case MINUTE:
			fmtStr = DateUtils.format(value, SHORT_MINUTE_FMT);
			break;
		case HOUR:
			fmtStr = DateUtils.format(value, SHORT_HOUR_FMT);
			break;
		case DAY:
			fmtStr = DateUtils.format(value, SHORT_DAY_FMT);
			break;
		case MONTH:
			fmtStr = DateUtils.format(value, SHORT_MONTH_FMT);
			break;
		case YEAR:
			fmtStr = DateUtils.format(value, SHORT_YEAR_FMT);
			break;
		}

		return fmtStr;
	}
	

	/**
	 * 初始化正常格式
	 * @author Songlin Li
	 * @date 2016年11月19日 下午5:47:55
	 * @param value
	 */
	private void initFmt(String value) {
		if (value.length() == SECOND_FMT.length()) {
			type = DateType.SECOND;
			this.value = DateUtils.parseToDate(value, SECOND_FMT);
		} else if (value.length() == MINUTE_FMT.length()) {
			type = DateType.MINUTE;
			this.value = DateUtils.parseToDate(value, MINUTE_FMT);
		} else if (value.length() == HOUR_FMT.length()) {
			type = DateType.HOUR;
			this.value = DateUtils.parseToDate(value, HOUR_FMT);
		} else if (value.length() == DAY_FMT.length()) {
			type = DateType.DAY;
			this.value = DateUtils.parseToDate(value, DAY_FMT);
		} else if (value.length() == MONTH_FMT.length()) {
			type = DateType.MONTH;
			this.value = DateUtils.parseToDate(value, MONTH_FMT);
		} else if (value.length() == YEAR_FMT.length()) {
			type = DateType.YEAR;
			this.value = DateUtils.parseToDate(value, YEAR_FMT);
		}
	}
	
	/**
	 * 初始化精简模式
	 * @author Songlin Li
	 * @date 2016年11月19日 下午6:12:54
	 * @param value
	 */
	private void initShortFmt(String value) {
		if (value.length() == SHORT_SECOND_FMT.length()) {
			type = DateType.SECOND;
			this.value = DateUtils.parseToDate(value, SHORT_SECOND_FMT);
		} else if (value.length() == SHORT_MINUTE_FMT.length()) {
			type = DateType.MINUTE;
			this.value = DateUtils.parseToDate(value, SHORT_MINUTE_FMT);
		} else if (value.length() == SHORT_HOUR_FMT.length()) {
			type = DateType.HOUR;
			this.value = DateUtils.parseToDate(value, SHORT_HOUR_FMT);
		} else if (value.length() == SHORT_DAY_FMT.length()) {
			type = DateType.DAY;
			this.value = DateUtils.parseToDate(value, SHORT_DAY_FMT);
		} else if (value.length() == SHORT_MONTH_FMT.length()) {
			type = DateType.MONTH;
			this.value = DateUtils.parseToDate(value, SHORT_MONTH_FMT);
		} else if (value.length() == SHORT_YEAR_FMT.length()) {
			type = DateType.YEAR;
			this.value = DateUtils.parseToDate(value, SHORT_YEAR_FMT);
		}
	}
	/**
	 * @return
	 * @see java.util.Date#clone()
	 */
	public Object clone() {
		return value.clone();
	}

	/**
	 * @return
	 * @deprecated
	 * @see java.util.Date#getYear()
	 */
	public int getYear() {
		return value.getYear();
	}

	/**
	 * @param year
	 * @deprecated
	 * @see java.util.Date#setYear(int)
	 */
	public void setYear(int year) {
		value.setYear(year);
	}

	/**
	 * @return
	 * @deprecated
	 * @see java.util.Date#getMonth()
	 */
	public int getMonth() {
		return value.getMonth();
	}

	/**
	 * @param month
	 * @deprecated
	 * @see java.util.Date#setMonth(int)
	 */
	public void setMonth(int month) {
		value.setMonth(month);
	}

	/**
	 * @return
	 * @deprecated
	 * @see java.util.Date#getDate()
	 */
	public int getDate() {
		return value.getDate();
	}

	/**
	 * @param date
	 * @deprecated
	 * @see java.util.Date#setDate(int)
	 */
	public void setDate(int date) {
		value.setDate(date);
	}

	/**
	 * @return
	 * @deprecated
	 * @see java.util.Date#getDay()
	 */
	public int getDay() {
		return value.getDay();
	}

	/**
	 * @return
	 * @deprecated
	 * @see java.util.Date#getHours()
	 */
	public int getHours() {
		return value.getHours();
	}

	/**
	 * @param hours
	 * @deprecated
	 * @see java.util.Date#setHours(int)
	 */
	public void setHours(int hours) {
		value.setHours(hours);
	}

	/**
	 * @return
	 * @deprecated
	 * @see java.util.Date#getMinutes()
	 */
	public int getMinutes() {
		return value.getMinutes();
	}

	/**
	 * @param minutes
	 * @deprecated
	 * @see java.util.Date#setMinutes(int)
	 */
	public void setMinutes(int minutes) {
		value.setMinutes(minutes);
	}

	/**
	 * @return
	 * @deprecated
	 * @see java.util.Date#getSeconds()
	 */
	public int getSeconds() {
		return value.getSeconds();
	}

	/**
	 * @param seconds
	 * @deprecated
	 * @see java.util.Date#setSeconds(int)
	 */
	public void setSeconds(int seconds) {
		value.setSeconds(seconds);
	}

	/**
	 * @return
	 * @see java.util.Date#getTime()
	 */
	public long getTime() {
		return value.getTime();
	}

	/**
	 * @param time
	 * @see java.util.Date#setTime(long)
	 */
	public void setTime(long time) {
		value.setTime(time);
	}

	/**
	 * @param when
	 * @return
	 * @see java.util.Date#before(java.util.Date)
	 */
	public boolean before(Date when) {
		return value.before(when);
	}

	/**
	 * @param when
	 * @return
	 * @see java.util.Date#after(java.util.Date)
	 */
	public boolean after(Date when) {
		return value.after(when);
	}

	/**
	 * @param obj
	 * @return
	 * @see java.util.Date#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		return value.equals(obj);
	}

	/**
	 * @param anotherDate
	 * @return
	 * @see java.util.Date#compareTo(java.util.Date)
	 */
	public int compareTo(Date anotherDate) {
		return value.compareTo(anotherDate);
	}

	/**
	 * @return
	 * @see java.util.Date#hashCode()
	 */
	public int hashCode() {
		return value.hashCode();
	}

	/**
	 * @return
	 * @deprecated
	 * @see java.util.Date#toLocaleString()
	 */
	public String toLocaleString() {
		return value.toLocaleString();
	}

	/**
	 * @return
	 * @deprecated
	 * @see java.util.Date#toGMTString()
	 */
	public String toGMTString() {
		return value.toGMTString();
	}

	/**
	 * @return
	 * @deprecated
	 * @see java.util.Date#getTimezoneOffset()
	 */
	public int getTimezoneOffset() {
		return value.getTimezoneOffset();
	}

	public static void main(String[] args) {
		DateTime dt = new DateTime("2014-01-02 03:04:05");
		System.out.println(dt);
		System.out.println(dt.toShortString());
	}
	
}
