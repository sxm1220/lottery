package NightSelect;


public class Result97 implements Comparable<Result97> {
	private Bean97 bean97;
	private int count;
	
	public Result97(Bean97 bean97, int count) {
		super();
		this.bean97 = bean97;
		this.count = count;
	}
	@Override
	public int compareTo(Result97 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"组合："+bean97.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return (String.valueOf(bean97.hashCode())+"_"+count).hashCode();
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
