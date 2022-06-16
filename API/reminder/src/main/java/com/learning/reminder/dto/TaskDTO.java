package com.learning.reminder.dto;

import java.util.Date;

public class TaskDTO {
	private Integer taskNo;
	private String title;
	private String description;
	private Date dateReminder;
	private StatusDTO status;

	public Integer getTaskNo() {
		return taskNo;
	}

	public void setTaskNo(Integer taskNo) {
		this.taskNo = taskNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateReminder() {
		return dateReminder;
	}

	public void setDateReminder(Date dateReminder) {
		this.dateReminder = dateReminder;
	}

	public StatusDTO getStatus() {
		return status;
	}

	public void setStatus(StatusDTO status) {
		this.status = status;
	}

}
