package com.in28minutes.springmvc.todos;

import java.util.Date;

public class Todo {

	private int id;
	private String user;
	private String desc;
	private Date TargetDate;
	private boolean isdone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getTargetDate() {
		return TargetDate;
	}
	public void setTargetDate(Date targetDate) {
		TargetDate = targetDate;
	}
	public boolean isIsdone() {
		return isdone;
	}
	public void setIsdone(boolean isdone) {
		this.isdone = isdone;
	}
	@Override
	public String toString() {
		return String.format("this is from todo [id=%s, user=%s, desc=%s, TargetDate=%s, isdone=%s]", id, user, desc, TargetDate,
				isdone);
	}
	public Todo(int id, String user, String desc, Date targetDate, boolean isdone) {
		this.id = id;
		this.user = user;
		this.desc = desc;
		TargetDate = targetDate;
		this.isdone = isdone;
	}
	
	
}
