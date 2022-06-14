package com.learning.reminder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the setting database table.
 * 
 */
@Entity
@NamedQuery(name="Setting.findAll", query="SELECT s FROM Setting s")
public class Setting implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="setting_id")
	private int settingId;

	@Column(name="date_format")
	private String dateFormat;

	private int mode;

	@Column(name="noti_time")
	private int notiTime;

	@Column(name="record_per_page")
	private int recordPerPage;

	public Setting() {
	}

	public int getSettingId() {
		return this.settingId;
	}

	public void setSettingId(int settingId) {
		this.settingId = settingId;
	}

	public String getDateFormat() {
		return this.dateFormat;
	}

	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	public int getMode() {
		return this.mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public int getNotiTime() {
		return this.notiTime;
	}

	public void setNotiTime(int notiTime) {
		this.notiTime = notiTime;
	}

	public int getRecordPerPage() {
		return this.recordPerPage;
	}

	public void setRecordPerPage(int recordPerPage) {
		this.recordPerPage = recordPerPage;
	}

}