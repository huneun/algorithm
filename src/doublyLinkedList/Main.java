package doublyLinkedList;

public class Main {

	public static void main(String[] args) {
		// ��������� ����Ǿ� Ž���� ������

		DoublyLinkedList<Integer> MyLinkedList = new DoublyLinkedList<Integer>();
		
		MyLinkedList.addNode(1);
		MyLinkedList.addNode(6);
		MyLinkedList.addNode(7);
		MyLinkedList.addNode(9);
		
		MyLinkedList.printAll();
		
		int result = MyLinkedList.searchFromTail(6);
		
		// 20210928 �����ʿ� �߸��� ���� �����ϰ� ����. 
		System.out.println("�������� ã������ 6�� ������ 6�� ��ȯ�մϴ�. ����� : "+result);
	}

}
