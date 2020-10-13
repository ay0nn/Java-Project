package interfaces;

import classes.FoodItem;

public interface FoodItemOperations
{
	boolean insertFoodItem(FoodItem fi);
	boolean removeFoodItem(FoodItem fi);
	FoodItem searchFoodItem(String fid);
	void showAllFoodItems();
}