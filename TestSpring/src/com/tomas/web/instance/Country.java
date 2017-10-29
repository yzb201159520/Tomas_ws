package com.tomas.web.instance;

import java.util.Date;

public class Country {
	int id;
	String name;
	String location;
	int totalPeopleNum;
	Date createTime;
	Address localAddress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getTotalPeopleNum() {
		return totalPeopleNum;
	}
	public void setTotalPeopleNum(int totalPeopleNum) {
		this.totalPeopleNum = totalPeopleNum;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Address getLocalAddress() {
		return localAddress;
	}
	public void setLocalAddress(Address localAddress) {
		this.localAddress = localAddress;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", location="
				+ location + ", totalPeopleNum=" + totalPeopleNum
				+ ", createTime=" + createTime + ", localAddress="
				+ localAddress + "]";
	}
}
