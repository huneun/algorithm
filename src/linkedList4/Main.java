package linkedList4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> product = new LinkedList<Integer>();
		
		product.addPhone(123);
		product.addPhone(456);
		product.addPhone(789);
		
		product.printAll();
		
		product.setBetween(951, 456);
		product.printAll();
		
	}

}
