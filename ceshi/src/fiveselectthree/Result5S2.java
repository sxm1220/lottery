package fiveselectthree;


public class Result5S2 implements Comparable<Result5S2> {
	private Bean5S2 fivebean;
	private int count;
	
	public Result5S2(Bean5S2 fivebean, int count) {
		super();
		this.fivebean = fivebean;
		this.count = count;
	}
	@Override
	public int compareTo(Result5S2 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"组合："+fivebean.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return Integer.valueOf(String.valueOf(fivebean.hashCode())+count);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this.hashCode()==obj.hashCode()){
			return true;
		}else{
			return false;
		}
	}
	
}
