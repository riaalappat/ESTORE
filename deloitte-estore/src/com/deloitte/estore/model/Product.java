package com.deloitte.estore.model;

public class Product {
	private int PID;
	private String PNAME;
	private float PRICE;
	
	public Product() {}

	
	

	public Product(int pID, String pNAME, float pRICE) {
		super();
		PID = pID;
		PNAME = pNAME;
		PRICE = pRICE;
	}




	public int getPID() {
		return PID;
	}

	public void setPID(int pID) {
		PID = pID;
	}

	public String getPNAME() {
		return PNAME;
	}

	public void setPNAME(String pNAME) {
		PNAME = pNAME;
	}

	public float getPRICE() {
		return PRICE;
	}

	public void setPRICE(float pRICE) {
		PRICE = pRICE;
	}

	@Override
	public String toString() {
		return "Product [PID=" + PID + ", PNAME=" + PNAME + ", PRICE=" + PRICE + "]";
	}
	
	
	

}
