package linkedlist;

public class PartitionList {

	public Node partitionList(Node head, int x) {

		Node small = new Node(-1);
		Node big = new Node(-1);
		Node tailsmall = small;
		Node tailbig = big;

		Node curr = head;
		while (curr != null) {
			if (curr.data < x) {
				tailsmall.next = curr;
				tailsmall = tailsmall.next;

			} else {
				tailbig.next = curr;
				tailbig = tailbig.next;
			}

			curr = curr.next;
		}

		tailbig.next = null;
		tailsmall.next = big.next;
		return small.next;

	}

	public static void main(String args[]) {
		Node n1 = new Node(1);
		Node n2 = new Node(4);
		Node n3 = new Node(2);
		Node n4 = new Node(4);
		Node n5 = new Node(5);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		PartitionList obj = new PartitionList();
		Node res = obj.partitionList(n1, 3);
		
		while (res != null) {
			System.out.println(res.data +" ");
			res = res.next;
		}
	}
}
