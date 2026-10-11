package linkedlist;

public class RemoveNthNodeFromEnd {
	
	
	public Node removeNodeEnd(Node head, int n) {
		Node curr = head;
		Node dummy = new Node(-1);
		dummy.next = head;
		
		Node slow = dummy;
		Node fast = dummy;
		for(int i = 0;i<n+1;i++) {
			fast = fast.next;
		}
		while(fast != null) {
			slow = slow.next;
			fast = fast.next;
			
		}
		slow.next = slow.next.next;
		
		return dummy.next;
	}

	public static void main(String args[]) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		n1.next = n2;
	    n2.next = n3;
	    n3.next = n4;
	    n4.next = n5;
	    
	    RemoveNthNodeFromEnd obj = new RemoveNthNodeFromEnd();
	    Node result = obj.removeNodeEnd(n1, 2);
	    System.out.println(result.data);
	}
}
