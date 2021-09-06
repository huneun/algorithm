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
		if(this.head == null) {
			this.head = new Computer<T>(modelNo);
		}else {
			Computer<T> computer = head;
			while(computer.server != null) {
				computer = computer.server;
			}
			computer.server = new Computer<T>(modelNo);
		}
	}
	
	public void printAll() {
		if(this.head != null) {
			System.out.println(this.head.modelNo);
			Computer<T> computer = this.head;
			while(computer.server != null) {
				computer = computer.server;
				System.out.println(computer.modelNo);
			}
		}
	}
	
	public Computer<T> search(T modelNo){
		if(this.head == null) {
			return null;
		}else {
			Computer<T> computer = this.head;
			while(computer != null) {
				if(computer.modelNo == modelNo) {
					return computer;
				}else {
					computer = computer.server;
				}
			}
			return null;
		}
	}
	
	public void setBetween(T modelNo, T searchModel) {
		
		Computer<T> searchedComputer = this.search(searchModel);
		
		if(searchedComputer == null) {
			this.addComputer(modelNo);
		}else {
			Computer<T> computer = searchedComputer.server;
			searchedComputer.server = new Computer<T>(modelNo);
			searchedComputer.server.server = computer;
			
		}
		
	}
	

}
