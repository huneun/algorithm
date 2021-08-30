package likedList;

public class LineUp<T> {
	
	public Line<T> first = null;
	
	public class Line<T> {
		T person;
		Line<T> next = null;
		
		public Line(T person) {
			this.person = person;
		}
	}
	
	public void addPerson(T person) {
		if(first == null) {
			first = new Line<T>(person);
		}else {
			Line<T> spot = this.first;
			while(spot.next != null) {
				spot = spot.next;
			}
			spot.next = new Line<T>(person);
		}
	}
	
	public void printAll() {
		if(first != null) {
			Line<T> spot = this.first;
			System.out.println(spot.person+"을 선두로 줄을 세우면!");
			while(spot.next != null) {
				spot = spot.next;
				System.out.println(spot.next);
			}
		}
	}
	
	public Line<T> lookUp(T person){
		if(this.first == null) {
			return null;
		}else {
			Line<T> spot = this.first;
			while(spot != null) {
				if(spot.person == person) {
					return spot;
				}else {
					spot = spot.next;
				}
			}
			return null;
		}
	}
	
	public void cutIn(T person, T isPerson) {
		Line<T> lookUpSpot = this.lookUp(isPerson);
		
		if(lookUpSpot == null) {
			this.addPerson(person);
		}else {
			Line<T> nextPerson = lookUpSpot.next;
			lookUpSpot.next.next = nextPerson;
		}
	}
}
