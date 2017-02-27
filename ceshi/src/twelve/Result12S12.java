package twelve;

public class Result12S12 implements Comparable<Result12S12> {
	private Bean12S12 bean12S12;
	private int count;
	
	public Result12S12(Bean12S12 bean12S12, int count) {
		super();
		this.bean12S12 = bean12S12;
		this.count = count;
	}
	@Override
	public int compareTo(Result12S12 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"��ϣ�"+bean12S12.toString()+"������"+count;
	}
	@Override
	public int hashCode() {
		return (String.valueOf(bean12S12.hashCode())+"_"+count).hashCode();
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
