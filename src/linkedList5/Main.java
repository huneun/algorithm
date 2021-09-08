package linkedList5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList5<String> showCase = new LinkedList5<String>();
		
		showCase.addCake("µþ±â");
		showCase.addCake("ÃÊÄÚ");
		showCase.addCake("¹ÎÆ®");
		
		showCase.printAll();
		
		showCase.cutIn("°í±¸¸¶", "µþ±â");
		
		showCase.printAll();
		
		showCase.outCake("¹ÎÆ®");
		
		showCase.printAll();
	}

}
