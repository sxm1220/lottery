package twelve;

public class Result12S6 implements Comparable<Result12S6> {
	private Bean12S6 bean12S6;
	private int count;
	
	public Result12S6(Bean12S6 bean12S6, int count) {
		super();
		this.bean12S6 = bean12S6;
		this.count = count;
	}
	@Override
	public int compareTo(Result12S6 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"组合："+bean12S6.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return (String.valueOf(bean12S6.hashCode())+"_"+count).hashCode();
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
