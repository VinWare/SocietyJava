package org.vvar.societyhub.beans;

public class Issue {
	public Issue(String date, String desc, String related) {
		this.date = date;
		this.desc = desc;
		this.related = related;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getRelated() {
		return related;
	}
	
	public void setRelated(String related) {
		this.related = related;
	}
	
	private String date, desc,related;
}
