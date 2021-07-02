package com.shobhit.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Alien {
	
	@Id
	public int aid;
	public String aname;
	public Alien()
	{
		
	}
	public Alien(int aid, String aname) {
		this.aid = aid;
		this.aname = aname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return aid+aname;
		//return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}
	
	
}
