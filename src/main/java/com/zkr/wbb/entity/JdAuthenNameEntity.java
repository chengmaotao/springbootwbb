package com.zkr.wbb.entity;


import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 实名认证表
 * 
 * @author gen
 * @email gen1@ctc
 * @date 2019-01-22 16:40:07
 */
@TableName("jd_authen_name")
public class JdAuthenNameEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 身份证号
	 */
	private String cardNo;
	/**
	 * 身份证反面
	 */
	private String pictureF;
	/**
	 * 身份证正面
	 */
	private String pictureZ;
	/**
	 * 身份证手持
	 */
	private String pictureSc;
	/**
	 * 状态 0待审核1人工审核通过2人工审核不通过3实名认证通过4实名认证未通过5活体认证通过6活体认证未通过
	 */
	private Integer status;
	/**
	 * 未通过原因
	 */
	private String statusMsg;
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
	 * 设置：手机号
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 获取：手机号
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * 设置：姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：姓名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：身份证号
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	/**
	 * 获取：身份证号
	 */
	public String getCardNo() {
		return cardNo;
	}
	/**
	 * 设置：身份证反面
	 */
	public void setPictureF(String pictureF) {
		this.pictureF = pictureF;
	}
	/**
	 * 获取：身份证反面
	 */
	public String getPictureF() {
		return pictureF;
	}
	/**
	 * 设置：身份证正面
	 */
	public void setPictureZ(String pictureZ) {
		this.pictureZ = pictureZ;
	}
	/**
	 * 获取：身份证正面
	 */
	public String getPictureZ() {
		return pictureZ;
	}
	/**
	 * 设置：身份证手持
	 */
	public void setPictureSc(String pictureSc) {
		this.pictureSc = pictureSc;
	}
	/**
	 * 获取：身份证手持
	 */
	public String getPictureSc() {
		return pictureSc;
	}
	/**
	 * 设置：状态 0待审核1人工审核通过2人工审核不通过3实名认证通过4实名认证未通过5活体认证通过6活体认证未通过
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态 0待审核1人工审核通过2人工审核不通过3实名认证通过4实名认证未通过5活体认证通过6活体认证未通过
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：未通过原因
	 */
	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}
	/**
	 * 获取：未通过原因
	 */
	public String getStatusMsg() {
		return statusMsg;
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
