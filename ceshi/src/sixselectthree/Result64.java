package sixselectthree;


public class Result64 implements Comparable<Result64> {
	private Bean64 bean64;
	private int count;
	
	public Result64(Bean64 bean64, int count) {
		super();
		this.bean64 = bean64;
		this.count = count;
	}
	@Override
	public int compareTo(Result64 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"组合："+bean64.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return (String.valueOf(bean64.hashCode())+"_"+count).hashCode();
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
