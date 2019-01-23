package com.zkr.wbb.entity;



import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 关注表
 * 
 * @author gen
 * @email gen1@ctc
 * @date 2019-01-22 16:40:07
 */
@TableName("jd_follw")
public class JdFollwEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * 用户手机号
	 */
	private String mobile;
	/**
	 * 关注的手机号
	 */
	private String followMobile;
	/**
	 * 区号
	 */
	private String followMobileAreaCode;
	/**
	 * 关系 1未关注2已关注3互相关注
	 */
	private Integer relationCode;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;

	/**
	 * 设置：编号
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：编号
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：用户手机号
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 获取：用户手机号
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * 设置：关注的手机号
	 */
	public void setFollowMobile(String followMobile) {
		this.followMobile = followMobile;
	}
	/**
	 * 获取：关注的手机号
	 */
	public String getFollowMobile() {
		return followMobile;
	}
	/**
	 * 设置：区号
	 */
	public void setFollowMobileAreaCode(String followMobileAreaCode) {
		this.followMobileAreaCode = followMobileAreaCode;
	}
	/**
	 * 获取：区号
	 */
	public String getFollowMobileAreaCode() {
		return followMobileAreaCode;
	}
	/**
	 * 设置：关系 1未关注2已关注3互相关注
	 */
	public void setRelationCode(Integer relationCode) {
		this.relationCode = relationCode;
	}
	/**
	 * 获取：关系 1未关注2已关注3互相关注
	 */
	public Integer getRelationCode() {
		return relationCode;
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
}
