package NightSelect;


public class Result98 implements Comparable<Result98> {
	private Bean98 bean98;
	private int count;
	
	public Result98(Bean98 bean98, int count) {
		super();
		this.bean98 = bean98;
		this.count = count;
	}
	@Override
	public int compareTo(Result98 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"组合："+bean98.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return (String.valueOf(bean98.hashCode())+"_"+count).hashCode();
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
