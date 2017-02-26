package NightSelect;


public class Result94 implements Comparable<Result94> {
	private Bean94 bean94;
	private int count;
	
	public Result94(Bean94 bean94, int count) {
		super();
		this.bean94 = bean94;
		this.count = count;
	}
	@Override
	public int compareTo(Result94 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"组合："+bean94.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return (String.valueOf(bean94.hashCode())+"_"+count).hashCode();
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
