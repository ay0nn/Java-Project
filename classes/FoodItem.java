package classes;
import interfaces.*;
import java.lang.*;

public abstract class FoodItem  implements IQuantity 
{
	private String fid;
	private String name;
	private int availableQuantity;
	private double price;
	
	
	public void setFid(String fid){
		this.fid = fid;}
	public void setName(String name){
		this.name = name;}
	public void setAvailableQuantity(int availableQuantity){
		this.availableQuantity = availableQuantity;}
	public void setPrice(double price){
		this.price = price;}

	
	public String getFid(){
		return fid;} 
	public String getName(){
		return name;}
	public int getAvailableQuantity(){
		return availableQuantity;} 
	public double getPrice(){
		return price;}
	
	public abstract void showInfo();
		
	
	
	public boolean addQuantity(int amount)
	{
		if(amount>0)
		{
			System.out.println("Previous Quantity: "+ availableQuantity);
			System.out.println("Deposit Amount: "+ amount);
			availableQuantity += amount;
			
			System.out.println("Current Added Quantity: "+ availableQuantity);
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean sell(int amount)
	{
		if(amount>0 && amount<=availableQuantity)
		{
			System.out.println("Previous Quantity:	"+ availableQuantity);
			System.out.println("Sold Quantity:	"+ amount);
			availableQuantity -= amount;
			
			System.out.println("Current Quantity:	"+ availableQuantity);
			return true;
		}
		else
		{
			return false;
		}
	}	
}