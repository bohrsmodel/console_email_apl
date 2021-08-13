package email;

//Java program to implement
//a Singly Linked List
//You need to use friendsClass that has following properties:
//Id, Name, currentMood, unreadMessages
public class friendsClass {

friendsNode head; // head of list

// Linked list friendsNode.
// This inner class is made static
// so that main() can access it
static class friendsNode {

   int ID;
   String Name;
   int currentMood;
   String unreadMessages;
   
   
   friendsNode next;

   // Constructor
   friendsNode(int d, String strName, int mood, String Message)
   {
       ID = d;
       Name =strName;
       currentMood= mood;
       unreadMessages = Message;
       
       next = null;
   }
}

// Method to insert a new friendsNode
public static friendsClass insert(friendsClass list, int ID, String Name, int Mood, String Message)
{
   // Create a new friendsNode with given data
   friendsNode new_node = new friendsNode(ID, Name, Mood, Message);
   new_node.next = null;

   // If the Linked List is empty,
   // then make the new friendsNode as head
   if (list.head == null) {
       list.head = new_node;
   }
   else {
       // Else traverse till the last friendsNode
       // and insert the new_node there
       friendsNode last = list.head;
       while (last.next != null) {
           last = last.next;
       }

       // Insert the new_node at last friendsNode
       last.next = new_node;
   }

   // Return the list by head
   return list;
}

// Method to print the friendsClass.
public static void printList(friendsClass list)
{
   friendsNode currNode = list.head;

   System.out.print("friendsClass: ");

   // Traverse through the friendsClass
   while (currNode != null) {
       // Print the data at current friendsNode
       System.out.print(currNode.ID + " "+ currNode.Name +" "+ currNode.currentMood+" "+ currNode.unreadMessages+ " ");

       // Go to next friendsNode
       currNode = currNode.next;
   }
}

// Driver code
public static void main(String[] args)
{
   /* Start with the empty list. */
   friendsClass list = new friendsClass();

   //
   // ******INSERTION******
   //

   // Insert the values
   list = insert(list, 1, "name1", 3, "hi");
   list = insert(list, 2, "name2", 4, "hello");
//   list = insert(list, 3);
  // list = insert(list, 4);
   //list = insert(list, 5);
   //list = insert(list, 6);
   //list = insert(list, 7);
   //list = insert(list, 8);

   // Print the friendsClass
   printList(list);
}
}
