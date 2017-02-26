package sixselectthree;


public class ResultFiveBean implements Comparable<ResultFiveBean> {
	private FivechoseBean fivebean;
	private int count;
	
	public ResultFiveBean(FivechoseBean fivebean, int count) {
		super();
		this.fivebean = fivebean;
		this.count = count;
	}
	@Override
	public int compareTo(ResultFiveBean o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		
		return"组合："+fivebean.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return Integer.valueOf(String.valueOf(fivebean.hashCode())+count);
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
