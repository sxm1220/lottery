package NightSelect;

public class Bean99 {
	private int first;
	private int secend;
	private int third;
	private int four;
	private int five;
	private int six;
	private int seven;
	private int eight;
	private int nine;
	public Bean99(int first, int secend, int third ,int four,int five,int six,int seven,int eight, int nine) {
		super(); 
		int[] arr = {first,secend,third,four,five,six,seven,eight,nine};
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
		this.six = arr[5];
		this.seven = arr[6];
		this.eight = arr[7];
		this.nine = arr[8];
	}
	@Override
	public int hashCode() {
		String a = String.valueOf(first);
		String b = String.valueOf(secend);
		String c = String.valueOf(third);
		String d = String.valueOf(four);
		String e = String.valueOf(five);
		String f = String.valueOf(six);
		String g = String.valueOf(seven);
		String h = String.valueOf(eight);
		String i = String.valueOf(nine);
		return (a+b+c+d+e+f+g+h+i).hashCode();
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
		String f = String.valueOf(six);
		String g = String.valueOf(seven);
		String h = String.valueOf(eight);
		String i = String.valueOf(nine);
		return a+" "+b+" "+c+ " "+d+" "+e+" "+f+" "+g+" "+h +" "+i;
	}
	
}
