package com.cjc.web.crud.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Student {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Id
	private int sId;
	private String sName;
	private String sAddress;
	private int sMarks;
	private long sMobno;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public int getsMarks() {
		return sMarks;
	}
	public void setsMarks(int sMarks) {
		this.sMarks = sMarks;
	}
	public long getsMobno() {
		return sMobno;
	}
	public void setsMobno(long sMobno) {
		this.sMobno = sMobno;
	}
	
	

}
