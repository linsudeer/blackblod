package com.blackblod.web.dto;

public class CustomerDto {

	/**
	 * oId
	 */
    private String oId;

    /**
     * 编号
     */
    private Integer userNo;

    /**
     * 邮箱
     */
    private String userEmail;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 昵称
     */
    private String userNickname;

    /**
     * 标签 (技术，产品...)
     */
    private String userTags;

    /**
     * 个人链接
     */
    private String userURL;

    /**
     * qq
     */
    private String userQQ;

    /**
     * 介绍 (个性签名)
     */
    private String userIntro;

    /**
     * 七牛类型类型
     */
    private Integer userAvatarType;

    /**
     * 默认头像，七牛连接
     */
    private String userAvatarURL;

    /**
     * 在线标志
     */
    private String userOnlineFlag;

    /**
     * 角色
     */
    private String userRole;

    /**
     * 文章数量
     */
    private Integer userArticleCount;

    /**
     * 评论数量
     */
    private Integer userCommentCount;

    /**
     * 标签数量
     */
    private Integer userTagCount;

    /**
     * 状态
     */
    private Integer userStatus;

    /**
     * 积分
     */
    private Integer userPoint;

    /**
     * 已使用积分
     */
    private Integer userUsedPoint;

    /**
     * 是否参与财富排行
     */
    private Integer userJoinPointRank;

    /**
     * 财富消费排行
     */
    private Integer userJoinUsedPointRank;

    /**
     * 最近发布文章时间
     */
    private Long userLatestArticleTime;

    /**
     * 最后一次评论时间
     */
    private Long userLatestCmtTime;

    /**
     * 最后一次登录时间
     */
    private Long userLatestLoginTime;

    /**
     * 最后登录ip
     */
    private String userLatestLoginIP;

    /**
     * app角色
     */
    private Integer userAppRole;

    /**
     * 签到时间
     */
    private Long userCheckinTime;

    /**
     * 最长连续签到统计-开始
     */
    private Integer userLongestCheckinStreakStart;

    /**
     * 最长连续签到统计-结束
     */
    private Integer userLongestCheckinStreakEnd;

    /**
     * 当前连续签到统计-开始
     */
    private Integer userCurrentCheckinStreakStart;

    /**
     * 当前连续签到统计-结束
     */
    private Integer userCurrentCheckinStreakEnd;

    /**
     * 最长连续签到时间
     */
    private Integer userLongestCheckinStreak;

    /**
     * 当前连续签到
     */
    private Integer userCurrentCheckinStreak;

    /**
     * 皮肤
     */
    private String userSkin;

    /**
     * 手机皮肤
     */
    private String userMobileSkin;

    /**
     * 国家
     */
    private String userCountry;

    /**
     * 省
     */
    private String userProvince;

    /**
     * 市
     */
    private String userCity;

    /**
     * 更新时间
     */
    private Long userUpdateTime;

    /**
     * 是否公开地理位置
     */
    private Integer userGeoStatus;

    /**
     * 回帖浏览模式（传统，实时）
     */
    private Integer userCommentViewMode;

    /**
     * 是否公开UA状态
     */
    private Integer userUAStatus;

    /**
     * 是否启用web通知
     */
    private Integer userNotifyStatus;

    /**
     * 是否公开积分列表
     */
    private Integer userPointStatus;

    /**
     * 是否公开粉丝列表
     */
    private Integer userFollowerStatus;

    /**
     * 是否公开收藏帖子列表
     */
    private Integer userFollowingArticleStatus;

    /**
     * 是否公开关注标签列表
     */
    private Integer userFollowingTagStatus;

    /**
     * 是否公开关注用户列表
     */
    private Integer userFollowingUserStatus;

    /**
     * 是否公开评论列表
     */
    private Integer userCommentStatus;

    /**
     * 是否公开文章列表
     */
    private Integer userArticleStatus;

    /**
     * 是否公开在线状态
     */
    private Integer userOnlineStatus;

    /**
     * 是否公开行踪到此刻中
     */
    private Integer userTimelineStatus;

    /**
     * 是否公开连接熔炉
     */
    private Integer userForgeLinkStatus;

    /**
     * 分页每页条目
     */
    private Integer userListPageSize;

    /**
     * 头像浏览模式（是否七牛）
     */
    private Integer userAvatarViewMode;

    /**
     * 是否订阅邮件
     */
    private Integer userSubMailStatus;

    /**
     * 邮件发送时间
     */
    private Long userSubMailSendTime;

    /**
     * 是否开启快捷键
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
