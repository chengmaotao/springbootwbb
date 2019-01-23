package com.zkr.wbb.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;


import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author gen
 * @email gen1@ctc
 * @date 2019-01-22 16:40:07
 */
@TableName("customer")
public class CustomerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;
	/**
	 * 用户名，默认为手机号
	 */
	private String username;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 头像链接
	 */
	private String photoUrl;
	/**
	 * 算力
	 */
	private Integer power;
	/**
	 * 钻石余额
	 */
	private BigDecimal diamondBalance;
	/**
	 * 国家区号
	 */
	private String countryAreaCode;
	/**
	 * 状态，0已发送验证码，1已注册，2冻结，3注销
	 */
	private Integer status;
	/**
	 * 
	 */
	private String inviteCode;
	/**
	 * 来源邀请用户id
	 */
	private Long fromInviteCid;
	/**
	 * 邀请发放状态，0未发放，1已发放
	 */
	private Integer invitePriseStatus;
	/**
	 * 已邀请人数
	 */
	private Integer inviteCount;
	/**
	 * 
	 */
	private Integer inviteRewardCount;
	/**
	 * 
	 */
	private BigDecimal ctcBalance;
	/**
	 * 
	 */
	private String channelId;
	/**
	 * 
	 */
	private String appVersion;
	/**
	 * 撒币标识
	 */
	private Integer sbFlag;
	/**
	 * 
	 */
	private Date registerTime;
	/**
	 * 
	 */
	private Long version;
	/**
	 * 
	 */
	private String password;
	/**
	 * 
	 */
	private Integer batchRegistration;
	/**
	 * 
	 */
	private String ip;
	/**
	 * 
	 */
	private String fromPlat;
	/**
	 * 
	 */
	private Date loginTime;
	/**
	 * 1是可疑用户同一个sid超过三个手机号在用
	 */
	private String suspicious;
	/**
	 * 
	 */
	private Integer jdstatus;
	/**
	 * 
	 */
	private String shorturl;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：用户名，默认为手机号
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：用户名，默认为手机号
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置：昵称
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * 获取：昵称
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * 设置：头像链接
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	/**
	 * 获取：头像链接
	 */
	public String getPhotoUrl() {
		return photoUrl;
	}
	/**
	 * 设置：算力
	 */
	public void setPower(Integer power) {
		this.power = power;
	}
	/**
	 * 获取：算力
	 */
	public Integer getPower() {
		return power;
	}
	/**
	 * 设置：钻石余额
	 */
	public void setDiamondBalance(BigDecimal diamondBalance) {
		this.diamondBalance = diamondBalance;
	}
	/**
	 * 获取：钻石余额
	 */
	public BigDecimal getDiamondBalance() {
		return diamondBalance;
	}
	/**
	 * 设置：国家区号
	 */
	public void setCountryAreaCode(String countryAreaCode) {
		this.countryAreaCode = countryAreaCode;
	}
	/**
	 * 获取：国家区号
	 */
	public String getCountryAreaCode() {
		return countryAreaCode;
	}
	/**
	 * 设置：状态，0已发送验证码，1已注册，2冻结，3注销
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态，0已发送验证码，1已注册，2冻结，3注销
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：
	 */
	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}
	/**
	 * 获取：
	 */
	public String getInviteCode() {
		return inviteCode;
	}
	/**
	 * 设置：来源邀请用户id
	 */
	public void setFromInviteCid(Long fromInviteCid) {
		this.fromInviteCid = fromInviteCid;
	}
	/**
	 * 获取：来源邀请用户id
	 */
	public Long getFromInviteCid() {
		return fromInviteCid;
	}
	/**
	 * 设置：邀请发放状态，0未发放，1已发放
	 */
	public void setInvitePriseStatus(Integer invitePriseStatus) {
		this.invitePriseStatus = invitePriseStatus;
	}
	/**
	 * 获取：邀请发放状态，0未发放，1已发放
	 */
	public Integer getInvitePriseStatus() {
		return invitePriseStatus;
	}
	/**
	 * 设置：已邀请人数
	 */
	public void setInviteCount(Integer inviteCount) {
		this.inviteCount = inviteCount;
	}
	/**
	 * 获取：已邀请人数
	 */
	public Integer getInviteCount() {
		return inviteCount;
	}
	/**
	 * 设置：
	 */
	public void setInviteRewardCount(Integer inviteRewardCount) {
		this.inviteRewardCount = inviteRewardCount;
	}
	/**
	 * 获取：
	 */
	public Integer getInviteRewardCount() {
		return inviteRewardCount;
	}
	/**
	 * 设置：
	 */
	public void setCtcBalance(BigDecimal ctcBalance) {
		this.ctcBalance = ctcBalance;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getCtcBalance() {
		return ctcBalance;
	}
	/**
	 * 设置：
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	/**
	 * 获取：
	 */
	public String getChannelId() {
		return channelId;
	}
	/**
	 * 设置：
	 */
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	/**
	 * 获取：
	 */
	public String getAppVersion() {
		return appVersion;
	}
	/**
	 * 设置：撒币标识
	 */
	public void setSbFlag(Integer sbFlag) {
		this.sbFlag = sbFlag;
	}
	/**
	 * 获取：撒币标识
	 */
	public Integer getSbFlag() {
		return sbFlag;
	}
	/**
	 * 设置：
	 */
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	/**
	 * 获取：
	 */
	public Date getRegisterTime() {
		return registerTime;
	}
	/**
	 * 设置：
	 */
	public void setVersion(Long version) {
		this.version = version;
	}
	/**
	 * 获取：
	 */
	public Long getVersion() {
		return version;
	}
	/**
	 * 设置：
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：
	 */
	public void setBatchRegistration(Integer batchRegistration) {
		this.batchRegistration = batchRegistration;
	}
	/**
	 * 获取：
	 */
	public Integer getBatchRegistration() {
		return batchRegistration;
	}
	/**
	 * 设置：
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * 获取：
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * 设置：
	 */
	public void setFromPlat(String fromPlat) {
		this.fromPlat = fromPlat;
	}
	/**
	 * 获取：
	 */
	public String getFromPlat() {
		return fromPlat;
	}
	/**
	 * 设置：
	 */
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	/**
	 * 获取：
	 */
	public Date getLoginTime() {
		return loginTime;
	}
	/**
	 * 设置：1是可疑用户同一个sid超过三个手机号在用
	 */
	public void setSuspicious(String suspicious) {
		this.suspicious = suspicious;
	}
	/**
	 * 获取：1是可疑用户同一个sid超过三个手机号在用
	 */
	public String getSuspicious() {
		return suspicious;
	}
	/**
	 * 设置：
	 */
	public void setJdstatus(Integer jdstatus) {
		this.jdstatus = jdstatus;
	}
	/**
	 * 获取：
	 */
	public Integer getJdstatus() {
		return jdstatus;
	}
	/**
	 * 设置：
	 */
	public void setShorturl(String shorturl) {
		this.shorturl = shorturl;
	}
	/**
	 * 获取：
	 */
	public String getShorturl() {
		return shorturl;
	}
}
