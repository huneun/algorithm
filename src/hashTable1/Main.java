package hashTable1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyHash mainObject = new MyHash(20);
		mainObject.saveData("Kimgilhoan", "01066675555");
		mainObject.saveData("oh-jingoh", "01033347777");
		String result = mainObject.getData("oh-jingoh");

		System.out.println("oh-jingoh key에 입력된 value : "+result);
	}
	
	//1. hash table 클래스 만들기
	//2. 초간단 해쉬함수 만들기
	//3. 해쉬테이블 클래스에 데이터 저장 메서드 추가

	
	public static class MyHash {
		public Slot[] hashTable;
		
		public MyHash(Integer size) {
			this.hashTable = new Slot[size];
		}
		
		public class Slot {
			String value;
			Slot(String value) {
				this.value = value;
			}
		}
		
		public int hashFunc(String key) {
			return (int)key.charAt(0) % this.hashTable.length;
		}
		
		public boolean saveData(String key, String value) {
			Integer address = this.hashFunc(key);
			if(this.hashTable[address] != null) {
				this.hashTable[address].value = value;
			}else {
				this.hashTable[address] = new Slot(value);
			}
			return true;
		}
		
		public String getData(String key) {
			Integer address = this.hashFunc(key);
			if(this.hashTable[address] != null) {
				return this.hashTable[address].value;
			}else {
				return null;
			}
		}
	}
	
	
}
