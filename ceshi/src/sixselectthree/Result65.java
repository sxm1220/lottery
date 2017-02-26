package sixselectthree;


public class Result65 implements Comparable<Result65> {
	private Bean65 bean65;
	private int count;
	
	public Result65(Bean65 bean65, int count) {
		super();
		this.bean65 = bean65;
		this.count = count;
	}
	@Override
	public int compareTo(Result65 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"组合："+bean65.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return (String.valueOf(bean65.hashCode())+"_"+count).hashCode();
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
