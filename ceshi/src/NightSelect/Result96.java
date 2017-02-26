package NightSelect;


public class Result96 implements Comparable<Result96> {
	private Bean96 bean96;
	private int count;
	
	public Result96(Bean96 bean96, int count) {
		super();
		this.bean96 = bean96;
		this.count = count;
	}
	@Override
	public int compareTo(Result96 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"组合："+bean96.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return (String.valueOf(bean96.hashCode())+"_"+count).hashCode();
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
