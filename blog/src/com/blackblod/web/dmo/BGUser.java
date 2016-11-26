package com.blackblod.web.dmo;

import java.io.Serializable;
/**
 * 用户实体
 * @author Songlin Li
 * @date 2016-11-19
 */
public class BGUser implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String oId;

	/**
	 * 用户编号
	 */
    private Integer userNo;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户昵称
     */
    private String userNickname;

    /**
     * 用户标识（技术，设计师...）
     */
    private String userTags;

    /**
     * 用户个人站地址
     */
    private String userURL;

    /**
     * 用户qq
     */
    private String userQQ;

    /**
     * 用户推荐人
     */
    private String userIntro;

    /**
     * 
     */
    private Integer userAvatarType;

    /**
     * 
     */
    private String userAvatarURL;

    /**
     * 用户在线标识（pc，手机：android,weixin,ios）
     */
    private String userOnlineFlag;


    /**
     * 用户角色
     */
    private String userRole;

    /**
     * 用户文章数量
     */
    private Integer userArticleCount;

    /**
     * 用户评论数量
     */
    private Integer userCommentCount;

    /**
     * 用户标签数量
     */
    private Integer userTagCount;

    /**
     * 用户状态
     */
    private Integer userStatus;

    /**
     * 用户积分
     */
    private Integer userPoint;

    /**
     * 用户使用积分
     */
    private Integer userUsedPoint;

    private Integer userJoinPointRank;

    private Integer userJoinUsedPointRank;

    /**
     * 用户最后发文章时间
     */
    private Long userLatestArticleTime;

    /**
     * 用户最后评论时间
     */
    private Long userLatestCmtTime;

    /**
     * 用户最后评论时间
     */
    private Long userLatestLoginTime;

    /**
     * 用户最后登录ip
     */
    private String userLatestLoginIP;

    /**
     * 用户app角色
     */
    private Integer userAppRole;

    private Long userCheckinTime;

    private Integer userLongestCheckinStreakStart;

    private Integer userLongestCheckinStreakEnd;

    private Integer userCurrentCheckinStreakStart;

    private Integer userCurrentCheckinStreakEnd;

    private Integer userLongestCheckinStreak;

    private Integer userCurrentCheckinStreak;

    /**
     * 用户皮肤
     */
    private String userSkin;

    /**
     * 用户手机皮肤
     */
    private String userMobileSkin;

    /**
     * 用户国籍
     */
    private String userCountry;

    /**
     * 用户省份
     */
    private String userProvince;

    /**
     * 用户城市
     */
    private String userCity;

    /**
     * 用户更新时间
     */
    private Long userUpdateTime;

    private Integer userGeoStatus;

    /**
     * 用户评论页模式
     */
    private Integer userCommentViewMode;

    private Integer userUAStatus;

    /**
     * 用户通知状态
     */
    private Integer userNotifyStatus;

    /**
     * 用户积分状态
     */
    private Integer userPointStatus;

    /**
     * 用户关注者状态
     */
    private Integer userFollowerStatus;

    /**
     * 用户关注文章状态
     */
    private Integer userFollowingArticleStatus;

    /**
     * 用户关注标签状态
     */
    private Integer userFollowingTagStatus;

    /**
     * 用户关注用户状态
     */
    private Integer userFollowingUserStatus;

    /**
     * 用户评论状态
     */
    private Integer userCommentStatus;

    /**
     * 用户文章状态
     */
    private Integer userArticleStatus;

    /**
     * 用户在线状态
     */
    private Integer userOnlineStatus;

    /**
     * 用户时间表状态
     */
    private Integer userTimelineStatus;

    /**
     * 用户熔炉链接状态
     */
    private Integer userForgeLinkStatus;

    /**
     * 用户列表页大小
     */
    private Integer userListPageSize;

    private Integer userAvatarViewMode;

    /**
     * 用户邮箱发送状态
     */
    private Integer userSubMailStatus;

    /**
     * 用户邮箱发送时间
     */
    private Long userSubMailSendTime;

    /**
     * 用户快捷键状态
     */
    private Integer userKeyboardShortcutsStatus;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserTags() {
        return userTags;
    }

    public void setUserTags(String userTags) {
        this.userTags = userTags;
    }

    public String getUserURL() {
        return userURL;
    }

    public void setUserURL(String userURL) {
        this.userURL = userURL;
    }

    public String getUserQQ() {
        return userQQ;
    }

    public void setUserQQ(String userQQ) {
        this.userQQ = userQQ;
    }

    public String getUserIntro() {
        return userIntro;
    }

    public void setUserIntro(String userIntro) {
        this.userIntro = userIntro;
    }

    public Integer getUserAvatarType() {
        return userAvatarType;
    }

    public void setUserAvatarType(Integer userAvatarType) {
        this.userAvatarType = userAvatarType;
    }

    public String getUserAvatarURL() {
        return userAvatarURL;
    }

    public void setUserAvatarURL(String userAvatarURL) {
        this.userAvatarURL = userAvatarURL;
    }

    public String getUserOnlineFlag() {
        return userOnlineFlag;
    }

    public void setUserOnlineFlag(String userOnlineFlag) {
        this.userOnlineFlag = userOnlineFlag;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public Integer getUserArticleCount() {
        return userArticleCount;
    }

    public void setUserArticleCount(Integer userArticleCount) {
        this.userArticleCount = userArticleCount;
    }

    public Integer getUserCommentCount() {
        return userCommentCount;
    }

    public void setUserCommentCount(Integer userCommentCount) {
        this.userCommentCount = userCommentCount;
    }

    public Integer getUserTagCount() {
        return userTagCount;
    }

    public void setUserTagCount(Integer userTagCount) {
        this.userTagCount = userTagCount;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getUserPoint() {
        return userPoint;
    }

    public void setUserPoint(Integer userPoint) {
        this.userPoint = userPoint;
    }

    public Integer getUserUsedPoint() {
        return userUsedPoint;
    }

    public void setUserUsedPoint(Integer userUsedPoint) {
        this.userUsedPoint = userUsedPoint;
    }

    public Integer getUserJoinPointRank() {
        return userJoinPointRank;
    }

    public void setUserJoinPointRank(Integer userJoinPointRank) {
        this.userJoinPointRank = userJoinPointRank;
    }

    public Integer getUserJoinUsedPointRank() {
        return userJoinUsedPointRank;
    }

    public void setUserJoinUsedPointRank(Integer userJoinUsedPointRank) {
        this.userJoinUsedPointRank = userJoinUsedPointRank;
    }

    public Long getUserLatestArticleTime() {
        return userLatestArticleTime;
    }

    public void setUserLatestArticleTime(Long userLatestArticleTime) {
        this.userLatestArticleTime = userLatestArticleTime;
    }

    public Long getUserLatestCmtTime() {
        return userLatestCmtTime;
    }

    public void setUserLatestCmtTime(Long userLatestCmtTime) {
        this.userLatestCmtTime = userLatestCmtTime;
    }

    public Long getUserLatestLoginTime() {
        return userLatestLoginTime;
    }

    public void setUserLatestLoginTime(Long userLatestLoginTime) {
        this.userLatestLoginTime = userLatestLoginTime;
    }

    public String getUserLatestLoginIP() {
        return userLatestLoginIP;
    }

    public void setUserLatestLoginIP(String userLatestLoginIP) {
        this.userLatestLoginIP = userLatestLoginIP;
    }

    public Integer getUserAppRole() {
        return userAppRole;
    }

    public void setUserAppRole(Integer userAppRole) {
        this.userAppRole = userAppRole;
    }

    public Long getUserCheckinTime() {
        return userCheckinTime;
    }

    public void setUserCheckinTime(Long userCheckinTime) {
        this.userCheckinTime = userCheckinTime;
    }

    public Integer getUserLongestCheckinStreakStart() {
        return userLongestCheckinStreakStart;
    }

    public void setUserLongestCheckinStreakStart(Integer userLongestCheckinStreakStart) {
        this.userLongestCheckinStreakStart = userLongestCheckinStreakStart;
    }

    public Integer getUserLongestCheckinStreakEnd() {
        return userLongestCheckinStreakEnd;
    }

    public void setUserLongestCheckinStreakEnd(Integer userLongestCheckinStreakEnd) {
        this.userLongestCheckinStreakEnd = userLongestCheckinStreakEnd;
    }

    public Integer getUserCurrentCheckinStreakStart() {
        return userCurrentCheckinStreakStart;
    }

    public void setUserCurrentCheckinStreakStart(Integer userCurrentCheckinStreakStart) {
        this.userCurrentCheckinStreakStart = userCurrentCheckinStreakStart;
    }

    public Integer getUserCurrentCheckinStreakEnd() {
        return userCurrentCheckinStreakEnd;
    }

    public void setUserCurrentCheckinStreakEnd(Integer userCurrentCheckinStreakEnd) {
        this.userCurrentCheckinStreakEnd = userCurrentCheckinStreakEnd;
    }

    public Integer getUserLongestCheckinStreak() {
        return userLongestCheckinStreak;
    }

    public void setUserLongestCheckinStreak(Integer userLongestCheckinStreak) {
        this.userLongestCheckinStreak = userLongestCheckinStreak;
    }

    public Integer getUserCurrentCheckinStreak() {
        return userCurrentCheckinStreak;
    }

    public void setUserCurrentCheckinStreak(Integer userCurrentCheckinStreak) {
        this.userCurrentCheckinStreak = userCurrentCheckinStreak;
    }

    public String getUserSkin() {
        return userSkin;
    }

    public void setUserSkin(String userSkin) {
        this.userSkin = userSkin;
    }

    public String getUserMobileSkin() {
        return userMobileSkin;
    }

    public void setUserMobileSkin(String userMobileSkin) {
        this.userMobileSkin = userMobileSkin;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public Long getUserUpdateTime() {
        return userUpdateTime;
    }

    public void setUserUpdateTime(Long userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
    }

    public Integer getUserGeoStatus() {
        return userGeoStatus;
    }

    public void setUserGeoStatus(Integer userGeoStatus) {
        this.userGeoStatus = userGeoStatus;
    }

    public Integer getUserCommentViewMode() {
        return userCommentViewMode;
    }

    public void setUserCommentViewMode(Integer userCommentViewMode) {
        this.userCommentViewMode = userCommentViewMode;
    }

    public Integer getUserUAStatus() {
        return userUAStatus;
    }

    public void setUserUAStatus(Integer userUAStatus) {
        this.userUAStatus = userUAStatus;
    }

    public Integer getUserNotifyStatus() {
        return userNotifyStatus;
    }

    public void setUserNotifyStatus(Integer userNotifyStatus) {
        this.userNotifyStatus = userNotifyStatus;
    }

    public Integer getUserPointStatus() {
        return userPointStatus;
    }

    public void setUserPointStatus(Integer userPointStatus) {
        this.userPointStatus = userPointStatus;
    }

    public Integer getUserFollowerStatus() {
        return userFollowerStatus;
    }

    public void setUserFollowerStatus(Integer userFollowerStatus) {
        this.userFollowerStatus = userFollowerStatus;
    }

    public Integer getUserFollowingArticleStatus() {
        return userFollowingArticleStatus;
    }

    public void setUserFollowingArticleStatus(Integer userFollowingArticleStatus) {
        this.userFollowingArticleStatus = userFollowingArticleStatus;
    }

    public Integer getUserFollowingTagStatus() {
        return userFollowingTagStatus;
    }

    public void setUserFollowingTagStatus(Integer userFollowingTagStatus) {
        this.userFollowingTagStatus = userFollowingTagStatus;
    }

    public Integer getUserFollowingUserStatus() {
        return userFollowingUserStatus;
    }

    public void setUserFollowingUserStatus(Integer userFollowingUserStatus) {
        this.userFollowingUserStatus = userFollowingUserStatus;
    }

    public Integer getUserCommentStatus() {
        return userCommentStatus;
    }

    public void setUserCommentStatus(Integer userCommentStatus) {
        this.userCommentStatus = userCommentStatus;
    }

    public Integer getUserArticleStatus() {
        return userArticleStatus;
    }

    public void setUserArticleStatus(Integer userArticleStatus) {
        this.userArticleStatus = userArticleStatus;
    }

    public Integer getUserOnlineStatus() {
        return userOnlineStatus;
    }

    public void setUserOnlineStatus(Integer userOnlineStatus) {
        this.userOnlineStatus = userOnlineStatus;
    }

    public Integer getUserTimelineStatus() {
        return userTimelineStatus;
    }

    public void setUserTimelineStatus(Integer userTimelineStatus) {
        this.userTimelineStatus = userTimelineStatus;
    }

    public Integer getUserForgeLinkStatus() {
        return userForgeLinkStatus;
    }

    public void setUserForgeLinkStatus(Integer userForgeLinkStatus) {
        this.userForgeLinkStatus = userForgeLinkStatus;
    }

    public Integer getUserListPageSize() {
        return userListPageSize;
    }

    public void setUserListPageSize(Integer userListPageSize) {
        this.userListPageSize = userListPageSize;
    }

    public Integer getUserAvatarViewMode() {
        return userAvatarViewMode;
    }

    public void setUserAvatarViewMode(Integer userAvatarViewMode) {
        this.userAvatarViewMode = userAvatarViewMode;
    }

    public Integer getUserSubMailStatus() {
        return userSubMailStatus;
    }

    public void setUserSubMailStatus(Integer userSubMailStatus) {
        this.userSubMailStatus = userSubMailStatus;
    }

    public Long getUserSubMailSendTime() {
        return userSubMailSendTime;
    }

    public void setUserSubMailSendTime(Long userSubMailSendTime) {
        this.userSubMailSendTime = userSubMailSendTime;
    }

    public Integer getUserKeyboardShortcutsStatus() {
        return userKeyboardShortcutsStatus;
    }

    public void setUserKeyboardShortcutsStatus(Integer userKeyboardShortcutsStatus) {
        this.userKeyboardShortcutsStatus = userKeyboardShortcutsStatus;
    }
}