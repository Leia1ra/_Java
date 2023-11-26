package KDT.KDT_assignment.javaProject1;

import java.util.Calendar;

public class ProductVO {
	private int prdNo;
	public int getPrdNo() {
		return this.prdNo;
	} public void setPrdNo(int prdNo) {
		this.prdNo = prdNo;
	}

	private String prdName;
	public String getPrdName() {
		return this.prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	
	private int prdPrice;
	public int getPrdPrice() {
		return this.prdPrice;
	}
	public void setPrdPrice(int prdPrice) {
		this.prdPrice = prdPrice;
	}


	private Calendar prdYear;
	public Calendar getPrdYear() {
		return this.prdYear;
	}
	public void setPrdYear(Calendar prdYear) {
		this.prdYear = prdYear;
	}
	public void setPrdYear(Calendar prdYear, int year) {
		this.setPrdYear(prdYear);
		this.prdYear.set(Calendar.YEAR, year);
	}

	private String prdMaker;
	public String getPrdMaker() {
		return this.prdMaker;
	}
	public void setPrdMaker(String prdMaker) {
		this.prdMaker = prdMaker;
	}

	public ProductVO() {

	}
	public ProductVO(int prdNo, String prdName, int prdPrice, Calendar prdYear, String prdMaker) {
		setPrdNo(prdNo);
		setPrdName(prdName);
		setPrdPrice(prdPrice);
		setPrdYear(prdYear);
		setPrdMaker(prdMaker);
	}

	public String toString(){
		return String.format("%03d %10s %10d %8d\t%s",prdNo, prdName, prdPrice, prdYear.get(Calendar.YEAR), prdMaker);
	}
}
