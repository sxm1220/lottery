package sixselectthree;

public class Bean64 {
	private int first;
	private int secend;
	private int third;
	private int four;
	public Bean64(int first, int secend, int third ,int four) {
		super();
		int[] arr = {first,secend,third,four};
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
		this.third = arr[2];
		this.four = arr[3];
	}
	@Override
	public int hashCode() {
		String a = String.valueOf(first);
		String b = String.valueOf(secend);
		String c = String.valueOf(third);
		String d = String.valueOf(four);
		return (a+b+c+d).hashCode();
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
		String c = String.valueOf(third);
		String d = String.valueOf(four);
		return a+" "+b+" "+c+ " "+d;
	}
	
}
