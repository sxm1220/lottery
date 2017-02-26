package NightSelect;

public class Bean95 {
	private int first;
	private int secend;
	private int third;
	private int four;
	private int five;
	public Bean95(int first, int secend, int third ,int four,int five) {
		super();
		int[] arr = {first,secend,third,four,five};
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
		this.five = arr[4];
	}
	@Override
	public int hashCode() {
		String a = String.valueOf(first);
		String b = String.valueOf(secend);
		String c = String.valueOf(third);
		String d = String.valueOf(four);
		String e = String.valueOf(five);
		return (a+b+c+d+e).hashCode();
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
		String e = String.valueOf(five);
		return a+" "+b+" "+c+ " "+d+" "+e;
	}
	
}
