package twelve;


public class Result12S3 implements Comparable<Result12S3> {
	private Bean12S3 bean12S3;
	private int count;
	
	public Result12S3(Bean12S3 bean12S3, int count) {
		super();
		this.bean12S3 = bean12S3;
		this.count = count;
	}
	@Override
	public int compareTo(Result12S3 o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"��ϣ�"+bean12S3.toString()+"������"+count;
	}
	@Override
	public int hashCode() {
		return (String.valueOf(bean12S3.hashCode())+"_"+count).hashCode();
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
