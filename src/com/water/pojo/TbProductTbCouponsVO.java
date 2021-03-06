package com.water.pojo;

import java.util.Date;

public class TbProductTbCouponsVO {
	private String id;
	private TbProduct tbProduct;
	private TbCoupons tbCoupons;
	private String level;
	private Date createTime;
	private Date updateTime;
	private String createUser;
	private String updateUser;
	private String flag;
	private String noCoupons;
	
	public TbProduct getTbProduct() {
		return tbProduct;
	}
	public void setTbProduct(TbProduct tbProduct) {
		this.tbProduct = tbProduct;
	}
	public TbCoupons getTbCoupons() {
		return tbCoupons;
	}
	public void setTbCoupons(TbCoupons tbCoupons) {
		this.tbCoupons = tbCoupons;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNoCoupons() {
		return noCoupons;
	}
	public void setNoCoupons(String noCoupons) {
		this.noCoupons = noCoupons;
	}
	
}
