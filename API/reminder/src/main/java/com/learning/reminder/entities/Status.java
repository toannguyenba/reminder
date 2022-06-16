package com.learning.reminder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the status database table.
 * 
 */
@Entity
@NamedQuery(name="Status.findAll", query="SELECT s FROM Status s")
public class Status implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private StatusPK id;

	@Column(name="color_code")
	private String colorCode;

	@Column(name="status_name")
	private String statusName;

	public Status() {
	}

	public StatusPK getId() {
		return this.id;
	}

	public void setId(StatusPK id) {
		this.id = id;
	}

	public String getColorCode() {
		return this.colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	public String getStatusName() {
		return this.statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

}