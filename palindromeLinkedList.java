/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/
import java.util.*;
public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		//Your code goes here
        Stack<LinkedListNode> stk = new Stack<LinkedListNode>();
        LinkedListNode ptr = head;
        while (ptr != null) {
            stk.push(ptr);
            ptr = ptr.next;
        }
 
        LinkedListNode temp = head;
        while (stk.size() > 0 && temp!=null) {
            if(!(stk.pop().data.equals(temp.data)))
            	return false;
            temp=temp.next;
        }
               
    	return true;
	}

}
