package com.tomas.web.instance;

/**
 * 用户基本信息表
 * @author PXX
 *
 */
public class UserBaseInfo {
	/**
	 * 用户id
	 */
	private int id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * MD5码
	 */
	private String md5code;
	/**
	 * 描述
	 */
	private String description;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMd5code() {
		return md5code;
	}
	public void setMd5code(String md5code) {
		this.md5code = md5code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "UserBaseInfo [id=" + id + ", username=" + username
				+ ", password=" + password + ", md5code=" + md5code
				+ ", description=" + description + "]";
	}
}
