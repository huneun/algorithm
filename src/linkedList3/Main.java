package linkedList3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> computerNetwork = new LinkedList<Integer>();
		
		computerNetwork.addComputer(123);
		computerNetwork.addComputer(456);
		computerNetwork.addComputer(789);
		
		computerNetwork.printAll();
		
		System.out.println("123 모델 컴퓨터가 있으면 서버이름은 "+computerNetwork.search(123).server +"이다.");
		 
		
		
	}

}
