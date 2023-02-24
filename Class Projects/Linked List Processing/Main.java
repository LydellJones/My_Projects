import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Main 
{
      
   public static void main(String[] args)
   {
      LinkedList filecontent = new LinkedList(); //stores the result and file content
      LinkedList[] buckets = new LinkedList[10]; //contains the bucket
      Entry holding;//entry temporary storage
      int bucketindex, bucketpass = 0;
      // bucketindex ->indexing for the buckets
      // bucketpass ->holds the 1st number of the file signaling the passes
      
      
      for (int i = 0; i < 10; i++) //initializing the buckets
      {
         buckets[i] = new LinkedList();
      }
             
   
      try //transfer the content to filecontent
      {  
         System.out.print("Welcome, please enter the file name (include .txt):");
         
         
         Scanner input = new Scanner(System.in);
         final File DATA = new File(input.nextLine());   //!!!!EDIT THIS TO CHANGE THE FILE!!!!!
         final Scanner scan = new Scanner(DATA);      
         
         
         System.out.println("Transfering file to LinkedList...");
         
         
         if (scan.hasNext() == false) throw new FileNotFoundException("file empty");// if the file is empty throws exception
         
         bucketpass = Integer.parseInt(scan.nextLine());
         String[] currentsplit = new String[2];
         String current = "";
         
         while (scan.hasNextLine())//splits the string into text and key and collects them into filecontent
         {
            current = scan.nextLine();
            
            
            if (!(current.contains(",")))
            {
               break;
            }
            else 
            {
               currentsplit = current.split(",");
               filecontent.addTail(new Entry(currentsplit[0], currentsplit[1]));
            }  
                  
                  
                  
         } 
         
         
         System.out.println("File transfer success!");
         
      }
      catch (FileNotFoundException e) //file error handler
      {
         System.out.println("!!FILE PROBLEM PLEASE SEE BELOW!!\n\n");
         e.printStackTrace();
      }      
      
      
      
      
      for (int pass = bucketpass - 1; pass >= 0; pass--) //loops the amount listed on the 1st line
      {
         
         
         while (!(filecontent.isEmpty())) //stores entry in specified bucket for each pass
         {
            holding = filecontent.removeHead(); 
            bucketindex = (holding.KEY.charAt(pass)) - '0'; 
            buckets[bucketindex].addTail(holding);
         }
         
         
         
         for (int i = 0; i < 10; i++) //empties the bucket back into filecontent
         {
         
            while (!(buckets[i].isEmpty()))
            {
               filecontent.addTail(buckets[i].removeHead());
            }
            
         }
         
      } 
      
      
      filecontent.print(); //prints the sorted contents
   }
}