package com.zkr.wbb.entity;



import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 粉丝表
 * 
 * @author gen
 * @email gen1@ctc
 * @date 2019-01-22 16:40:07
 */
@TableName("jd_fans")
public class JdFansEntity implements Serializable {
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
	 * 粉丝手机号
	 */
	private String fansMobile;
	/**
	 * 区号
	 */
	private String fansMobileAreaCode;
	/**
	 * 关系 1未关注3互相关注
	 */
	private Integer relationCode;
	/**
	 * 粉丝来源 1来自我的通讯录2来自他的通讯录3来自扫一扫
	 */
	private String origin;
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
	 * 设置：粉丝手机号
	 */
	public void setFansMobile(String fansMobile) {
		this.fansMobile = fansMobile;
	}
	/**
	 * 获取：粉丝手机号
	 */
	public String getFansMobile() {
		return fansMobile;
	}
	/**
	 * 设置：区号
	 */
	public void setFansMobileAreaCode(String fansMobileAreaCode) {
		this.fansMobileAreaCode = fansMobileAreaCode;
	}
	/**
	 * 获取：区号
	 */
	public String getFansMobileAreaCode() {
		return fansMobileAreaCode;
	}
	/**
	 * 设置：关系 1未关注3互相关注
	 */
	public void setRelationCode(Integer relationCode) {
		this.relationCode = relationCode;
	}
	/**
	 * 获取：关系 1未关注3互相关注
	 */
	public Integer getRelationCode() {
		return relationCode;
	}
	/**
	 * 设置：粉丝来源 1来自我的通讯录2来自他的通讯录3来自扫一扫
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * 获取：粉丝来源 1来自我的通讯录2来自他的通讯录3来自扫一扫
	 */
	public String getOrigin() {
		return origin;
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
