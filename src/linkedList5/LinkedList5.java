package linkedList5;

public class LinkedList5<T> {
	
	Cake<T> first = null;
	
	public class Cake<T> {
		
		T flavor;
		Cake<T> box;
		
		public Cake(T flavor) {
			this.flavor = flavor;
		}
		
	}
	
	public void addCake(T flavor) {
		if(first == null) {
			first = new Cake<T>(flavor);
		}else {
			Cake<T> cake = first;
			while(cake.box != null) {
				cake = cake.box;
			}
			cake.box = new Cake<T>(flavor);
		}
		
	}
	
	public void printAll() {
		if(first != null) {
			System.out.println(first.flavor);
			Cake<T> cake = first;
			while(cake.box != null) {
				cake = cake.box;
				System.out.println(cake.flavor);
			}
		}
	}
	
	
	public Cake<T> search(T flavor){
		if(first == null) {
			return null;
		}else {
			Cake<T> cake = first;
			while(cake != null) {
				if(cake.flavor.toString().equals(flavor.toString())) {
					return cake;
				}else {
					cake = cake.box;
				}
			}

			return null;
		}
	}
	
	
	public void cutIn(T flavor, T oldflavor) {
		Cake<T> searchCake = this.search(oldflavor);
		
		if(searchCake == null) {
			this.addCake(flavor);
		}else {
			Cake<T> tempCake = searchCake.box;
			searchCake.box = new Cake<T>(flavor);
			searchCake.box.box = tempCake;
			
		}
		
	}
	
	public boolean outCake(T flavor) {
		if(this.first == null) {
			return false;
		}else {
			Cake<T> cake = this.first;
			if(cake.flavor == flavor) {
				this.first = this.first.box;
				return true;
			}else {
				while(cake.box != null) {
					if(cake.box.flavor == flavor) {
						cake.box = cake.box.box;
						return true;
					}
					cake = cake.box;
				}
				return false;
			}
		}
	}
	
	

}
