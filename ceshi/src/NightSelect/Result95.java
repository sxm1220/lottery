package NightSelect;


public class Result95 implements Comparable<Result95> {
	private Bean95 bean95;
	private int count;
	
	public Result95(Bean95 bean95, int count) {
		super();
		this.bean95 = bean95;
		this.count = count;
	}
	@Override
	public int compareTo(Result95 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"组合："+bean95.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return (String.valueOf(bean95.hashCode())+"_"+count).hashCode();
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
