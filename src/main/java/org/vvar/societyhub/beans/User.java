package org.vvar.societyhub.beans;

public class User {
	String accName;
	int flatId;
	String accPass;
	String ownerName;
	double pendingDues;
	String profileImg;
	
	
	public User(String accName, int flatId, String accPass, String ownerName, double pendingDues, String profileImg) {
		this.accName = accName;
		this.flatId = flatId;
		this.accPass = accPass;
		this.ownerName = ownerName;
		this.pendingDues = pendingDues;
		this.profileImg = profileImg;
	}
	
	public String getAccName() {
		return accName;
	}
	
	public void setAccName(String accName) {
		this.accName = accName;
	}
	
	public int getFlatId() {
		return flatId;
	}
	
	public void setFlatId(int flatId) {
		this.flatId = flatId;
	}
	
	public String getAccPass() {
		return accPass;
	}
	
	public void setAccPass(String accPass) {
		this.accPass = accPass;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public double getPendingDues() {
		return pendingDues;
	}
	
	public void setPendingDues(double pendingDues) {
		this.pendingDues = pendingDues;
	}
	
	public String getProfileImg() {
		return profileImg;
	}
	
	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
}
