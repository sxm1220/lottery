package NightSelect;


public class Result93 implements Comparable<Result93> {
	private Bean93 bean93;
	private int count;
	
	public Result93(Bean93 bean93, int count) {
		super();
		this.bean93 = bean93;
		this.count = count;
	}
	@Override
	public int compareTo(Result93 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"组合："+bean93.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return (String.valueOf(bean93.hashCode())+"_"+count).hashCode();
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
