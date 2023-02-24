public class Node
{
   //fields
   public Node next;//next node in the chain
   public Entry value;//the value that the node contains. [restriction] cannot declare it of type "object".
   
   //constructor
   public Node(Entry input)
   {
      this.value = input;
   }
   
   
   //returns true if the node contains a value
   public Boolean contains(String input)
   {
      if (this.value.TEXT == input) //returns the value as true
      {
         return true;
      }
      else if (this.next != null)
      {
         this.next.contains(input);
      }
      else
      {
         return false;
      }
      return false;
   }
   
   //prints the linkedlist to standard out [restriction] must be recursive
   public void print()
   {
      if (this.next != null)
      {
         System.out.println(this.value.KEY + "," + this.value.TEXT);
         this.next.print();
      }
      else
      {
         System.out.println(this.value.KEY + "," + this.value.TEXT);
         return;
      }
   }
   
}
//buckets need to be part of the linkedlist
//update list to accept entries