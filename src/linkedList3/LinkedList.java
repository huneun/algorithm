package linkedList3;

public class LinkedList<T> {
	
	Computer<T> head = null;
	
	public class Computer<T> {
		
		Computer<T> server;
		T modelNo;
		
		public Computer(T modelNo) {
			this.modelNo = modelNo;
		}
		
	}
	
	public void addComputer(T modelNo) {
		if(head == null) {
			head = new Computer<T>(modelNo);
		}else {
			Computer<T> computer = head;
			while(computer.server != null) {
				computer = computer.server;
			}
			computer.server = new Computer<T>(modelNo);
		}
	}
	
	public void printAll() {
		if(head != null) {
			System.out.println(head.modelNo);
			Computer<T> computer = head;
			while(computer.server != null) {
				computer = computer.server;
				System.out.println(computer.modelNo);
			}
		}
	}
	
	public Computer<T> search(T modelNo){
		if(head == null) {
			return null;
		}else {
			Computer<T> computer = head;
			while(computer.server != null) {
				if(computer.modelNo == modelNo) {
					return computer;
				}else {
					computer = computer.server;
				}
			}
			return null;
		}
	}

}
