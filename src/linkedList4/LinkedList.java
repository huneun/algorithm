package linkedList4;

public class LinkedList<T> {
	
	Phone<T> first = null;
	
	public class Phone<T> {
		Phone<T> makingNumber;
		T model;
		
		public Phone(T model) {
			this.model = model;
		}
	}
	
	public void addPhone(T model) {
		if(this.first == null) {
			this.first = new Phone<T>(model);
		}else {
			Phone<T> phone = this.first;
			while(phone.makingNumber != null) {
				phone = phone.makingNumber;
			}
			phone.makingNumber = new Phone<T>(model);
		}
	}
	
	public void printAll() {
		if(this.first != null) {
			System.out.println(this.first.model);
			Phone<T> phone = this.first;
			while(phone.makingNumber != null) {
				phone = phone.makingNumber;
				System.out.println(phone.model);
			}
		}
	}
	
	public Phone<T> search(T model) {
		if(this.first == null) {
			return null;
		}else {
			Phone<T> phone = this.first;
			T a = phone.model;
			while(phone != null) {
				if(phone.model.toString().equals(model.toString()) ) {
					return phone;
				}else {
					phone = phone.makingNumber;
				}
			}
			return null;
		}
	}
	
	public void setBetween(T model, T oldModel) {
		
		Phone<T> searchedPhone = this.search(oldModel);
		
		if(searchedPhone != null) {
			Phone<T> phone = searchedPhone.makingNumber;
			searchedPhone.makingNumber = new Phone<T>(model);
			searchedPhone.makingNumber.makingNumber = phone;
		}else {
			this.addPhone(model);
		}
		
	}

}
