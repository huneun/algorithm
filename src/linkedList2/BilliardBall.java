package linkedList2;


public class BilliardBall<T> {
	
	Ball<T> firstBall = null;
	//생각하자 생각
	//필요한 변수,역할 
	//변수1 -> 객체 생성 객체의 맴버변수로 자기 자신을 선언하여 객체의 시그니쳐 변수를 만들고 이것은 인스턴스하여 이 객체를 생성할 때 나타낼수 있는 유일 무이한 값이되어야 하는 주소 역할을 수행한다. 
	//변수2 -> 데이터를 받을 변수를 맴버변수로 한다. 
	
	
	public class Ball<T>{
		
		Ball<T> address;
		T ballNumber;
		
		public Ball(T ballNumber) {
			this.ballNumber = ballNumber;
		}

	}
	
	//이다음으로 이객체의 생성을 담당할 메소드가 필요하다.
	
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
			System.out.println("첫번째 공은 "+ball.ballNumber+"다음은 순서대로 ");
			while(ball.address != null) {
				ball = ball.address;
				System.out.println(ball.ballNumber + "번 공");
			}		
		}
	}
	
//	public Ball<T> first = null;
//	
//	public class Ball<T>{
//		T number;
//		Ball<T> next = null; // 싱클톤 패턴과 유사, 자기 자신의 타입을 갖는 맴버 변수를 선언하면 객체가 호출되는 시점에 맴버 변수가 선언되기 때문에 컴파일 순서상 문제가 없는 구문이 된다.
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
//			System.out.println(spot.number+"번 공을 첫번째로 하여~");
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
