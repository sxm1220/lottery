public class Bean{
	int small;
	int big;
	public Bean(int small, int big) {
		super();
		if(small>big){
			this.small = big;
			this.big = small;
		}else{
			this.small = small;
			this.big = big;
		}
		
		
	}
	@Override
	public boolean equals(Object arg0) {
		if(this.hashCode()==arg0.hashCode()){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public int hashCode() {
		String a = String.valueOf(small);
		String b = String.valueOf(big);
		
		return  Integer.valueOf(a+b);
	}
	@Override
	public String toString() {
		String a = String.valueOf(small);
		String b = String.valueOf(big);
		return a+" "+b;
	}
	
}