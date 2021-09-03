package linkedList2;


public class BilliardBall<T> {
	
	Ball<T> firstBall = null;
	//�������� ����
	//�ʿ��� ����,���� 
	//����1 -> ��ü ���� ��ü�� �ɹ������� �ڱ� �ڽ��� �����Ͽ� ��ü�� �ñ״��� ������ ����� �̰��� �ν��Ͻ��Ͽ� �� ��ü�� ������ �� ��Ÿ���� �ִ� ���� ������ ���̵Ǿ�� �ϴ� �ּ� ������ �����Ѵ�. 
	//����2 -> �����͸� ���� ������ �ɹ������� �Ѵ�. 
	
	
	public class Ball<T>{
		
		Ball<T> address;
		T ballNumber;
		
		public Ball(T ballNumber) {
			this.ballNumber = ballNumber;
		}

	}
	
	//�̴������� �̰�ü�� ������ ����� �޼ҵ尡 �ʿ��ϴ�.
	
	public void addBall(T ballNumber) {
		if(firstBall == null) {
			firstBall = new Ball<T>(ballNumber);
		}else {
			Ball<T> newBall = this.firstBall;
			while(newBall.address != null) {
				newBall = newBall.address;
			}
			newBall.address = new Ball<T>(ballNumber);
		}
	}
	
	public void printAll() {
		if(firstBall != null) {
			Ball<T> ball = this.firstBall;
			System.out.println("ù��° ���� "+ball.ballNumber+"������ ������� ");
			while(ball.address != null) {
				ball = ball.address;
				System.out.println(ball.ballNumber + "�� ��");
			}		
		}
	}
	
//	public Ball<T> first = null;
//	
//	public class Ball<T>{
//		T number;
//		Ball<T> next = null; // ��Ŭ�� ���ϰ� ����, �ڱ� �ڽ��� Ÿ���� ���� �ɹ� ������ �����ϸ� ��ü�� ȣ��Ǵ� ������ �ɹ� ������ ����Ǳ� ������ ������ ������ ������ ���� ������ �ȴ�.
//		
//		public Ball(T number){
//			this.number = number;
//		}		
//	}
//
//	
//	public void addBall(T number) {
//		if(first == null) {
//			first = new Ball<T>(number);
//		}else {
//			Ball<T> spot = this.first;
//			while(spot.next != null) {
//				spot = spot.next;
//			}
//			spot.next = new Ball<T>(number);
//		}
//	}
//	
//	public void printAll() {
//		if(first != null) {
//			Ball<T> spot = this.first;
//			System.out.println(spot.number+"�� ���� ù��°�� �Ͽ�~");
//			while(spot.next != null) {
//				spot = spot.next;
//				System.out.println(spot.next);
//			}
//		}
//	}
//	
//	public Ball<T> search(T number){
//		if(this.first == null) {
//			return null;
//		}else {
//			Ball<T> spot = this.first;
//			while(spot != null) {
//				if(spot.number == number) {
//					return spot;
//				}else {
//					spot = spot.next;
//				}
//			}
//			return null;
//		}
//	}
//	
//	public void cutIn(T number, T isNumber) {
//		Ball<T> searchSpot = this.search(isNumber);
//		
//		if(searchSpot == null) {
//			this.addBall(number);
//		}else {
//			Ball<T> nextBall = searchSpot.next;
//			searchSpot.next.next = nextBall;
//			
//		}
//	}
//	
//	public boolean delBall(T isNumber) {
//		if(this.first == null) {
//			return false;
//		}else {
//			Ball<T> ball = this.first;
//			
//		}
//	}

}
