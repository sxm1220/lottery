package twelve;

public class Bean12S12 {
	private int first;
	private int secend;
	private int third;
	private int four;
	private int five;
	private int six;
	private int seven;
	private int eight;
	private int nine;
	private int ten;
	private int eleven ;
	private int twelve  ;
	public Bean12S12(int first, int secend, int third ,int four,int five,int six,int seven,int eigth,int nine ,int ten,int eleven ,int twelve) {
		super();
		int[] arr = {first,secend,third,four,five,six,seven,eigth, nine , ten, eleven , twelve};
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
		this.eight = arr[7];this.nine = arr[8]; this.ten = arr[9];this.eleven = arr[10];  this.twelve = arr[11];
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
		String j = String.valueOf(ten);
		String k = String.valueOf(eleven);
		String l = String.valueOf(twelve);
		return (a+b+c+d+e+f+g+h+i+j+k+l).hashCode();
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
		String j = String.valueOf(ten);
		String k = String.valueOf(eleven);
		String l = String.valueOf(twelve);
		return a+" "+b+" "+c+ " "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j+" "+k+" "+l;
	}
}
