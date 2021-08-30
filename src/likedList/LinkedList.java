package likedList;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LineUp<String> lineUp = new LineUp<String>();
		
		//console 안찍힘 확인요망
		lineUp.addPerson("좐");
		lineUp.addPerson("메리");
		lineUp.addPerson("사라");
		lineUp.cutIn("푸", "메리");
		lineUp.cutIn("로버트", "줄리엣");
		
		lineUp.printAll();
		
		System.out.print("로그");
		
	}
	

}
