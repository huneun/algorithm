package likedList;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LineUp<String> lineUp = new LineUp<String>();
		
		//console ������ Ȯ�ο��
		lineUp.addPerson("��");
		lineUp.addPerson("�޸�");
		lineUp.addPerson("���");
		lineUp.cutIn("Ǫ", "�޸�");
		lineUp.cutIn("�ι�Ʈ", "�ٸ���");
		
		lineUp.printAll();
		
		System.out.print("�α�");
		
	}
	

}
