package DiscountCalculator;

public class DiscountCalculator {

	private String name;
	private double price;
	private double discountPrice;
	public DiscountCalculator(String name, double price, double discountPrice) {
		super();
		this.name = name;
		this.price = price;
		this.discountPrice = discountPrice;
	}
	public DiscountCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	@Override
	public String toString() {
		return "DiscountCalculator [name=" + name + ", price=" + price + ", discountPrice=" + discountPrice + "]";
	}
	
	public double discountAmountCalculation(){
		
		double discountAmount = price * (discountPrice/100);
		return discountAmount;
	}
	
	public double calculateFinalPrice() {
        return price - discountAmountCalculation();
        
    }
}
