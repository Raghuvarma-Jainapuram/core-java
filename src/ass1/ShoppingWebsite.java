package ass1;

import java.util.ArrayList;

class Customer{
	int id;
	String name;
	double walletBalance;
	String address;
	
	public Customer() {
		
	}
}

class Item{
	int id;
	String name;
	String companyName;
	double price;
	boolean isInStock;
	
	public Item() {
		
	}
}
public class ShoppingWebsite {

	public String purchaseItem() throws Exception{
		return "String";
	}
	
	public static void main(String[] args) throws Exception{
		ShoppingWebsite obj = new ShoppingWebsite();
		
		ArrayList<String> cusDet = new ArrayList<>();
		cusDet.add("927392");
		cusDet.add("Steve");
		cusDet.add("5000.0");
		cusDet.add("USA");
		
		ArrayList<String> itemDet = new ArrayList<>();
		itemDet.add("27392");
		itemDet.add("T-Shirt");
		itemDet.add("US polo");
		itemDet.add("800");
		itemDet.add("true");
		
		Customer c = new Customer();
		Item i = new Item();
		
		obj.purchaseItem();
		System.out.println(cusDet);
		System.out.println(itemDet);
	}

}
