package sixselectthree;

public class Bean62 {
	private int first;
	private int secend;
	public Bean62(int first, int secend) {
		super();
		int[] arr = {first,secend};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int temp = arr[i];
				if(arr[i]>arr[j]){
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		this.first = arr[0];
		this.secend = arr[1];
	}
	@Override
	public int hashCode() {
		String a = String.valueOf(first);
		String b = String.valueOf(secend);
		return (a+b).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(this.hashCode()==obj.hashCode()){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public String toString() {
		String a = String.valueOf(first);
		String b = String.valueOf(secend);
		return a+" "+b;
	}
	
}
