package com.model;

public class Book {
	private int bid;
	private String bname,bAuthor,bcategory;
	private float bPrice;
	public int getbid() {
		return bid;
	}
	public void setbid(int bid) {
		this.bid = bid;
	}
	public String getbname() {
		return bname;
	}
	public void setbname(String bname) {
		this.bname = bname;
	}
	public String getbAuthor() {
		return bAuthor;
	}
	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}
	public String getbcategory() {
		return bcategory;
	}
	public void setbcategory(String bcategory) {
		this.bcategory = bcategory;
	}
	public float getbPrice() {
		return bPrice;
	}
	public void setbPrice(float bPrice) {
		this.bPrice = bPrice;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", bAuthor=" + bAuthor + ", bcategory=" + bcategory
				+ ", bPrice=" + bPrice + "]";
	}
	

}
