package com.spring.project.product.vo;

public class ProductVO {
	
	private Integer pno;
	private String pName;
	private String image_file_url;
	private Integer price;
	private Integer discount;
	private String pCompany;
	private String pDate;
	private String screen_size;	
	private String screen_ratio;
	private String resolution;
	private String refresh_rate;
	private String terminals;
	private String power_consumption;
	private String weight;
	private Character exp;
	
	public String getScreen_size() {
		return screen_size;
	}
	public void setScreen_size(String screen_size) {
		this.screen_size = screen_size;
	}
	
	public Integer getPno() {
		return pno;
	}
	public void setPno(Integer pno) {
		this.pno = pno;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getImage_file_url() {
		return image_file_url;
	}
	public void setImage_file_url(String image_file_url) {
		this.image_file_url = image_file_url;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public String getpCompany() {
		return pCompany;
	}
	public void setpCompany(String pCompany) {
		this.pCompany = pCompany;
	}
	public String getpDate() {
		return pDate;
	}
	public void setpDate(String pDate) {
		this.pDate = pDate;
	}
	public String getScreen_ratio() {
		return screen_ratio;
	}
	public void setScreen_ratio(String screen_ratio) {
		this.screen_ratio = screen_ratio;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public String getRefresh_rate() {
		return refresh_rate;
	}
	public void setRefresh_rate(String refresh_rate) {
		this.refresh_rate = refresh_rate;
	}
	public String getTerminals() {
		return terminals;
	}
	public void setTerminals(String terminals) {
		this.terminals = terminals;
	}
	public String getPower_consumption() {
		return power_consumption;
	}
	public void setPower_consumption(String power_consumption) {
		this.power_consumption = power_consumption;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public Character getExp() {
		return exp;
	}
	public void setExp(Character exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "ProductVO [pno=" + pno + ", pName=" + pName + ", image_file_url=" + image_file_url + ", price=" + price
				+ ", discount=" + discount + ", pCompany=" + pCompany + ", pDate=" + pDate + ", screen_size="
				+ screen_size + ", screen_ratio=" + screen_ratio + ", resolution=" + resolution + ", refresh_rate="
				+ refresh_rate + ", terminals=" + terminals + ", power_consumption=" + power_consumption + ", weight="
				+ weight + ", exp=" + exp + "]";
	}
	
	
	
}
