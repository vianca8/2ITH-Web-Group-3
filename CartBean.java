package com.ust.model;

public class CartBean {
	private double local = 45;
	private double outside = 80;
	private double inter = 150;
	private double price = 1000;
	private double total1 = 0;
	private double total2 = 0;
	private double total3 = 0;
	
	public double getLocal() {
		return local;
	}
	public void setLocal(double local) {
		this.local = local;
	}
	public double getOutside() {
		return outside;
	}
	public void setOutside(double outside) {
		this.outside = outside;
	}
	public double getInter() {
		return inter;
	}
	public void setInter(double inter) {
		this.inter = inter;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotal1() {
		return total1;
	}
	public void setTotal1(double total1) {
		this.total1 = total1;
	}
	public double getTotal2() {
		return total2;
	}
	public void setTotal2(double total2) {
		this.total2 = total2;
	}
	public double getTotal3() {
		return total3;
	}
	public void setTotal3(double total3) {
		this.total3 = total3;
	}
	
	public void computeTotal() {
		setTotal1(price+local);
		setTotal2(price+outside);
		setTotal3(price+inter);
	}
	
	


}
