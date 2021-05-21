public class Main {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();

		linkedList.append(2);
		linkedList.append(4);
		linkedList.prepend(1);
		linkedList.indexInsertion(0,0);
		linkedList.indexInsertion(5,4);
		linkedList.indexInsertion(3,3);
		System.out.println(linkedList);
		linkedList.reverse();
		System.out.println(linkedList);
	}
} 
