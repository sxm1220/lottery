package twelve;


public class Result12S2 implements Comparable<Result12S2> {
	private Bean12S2 bean12S2;
	private int count;
	
	public Result12S2(Bean12S2 bean12S2, int count) {
		super();
		this.bean12S2 = bean12S2;
		this.count = count;
	}
	@Override
	public int compareTo(Result12S2 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"组合："+bean12S2.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return (String.valueOf(bean12S2.hashCode())+"_"+count).hashCode();
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
