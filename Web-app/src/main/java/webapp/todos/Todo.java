package webapp.todos;

import java.util.Date;

public class Todo {
	private int id;
	private String user;
	private String desc;
	private Date targetdate;
	private boolean isdone;
	
	public Todo(int id, String user, String desc, Date targetdate, boolean isdone) {
		this.id = id;
		this.user = user;
		this.desc = desc;
		this.targetdate = targetdate;
		this.isdone = isdone;
	}
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
	public Date getTargetdate() {
		return targetdate;
	}
	public void setTargetdate(Date targetdate) {
		this.targetdate = targetdate;
	}
	public boolean isIsdone() {
		return isdone;
	}
	public void setIsdone(boolean isdone) {
		this.isdone = isdone;
	}
	@Override
	public String toString() {
		return String.format("Todo are  [id=%s, user=%s, desc=%s, targetdate=%s, isdone=%s]", id, user, desc, targetdate,
				isdone);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
