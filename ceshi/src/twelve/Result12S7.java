package twelve;

public class Result12S7 implements Comparable<Result12S7> {
	private Bean12S7 bean12S7;
	private int count;
	
	public Result12S7(Bean12S7 bean12S7, int count) {
		super();
		this.bean12S7 = bean12S7;
		this.count = count;
	}
	@Override
	public int compareTo(Result12S7 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"组合："+bean12S7.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return (String.valueOf(bean12S7.hashCode())+"_"+count).hashCode();
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
