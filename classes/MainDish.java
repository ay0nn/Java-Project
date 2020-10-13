package classes;
import java.lang.*;

public class MainDish extends FoodItem
{
	private String category;
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	public String getCategory()
	{
		return category;
	}
	public void showInfo()
	{
		System.out.println("FoodItem Id: "+getFid());
		System.out.println("FoodItem Name: "+getName());
		System.out.println("Category: "+ getCategory());
		System.out.println("FoodItem Available Quantity: "+getAvailableQuantity());
		System.out.println("FoodItem Price: "+getPrice());
		
		System.out.println("-------------------------------");
	}
}