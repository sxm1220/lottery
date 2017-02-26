package NightSelect;


public class Result92 implements Comparable<Result92> {
	private Bean92 bean92;
	private int count;
	
	public Result92(Bean92 bean92, int count) {
		super();
		this.bean92 = bean92;
		this.count = count;
	}
	@Override
	public int compareTo(Result92 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"组合："+bean92.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return (String.valueOf(bean92.hashCode())+"_"+count).hashCode();
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
