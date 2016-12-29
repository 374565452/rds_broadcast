package com.cov001.rds.common.dto;

public class DeviceShowDto {

	private String uid;
	
	private String deviceNo;
	
	private String deviceType;
	
	private String deviceStatus;
	
	private Integer deviceVol;

	private String uStatus;
	
	public String getuStatus() {
		return uStatus;
	}

	public void setuStatus(String uStatus) {
		this.uStatus = uStatus;
	}
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getDeviceNo() {
		return deviceNo;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public Integer getDeviceVol() {
		return deviceVol;
	}

	public void setDeviceVol(Integer deviceVol) {
		this.deviceVol = deviceVol;
	}

	
	
	
	
}
