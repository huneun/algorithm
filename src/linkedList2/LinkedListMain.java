package linkedList2;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BilliardBall<Integer> billiardBall = new BilliardBall<Integer>();
		
		billiardBall.addBall(3);
		billiardBall.addBall(4);
		billiardBall.addBall(1);
		
		billiardBall.printAll();
	}

}