package twelve;

public class Result12S5 implements Comparable<Result12S5> {
	private Bean12S5 bean12S5;
	private int count;
	
	public Result12S5(Bean12S5 bean12S5, int count) {
		super();
		this.bean12S5 = bean12S5;
		this.count = count;
	}
	@Override
	public int compareTo(Result12S5 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"组合："+bean12S5.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return (String.valueOf(bean12S5.hashCode())+"_"+count).hashCode();
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
