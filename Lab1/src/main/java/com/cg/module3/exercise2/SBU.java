package com.cg.module3.exercise2;

public class SBU {

	public SBU() {
		// TODO Auto-generated constructor stub
	}
    private int sbuId;
    private String sbuName;
    private String sbuHead;
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public String toString()
	{
		return "SBU Deatils:  [ sbuId:  "+sbuId+", sbuHead:  "+sbuHead+", sbuName:  "+sbuName+"]";
	}
}
