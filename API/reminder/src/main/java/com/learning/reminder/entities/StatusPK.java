package com.learning.reminder.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the status database table.
 * 
 */
@Embeddable
public class StatusPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="setting_id")
	private int settingId;

	@Column(name="status_id")
	private int statusId;

	public StatusPK() {
	}
	public int getSettingId() {
		return this.settingId;
	}
	public void setSettingId(int settingId) {
		this.settingId = settingId;
	}
	public int getStatusId() {
		return this.statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof StatusPK)) {
			return false;
		}
		StatusPK castOther = (StatusPK)other;
		return 
			(this.settingId == castOther.settingId)
			&& (this.statusId == castOther.statusId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.settingId;
		hash = hash * prime + this.statusId;
		
		return hash;
	}
}