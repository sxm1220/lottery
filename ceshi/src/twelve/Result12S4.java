package twelve;

public class Result12S4 implements Comparable<Result12S4> {
	private Bean12S4 bean12S4;
	private int count;
	
	public Result12S4(Bean12S4 bean12S4, int count) {
		super();
		this.bean12S4 = bean12S4;
		this.count = count;
	}
	@Override
	public int compareTo(Result12S4 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"组合："+bean12S4.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return (String.valueOf(bean12S4.hashCode())+"_"+count).hashCode();
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
