package com.ujy.bean;

public class CardBean {
	 private int cid;
	 private String cnum;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCnum() {
		return cnum;
	}
	public void setCnum(String cnum) {
		this.cnum = cnum;
	}
	public CardBean(int cid, String cnum) {
		super();
		this.cid = cid;
		this.cnum = cnum;
	}
	public CardBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CardBean [cid=" + cid + ", cnum=" + cnum + "]";
	}
	 
}