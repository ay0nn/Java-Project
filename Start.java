import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;


public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FoodCourt fc = new FoodCourt();
		Restaurant rc = new Restaurant();
		
		
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("*********************************");
		System.out.println("WelCome to Food Court Management");
		System.out.println("*********************************");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Restaurant Management");
			System.out.println("\t3. Restaurant FoodItem Management");
			System.out.println("\t4. FoodItem Quantity Add-Sell");
			System.out.println("\t5. Exit");
			System.out.println("*********************************");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				
					System.out.println("*********************************");
					System.out.println("You have chose Employee Management");
					System.out.println("*********************************");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Search an Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter your Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
							
							System.out.println("*********************************");
							System.out.println("You have chose to Insert New Employee");
							System.out.println("*********************************");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(fc.insertEmployee(e1)){ System.out.println("Employee Created With ID: " + e1.getEmpId());}
							else{ System.out.println("Employee can not be created"); }
							System.out.println("*********************************");
							
							break;
							
						case 2:
							
							System.out.println("*********************************");
							System.out.println("You have chose to Remove An Employee");
							System.out.println("*********************************");
							
							System.out.print("Enter the Employee ID to Remove: ");
							String empId2 = sc.next();
							
							Employee e2 = fc.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(fc.removeEmployee(e2))
								{
									System.out.println("Employee with "+ e2.getEmpId() + " has been removed");
								}
								else
								{
									System.out.println("Employee Can Not be Removed");
								}
							}
							else
							{
								System.out.println("Employee Does Not Exists");
							}
							
							break;
							
						case 3:
							
							System.out.println("*********************************");
							System.out.println("You have chose to Search An Employee");
							System.out.println("*********************************");
							
							System.out.print("Enter the Employee ID to search: ");
							String empId3 = sc.next();
							
							Employee e3 = fc.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee Found");
								System.out.println("Employee ID: "+e3.getEmpId());
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee Salary: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exists");
							}
							
							break;
							
						case 4:
							
							System.out.println("*********************************");
							System.out.println("You have chose to See All Employees");
							System.out.println("*********************************");
							
							fc.showAllEmployees();

							break;
					
						case 5:
							
							System.out.println("*********************************");
							System.out.println("Going Back...............");
							System.out.println("*********************************");
							break;
						default:
							
							System.out.println("*********************************");
							System.out.println("Invalid Option...............");
							System.out.println("*********************************");
							break;
					}
					break;
					
		case 2:
					System.out.println("*********************************");
					System.out.println("You have chose Resraurant Management");
					System.out.println("*********************************");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Restaurant");
					System.out.println("\t2. Remove Existing Restaurant");
					System.out.println("\t3. Search a Restaurant");
					System.out.println("\t4. Show All Restaurants");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter your Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
							
							System.out.println("*********************************");
							System.out.println("You have chose to Insert New Restaurant");
							System.out.println("*********************************");
							
							System.out.print("Enter Restaurant ID: ");
							String rid1 = sc.next();
							System.out.print("Enter Restaurant Name: ");
							String name1 = sc.next();
							
							
							Restaurant r1 = new Restaurant();
							r1.setRid(rid1);
							r1.setName(name1);
							
							
							if(fc.insertRestaurant(r1)){ System.out.println("Restaurant Created With ID: " + r1.getRid());}
							else{ System.out.println("Restaurant can not be created"); }
							System.out.println("*********************************");
							
							break;
							
						case 2:
							
							System.out.println("*********************************");
							System.out.println("You have chose to Remove A Restaurant");
							System.out.println("*********************************");
							
							System.out.print("Enter the Restaurant ID to Remove: ");
							String rid2 = sc.next();
							
							Restaurant r2 = fc.searchRestaurant(rid2);
							
							if(r2 != null)
							{
								if(fc.removeRestaurant(r2))
								{
									System.out.println("Restaurant with "+ r2.getRid() + " has been removed");
								}
								else
								{
									System.out.println("Restaurant Can Not be Removed");
								}
							}
							else
							{
								System.out.println("Restaurant Does Not Exists");
							}
							
							break;
							
						case 3:
							
							System.out.println("*********************************");
							System.out.println("You have chose to Search A Restaurant");
							System.out.println("*********************************");
							
							System.out.print("Enter the Restaurant ID to search: ");
							String rid3 = sc.next();
							
							Restaurant r3 = fc.searchRestaurant(rid3);
							
							if(r3 != null)
							{
								System.out.println("Restaurant Found");
								System.out.println("Restaurant ID: "+r3.getRid());
								System.out.println("Restaurant Name: "+r3.getName());
								
							}
							else
							{
								System.out.println("Restaurant Does Not Exists");
							}
							
							break;
							
						case 4:
							
							System.out.println("*********************************");
							System.out.println("You have chose to See All Restaurants");
							System.out.println("*********************************");
							
							fc.showAllRestaurants();

							break;
					
				case 5:
							
							System.out.println("*********************************");
							System.out.println("Going Back...............");
							System.out.println("*********************************");
							break;
							
					
					
					
				default:
					System.out.println("*********************************");
					System.out.println("Invalid Choice...............");
					System.out.println("*********************************");
					break;
					}
	
	break;
	

case 3:
					System.out.println("*********************************");
					System.out.println("You have chose Restaurant FoodItem Management");
					System.out.println("*********************************");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New FoodItem");
					System.out.println("\t2. Remove Existing FoodItem");
					System.out.println("\t3. Search a FoodItem");
					System.out.println("\t4. Show All FoodItems");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter your Option: ");
					int option3 = sc.nextInt();
					
			switch(option3)
					{
						case 1:
							
							System.out.println("*********************************");
							System.out.println("You have chose to Insert New FoodItem");
							System.out.println("*********************************");
							
							System.out.println("Enter Restaurant Id: ");
							String rid1 =sc.next();
							
							
						if(fc.searchRestaurant(rid1) != null)
							{
								System.out.println("\tWhat type of FoodItem do you want to add?");
								System.out.println("\t1. MainDish");
								System.out.println("\t2. Appitizers");
								System.out.println("\t3. Go Back");
								
								System.out.print("Enter FoodItem Type: ");
								int foodItemType = sc.nextInt();
								
								if(foodItemType == 1)
								{
									System.out.print("Enter FoodItem Id : ");
									String fid1 = sc.next();
									System.out.print("Enter Category: ");
									String category1 = sc.next();
									System.out.print("Enter FoodItem Name : ");
									String name1 = sc.next();
									System.out.print("Enter FoodItem Available Quantity : ");
									int availableQuantity1 = sc.nextInt();
									System.out.print("Enter FoodItem Price : ");
									double price1 = sc.nextDouble();
									
									
									MainDish md = new MainDish();
									md.setFid(fid1);
									md.setCategory(category1);
									md.setName(name1);
									md.setAvailableQuantity(availableQuantity1);
									md.setPrice(price1);
									
									
									if(fc.searchRestaurant(rid1).insertFoodItem(md))
									{
										System.out.println("FoodItem Inserted for "+ rid1 + " with Food Id   " + fid1);
									}
									else
									{
										System.out.println("FoodItem Can Not Be Inserted");
									}
									
									
								}
				else if(foodItemType == 2)
								{
									System.out.print("Enter FoodItem Id : ");
									String fid1 = sc.next();
									System.out.print("Enter Size: ");
									String size1 = sc.next();
									System.out.print("Enter FoodItem Name : ");
									String name1 = sc.next();
									System.out.print("Enter FoodItem Available Quantity : ");
									int availableQuantity1 = sc.nextInt();
									System.out.print("Enter FoodItem Price : ");
									double price1 = sc.nextDouble();
									
									
									Appitizers ap = new Appitizers();
									ap.setFid(fid1);
									ap.setSize(size1);
									ap.setName(name1);
									ap.setAvailableQuantity(availableQuantity1);
									ap.setPrice(price1);
									
									
								if(fc.searchRestaurant(rid1).insertFoodItem(ap))
									{
										System.out.println("FoodItem Appitizers Inserted for "+ rid1 + " with FoodItem Id   " + fid1);
									}
									else
									{
										System.out.println("FoodItem Can Not Be Inserted");
									}
								}
								else if(foodItemType == 3)
								{
									System.out.println("Going Back.........");
								}
								else
								{
									System.out.println("Invalid FoodItem Type");
								}
							}
							else
							{
								System.out.println("Restaurant ID MISMATCH");
							}
							
							break;
							
							
							
			case 2:
							
							System.out.println("*********************************");
							System.out.println("You have chose to Remove A FoodItem");
							System.out.println("*********************************");
							
							
							System.out.println("Enter Restaurant Id: ");
							String rid3 =sc.next();
							
			if(fc.searchRestaurant(rid3) != null){		
								System.out.println("\tWhat type of FoodItem do you want to remove?");
								System.out.println("\t1. MainDish");
								System.out.println("\t2. Appitizers");
								System.out.println("\t3. Go Back");
								
								System.out.print("Enter FoodItem Type: ");
								int foodItemType = sc.nextInt();
								
				if(foodItemType == 1)
								{
							
							System.out.print("Enter the FoodItem ID to Remove: ");
							String fid3 = sc.next();
						
							FoodItem fi3 = rc.searchFoodItem(fid3);
							
							if(fi3 != null)
							{
								if(fc.searchRestaurant(rid3).removeFoodItem(fi3))
								{
									System.out.println("FoodItem with "+ fi3.getFid() + " has been removed");
								}
								else
								{
									System.out.println("FoodItem Can Not be Removed");
								}
							}
							else
							{
								System.out.println("FoodItem Does Not Exists");
							}
							
							break;
				
								
								}
					else if(foodItemType == 2)
								System.out.print("Enter the FoodItem ID to Remove: ");
							String fid3 = sc.next();
							
							FoodItem fi3 = rc.searchFoodItem(fid3);
							
							if(fi3 != null)
							{
								if(rc.removeFoodItem(fi3))
								{
									System.out.println("FoodItems with "+ fi3.getFid() + " has been removed");
								}
								else
								{
									System.out.println("FoodItems Can Not be Removed");
								}
							}
							else
							{
								System.out.println("FoodItems Does Not Exists");
							}
							break;
			}
			else{
					System.out.println("Invalid Input type");
				}	
					break;		
							
					case 3:
							
							System.out.println("*********************************");
							System.out.println("You have chose to Search A FoodItem");
							System.out.println("*********************************");
							
							
							System.out.print("Enter the FoodItem ID to search: ");
							String fid4 = sc.next();
							
							FoodItem fi4 = rc.searchFoodItem(fid4);
							
							if(fi4 != null)
							{
								System.out.println("FoodItem Found");
								System.out.println("FoodItem ID: "+fi4.getFid());
								System.out.println("FoodItem Name: "+fi4.getName());
								System.out.println("FoodItem Available Quantity: "+fi4.getAvailableQuantity());
								System.out.println("FoodItem Price: "+fi4.getPrice());
								
							}
							else
							{
								System.out.println("FoodItem Does Not Exists");
							}
							
							break;
							
						case 4:
							
							System.out.println("*********************************");
							System.out.println("You have chose to See All FoodItems");
							System.out.println("*********************************");
							
							rc.showAllFoodItems();
							break;
					case 5:
							System.out.println("*********************************");
							System.out.println("You Choose to Go Back.......");
							System.out.println("*********************************");
							
							
							break;
							
						default:
							System.out.println("*********************************");
							System.out.println("Invalid Choice.....");
							break;
						
					
					
					}

						break;
						
						
						
case 4:
					System.out.println("*********************************");
					System.out.println("You Choose FoodItem Quantity Add-Sell");
					System.out.println("*********************************");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Add Fooditem");
					System.out.println("\t2. Sell FoodItem");
					System.out.println("\t3. Show Add-Sell History");
					System.out.println("\t4. Go Back");
					
					System.out.print("Enter You Option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1: 
							
							System.out.println("*********************************");
							System.out.println("You Choose to Add FoodItem");
							System.out.println("*********************************");
							
							System.out.print("Enter Restaurant RID: ");
							String rid1 = sc.next();
							
							if(fc.searchRestaurant(rid1) != null)
							{
								System.out.print("Enter FoodItem ID: ");
								String fid1 = sc.next();
								
								if(fc.searchRestaurant(rid1).searchFoodItem(fid1) != null)
								{
									System.out.print("Enter Qunatity of Fooditems to Add: ");
									int am = sc.nextInt();
									
									if(fc.searchRestaurant(rid1).searchFoodItem(fid1).addQuantity(am))
									{
										System.out.println("Adding Successfull");
										frwd.writeInFile("Added Quantity: "+ am +" in FoodItem Number " + fid1 + " by " + rid1);
									}
									else
									{
										System.out.println("Can Not Add");
									}
								}
								else
								{
									System.out.println("Invalid FoodItem Number");
								}
								
							}
							else
							{
								System.out.println("Restaurant ID MISMATCH");
							}
							
							break;
							
						case 2:
							System.out.println("*********************************");
							System.out.println("You Choose to Sell FoodItem");
							System.out.println("*********************************");
							
							System.out.print("Enter Restaurant RID: ");
							String rid2 = sc.next();
							
							if(fc.searchRestaurant(rid2) != null)
							{
								System.out.print("Enter FoodItem ID: ");
								String fid1 = sc.next();
								
								if(fc.searchRestaurant(rid2).searchFoodItem(fid1) != null)
								{
									System.out.print("Enter Qunatity of Fooditems to Sell: ");
									int sl = sc.nextInt();
									
									if(fc.searchRestaurant(rid2).searchFoodItem(fid1).sell(sl))
									{
										System.out.println("Sold Successfull");
										frwd.writeInFile("Selling Quantity: "+ sl +" in FoodItem Number " + fid1 + " by " + rid2);
									}
									else
									{
										System.out.println("Can Not Sell");
									}
								}
								else
								{
									System.out.println("Invalid FoodItem Number");
								}
								
							}
							else
							{
								System.out.println("Restaurant ID MISMATCH");
							}
						
							break;
							
						case 3:
							
							System.out.println("---------------------------------");
							System.out.println("You Choose See Transaction History");
							System.out.println("---------------------------------");
							
							frwd.readFromFile();
							
							break;
							
						case 4:
						
							break;
							
						default:
						
							break;
					}
					
					break;
					
				
				case 5:
					System.out.println("*********************************");
					System.out.println("You Choose Exit");
					System.out.println("*********************************");
					repeat = false;
					break;
				
				default:
					System.out.println("*********************************");
					System.out.println("Invalid Choice.....");
					break;
			}
			System.out.println("***********************************\n");
		}
	
}
}	
		