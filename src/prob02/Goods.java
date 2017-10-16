package prob02;

public class Goods {
	
	private String name = "default";
	private int price =0;
	private int countStock =0;
	
	public Goods(){
		this.name = "default";
		this.price = 0;
		this.countStock = 0;
		
	} 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
}
