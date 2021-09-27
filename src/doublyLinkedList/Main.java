package doublyLinkedList;

public class Main {

	public static void main(String[] args) {
		// 양방향으로 연결되어 탐색이 용이함

		DoublyLinkedList<Integer> MyLinkedList = new DoublyLinkedList<Integer>();
		
		MyLinkedList.addNode(1);
		MyLinkedList.addNode(6);
		MyLinkedList.addNode(7);
		MyLinkedList.addNode(9);
		
		MyLinkedList.printAll();
		
		int result = MyLinkedList.searchFromTail(6);
		
		// 20210928 수정필요 잘못된 값을 리턴하고 있음. 
		System.out.println("꼬리부터 찾았을때 6이 있으면 6을 반환합니다. 결과는 : "+result);
	}

}
