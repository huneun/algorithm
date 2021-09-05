package linkedList2;


public class BilliardBall<T> {
	
	House first = null;
	
	public class House<T> {
		
		House address;
		T color;
		
		public House(T color) {
			this.color = color;
		}
		
	}
	
	public void addHouse(T color) {
		
		if(first == null) {
			first = new House<T>(color);
		}else {
			House<T> house = first;
			while(house.address != null) {
				house = house.address;
			}
			house.address = new House<T>(color);
		}
	
	}
	
	public void printAll() {
		
		if(first != null) {
			System.out.println("첫번 째 집의 색깔은 "+ first.color + "이다.");
			House<T> house = first;
			if(house.address == null) {
				System.out.println("다음 집은 없다.");
				return;
			}
			System.out.println("다음으로");
			while(house.address != null) {
				house = house.address;
				System.out.println(house.color + "색");
			}	
			System.out.println("이 있다.");
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
