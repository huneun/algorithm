package linkedList5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList5<String> showCase = new LinkedList5<String>();
		
		showCase.addCake("����");
		showCase.addCake("����");
		showCase.addCake("��Ʈ");
		
		showCase.printAll();
		
		showCase.cutIn("����", "����");
		
		showCase.printAll();
		
		showCase.outCake("��Ʈ");
		
		showCase.printAll();
	}

}
