package linkedlist;

public class MergeTwoSortedList {
	
	public Node mergeSortedList(Node p1, Node p2) {
		Node dummy = new Node(-1);
		Node tail = dummy;
		while(p1!= null && p2!=null) {
			if(p1.data < p2.data) {
				tail.next = p1;
				tail = p1;
				p1 = p1.next;
				
				
			}else {
				tail.next = p2;
				tail = p2;
				p2 = p2.next;
				
			}
			
		}
		tail.next = (p1 != null) ? p1 : p2;
		return dummy.next;
	}
	
	public static void main(String args[]) {
		//List 1
		Node p1 = new Node(1);
		p1.next = new Node(3);
		p1.next.next = new Node(5);
		p1.next.next.next = new Node(7);
		
		//List 2
		Node p2 = new Node(2);
		p2.next = new Node(4);
		p2.next.next = new Node(6);
		p2.next.next.next = new Node(8);
		
		MergeTwoSortedList obj = new MergeTwoSortedList();
		Node result = 
		obj.mergeSortedList(p1,p2);
		while(result!=null) {
			System.out.println(result.data);
			result = result.next;
		}
		
	}

}
