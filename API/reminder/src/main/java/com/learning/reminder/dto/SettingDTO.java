package com.learning.reminder.dto;

import java.util.List;

public class SettingDTO {
	private Integer settingId;
	private String dateFormat;
	private int mode;
	private int notiTime;
	private int recordPerPage;
	private List<StatusDTO> statuses;

	public Integer getSettingId() {
		return settingId;
	}

	public void setSettingId(Integer settingId) {
		this.settingId = settingId;
	}

	public String getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public int getNotiTime() {
		return notiTime;
	}

	public void setNotiTime(int notiTime) {
		this.notiTime = notiTime;
	}

	public int getRecordPerPage() {
		return recordPerPage;
	}

	public void setRecordPerPage(int recordPerPage) {
		this.recordPerPage = recordPerPage;
	}

	public List<StatusDTO> getStatuses() {
		return statuses;
	}

	public void setStatuses(List<StatusDTO> statuses) {
		this.statuses = statuses;
	}

}
