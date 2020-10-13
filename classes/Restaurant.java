package classes;
import interfaces.*;
import java.lang.*;

public class Restaurant implements FoodItemOperations
{
	private String rid;
	private String name;
	private FoodItem foodItems[] = new FoodItem [20];
	
	
	public void setRid(String rid){this.rid = rid;}
	public void setName(String name){this.name = name;}
	

	
	public String getRid(){return rid;} 
	public String getName(){return name;}
	
	
	public boolean insertFoodItem(FoodItem fi)
	{
		boolean flag = false;
		for(int i=0; i<foodItems.length; i++)
		{
			if(foodItems[i] == null)
			{
				foodItems[i] = fi;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeFoodItem(FoodItem fi)
	{
		boolean flag = false;
		for(int i=0; i<foodItems.length; i++)
		{
			if(foodItems[i] == fi)
			{
				foodItems[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public void showAllFoodItems()
	{
		System.out.println("//////////////////////////////////");
		for(int i=0; i<foodItems.length; i++)
		{
			if(foodItems[i] != null)
			{	
				foodItems[i].showInfo();
			}
		}
		System.out.println("//////////////////////////////////");
	}
	public FoodItem searchFoodItem(String fid)
	{
		FoodItem fi = null;
		
		for(int i=0; i<foodItems.length; i++)
		{
			if(foodItems[i] != null)
			{
				if(foodItems[i].getFid().equals(fid))
				{
					fi = foodItems[i];
					break;
				}
			}
		}
		return fi;
	}
	 
}