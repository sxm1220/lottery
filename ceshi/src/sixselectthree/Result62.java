package sixselectthree;


public class Result62 implements Comparable<Result62> {
	private Bean62 bean62;
	private int count;
	
	public Result62(Bean62 bean62, int count) {
		super();
		this.bean62 = bean62;
		this.count = count;
	}
	@Override
	public int compareTo(Result62 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"组合："+bean62.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return (String.valueOf(bean62.hashCode())+"_"+count).hashCode();
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
