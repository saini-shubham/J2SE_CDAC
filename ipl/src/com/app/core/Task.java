package com.app.core;

import java.time.LocalDate;

public class Task {
	private int taskId;
	private String taskName;
	private String description;
	private LocalDate date;
	private Status status;
	private boolean active;
	private static int taskCounter;
	static {
		taskCounter = 1;
	}

	public Task(String taskName, String description, LocalDate date) {
		super();
		this.taskId = taskCounter++;
		this.taskName = taskName;
		this.description = description;
		this.date = date;
		this.status = Status.PENDING;
		this.active = true;
	}

	

	public int getTaskId() {
		return taskId;
	}

	public LocalDate getDate() {
		return date;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description + ", date=" + date
				+ ", status=" + status + ", active=" + active + "]";
	}

}
