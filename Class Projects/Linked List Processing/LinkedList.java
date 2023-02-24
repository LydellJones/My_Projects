import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
class LinkedList
{
   private Node head;
   private Node tail;
   
   public String about()//displays a message about me also you're lucky I'm nice
                        //you displayed nothing about this method being O(1)  (-w-)
   {
      
      return   "8888888888888888\n"+
               "8-____----____-8\n"+
               "--____----____--\n"+
               "-|____|==|____|-\n"+
               "----------------\n"+
               "----_______-----\n"+
               "----------------\n"+
               "My name is Lydell and I've been programming for about\n"+
               "6 years or so and I know the language I wrote this file\n"+
               "from plus about 3 more ... fluently enough.";
   }
   
   public void addHead(Entry value)//adds a node object to the front of the linkedlist
   {
      Node add = new Node(value);
      
      if (this.isEmpty())
      {
         this.head = add;
         this.tail = add;
      }    
      else
      {
         add.next = this.head;
         this.head = add;
      }        
   }
   
   public void addTail(Entry value)//adds a node object to the end of the linkedlist
   {
   
      Node add = new Node(value);
      
      if (this.isEmpty())
      {
         this.head = add;
         this.tail = add;
      }
      else
      {
         this.tail.next = add;
         this.tail = add;
      }
      
   }
   
   public Entry removeHead() //removes an item in the front of the list
   {
   
      Entry result = this.head.value;
      
      this.head = this.head.next;
      
      if (this.head == null)
      {
         this.tail = null; 
      }
      
      return result;
   }
   
   public Entry peekHead()
   {
   
      if (this.head.value != null)
      {
         return this.head.value; //returns the string of the head of the linked list
      }
      else
      {
         return null;
      }
      
   }
   
   public boolean isEmpty()//returns whether the linkedlist is empty
   {
      if(this.head == null && this.tail == null)
      {
         return true;
      }
      else
      {
         return false;
      }
         
   }
   
   public boolean contains(String value)//searches for a given value and returns true or false if found
   {
      return this.tail.contains(value);
   }
   
   public void print()//prints the linked list starting from the head
   {
      this.head.print();
   }      
   
}