package com.learning.reminder.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the task database table.
 * 
 */
@Entity
@NamedQuery(name="Task.findAll", query="SELECT t FROM Task t")
public class Task implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="task_no")
	private int taskNo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_reminder")
	private Date dateReminder;

	@Column(name="delete_flag")
	private byte deleteFlag;

	private String description;

	private int status;

	private String title;

	public Task() {
	}

	public int getTaskNo() {
		return this.taskNo;
	}

	public void setTaskNo(int taskNo) {
		this.taskNo = taskNo;
	}

	public Date getDateReminder() {
		return this.dateReminder;
	}

	public void setDateReminder(Date dateReminder) {
		this.dateReminder = dateReminder;
	}

	public byte getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(byte deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}