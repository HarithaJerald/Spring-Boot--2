package com.ust.me1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SuperHero {
	
	@Id
	private int sId;
	private String sName;
	private String sAbility;
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
	public String getsAbility() {
		return sAbility;
	}
	public void setsAbility(String sAbility) {
		this.sAbility = sAbility;
	}
	@Override
	public String toString() {
		return "SuperHero [sId=" + sId + ", sName=" + sName + ", sAbility=" + sAbility + "]";
	}
}
