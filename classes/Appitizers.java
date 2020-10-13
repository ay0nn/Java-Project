package classes;
import java.lang.*;

public class Appitizers extends FoodItem
{
	private String size;
	
	public void setSize(String size)
	{
		this.size = size;
	}
	public String getSize()
	{
		return size;
	}
	public void showInfo()
	{
		System.out.println("FoodItem Id: "+getFid());
		System.out.println("FoodItem Name: "+getName());
		System.out.println("Category: "+ getSize());
		System.out.println("FoodItem Available Quantity: "+getAvailableQuantity());
		System.out.println("FoodItem Price: "+getPrice());
		
		System.out.println("-------------------------------");
	}
}