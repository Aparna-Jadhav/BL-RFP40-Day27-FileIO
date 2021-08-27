package FileIO_Day27;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddressBook
{
	public static void main(String[] args) 
	{
		  Scanner in = new Scanner(System.in);

		  System.out.print("Welcome to Address book! \nPlease choose an option.");
		  System.out.print("\n");
		  System.out.print("\n1 - Add a new contact \n2 - Find existing contacts \n3 - Delete a contact \n4 - Show all contacts \n5 - Exit address book ");
		  System.out.print("\n");
		  System.out.print("\nChoose your option: ");

		  int option = in.nextInt();

		  if (option == 1)
		   Questions();
		  if (option == 2)
		   find();
		  if (option == 3)
		   delete("Deleted");
		  if (option == 4)
		   show();
		  if (option == 5)
		         exit();
		   
	}
	
	
	static void Questions() 
	{
			Scanner in = new Scanner(System.in);
			System.out.print("Please enter your First Name: ");
			String firstname = in.nextLine();
			System.out.println("Great job you've been added to the Address Book!");
			System.out.println("If you need to do anything else in the Address Book please restart the program.");

		
			File inFile = new File("C:\\Book.txt");
			File outFile = new File("C:\\Book1.txt");

			try {

				Scanner freader = new Scanner(inFile);
				BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
				String line;

				while (freader.hasNextLine())
				{
					line = freader.nextLine();
					writer.write(line);
					writer.newLine();
				}

		
				writer.write(firstname);
		 	 writer.newLine();

		 	 freader.close();
		 	 writer.close();

			} catch (IOException e) 
			{

				System.err.println(e);
				System.exit(1);

			}
			File inFileb = new File("C:\\Book.txt");
			File outFileb = new File("C:\\Book1.txt");

			try {

				Scanner freaderb = new Scanner(inFileb);
				BufferedWriter writerb = new BufferedWriter(
				new FileWriter(outFileb));
				String line;

				while (freaderb.hasNextLine()) 
				{
					line = freaderb.nextLine();
					writerb.write(line);
					writerb.newLine();
				}

				freaderb.close();
				writerb.close();

			} catch (IOException e) {

				System.err.println(e);
				System.exit(1);

			}

			int option;
			{
			}
		  }
		  
		  
		  static void find(){

			  Scanner in = new Scanner(System.in);
			  
			 System.out.println("Who would you like to search for: ");
			 String finds = in.nextLine();
			 

			 try {

			  BufferedReader reader = new BufferedReader(new FileReader ("C:\\Book.txt"));
			  
			  String line;

			  while ((line = reader.readLine())!= null) {
			   
			   int index = finds.indexOf(line);
			   
			   if (index > -1 ){
			    
			    System.out.println(line);
			   }
			   
			  }

			   
			  reader.close();

			 } catch (IOException e) {

			  System.err.println(e);
			  System.exit(1);
			}
			 } 
			 static void exit() {

			 System.out.println("You have successfully exited the Address Book!");
			 
			 }

			 static void delete(String name_delete)
			 {

			  Scanner in = new Scanner(System.in);
			  
			  System.out.println("Who would you like to delete: ");
			  String delete = in.nextLine();
			  
			  File inFile = new File("C:\\Book.txt");
			  File outFile = new File("C:\\Book1.txt");

			  try {

			   Scanner freader = new Scanner(inFile);
			   BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
			   String line;

			   while (freader.hasNextLine()) 
			   {
	
				    line = freader.nextLine();
				    
				   System.out.println(line);
				    
				    if (!line.equals(name_delete)){
				    
				    writer.write(line);
				    writer.newLine();
	
				   }
			   }

			   

			   freader.close();
			   writer.close();

			  } catch (IOException e)
			  {

			   System.err.println(e);
			   System.exit(1);

			  }
			 }

			 
			  
			 static void show(){
			 
			 Scanner in = new Scanner(System.in); 
			 System.out.println("Type in 'show' to see all the contacts.");
			 String shows = in.nextLine();
			 
			 try {

			  BufferedReader reader = new BufferedReader(new FileReader ("C:\\Book1.txt"));
			  
			  String line;

			  while ((line = reader.readLine())!= null) {
			   
			   int index = shows.indexOf(shows);
			   
			   if (index > -1 ){
			    
			    System.out.println(line);
			   }
			   
			  }

			   
			  reader.close();

			 } catch (IOException e) {

			  System.err.println(e);
			  System.exit(1);
			}
			 
			
		}
}

