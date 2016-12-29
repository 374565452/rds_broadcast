package com.cov001.rds.common.dto;

public class LoginDto {
	private String userName;
	private String password;
	private String remberPwd;
	private String verificationCode;
	private String sessionAdminName; // 如果sessionAdminName 不为null，则表示已经扥该
	private String tipMessage;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRemberPwd() {
		return remberPwd;
	}
	public void setRemberPwd(String remberPwd) {
		this.remberPwd = remberPwd;
	}
	public String getVerificationCode() {
		return verificationCode;
	}
	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}
	public String getSessionAdminName() {
		return sessionAdminName;
	}
	public void setSessionAdminName(String sessionAdminName) {
		this.sessionAdminName = sessionAdminName;
	}
	public String getTipMessage() {
		return tipMessage;
	}
	public void setTipMessage(String tipMessage) {
		this.tipMessage = tipMessage;
	}
	
}
