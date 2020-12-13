package com.ujy.bean;

public class PersonBean {
    private int pid;
    private String pname;
    private String address;
    private  CardBean card;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public CardBean getCard() {
		return card;
	}
	public void setCard(CardBean card) {
		this.card = card;
	}
	public PersonBean(int pid, String pname, String address, CardBean card) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.address = address;
		this.card = card;
	}
	public PersonBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PersonBean [pid=" + pid + ", pname=" + pname + ", address=" + address + ", card=" + card + "]";
	}
    
}
