package com.core.task;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
	private static int taskId;
	private String taskName;
	private String description;
	private Date taskDate;
	public static SimpleDateFormat sdf;
	private Status status;
	private boolean active;
	static {
		sdf =new SimpleDateFormat("dd-MM-yyyy");
		taskId++;
	}
	
	public Task(String taskName, String description, Date taskDate, Status status, boolean active) {
		super();
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.status = status;
		this.active = active;
	}
	
	public Task(String taskName, String description, Date taskDate) {
		super();
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.status = status.PENDING;
		this.active=false;
	}
	
	public  int getTaskId() {
		return taskId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Task [taskName=" + taskName + ", description=" + description + ", taskDate=" + sdf.format(taskDate) + ", task="
				+ status + ", active=" + active + "]";
	}
	
	
	
	
	
	

}
