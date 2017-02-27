package NightSelect;


public class Result99 implements Comparable<Result99> {
	private Bean99 bean99;
	private int count;
	
	public Result99(Bean99 bean99, int count) {
		super();
		this.bean99 = bean99;
		this.count = count;
	}
	@Override
	public int compareTo(Result99 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"组合："+bean99.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return (String.valueOf(bean99.hashCode())+"_"+count).hashCode();
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
