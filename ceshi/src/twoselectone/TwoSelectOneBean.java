package twoselectone;



import fiveselectthree.ResultFiveBean;

public class TwoSelectOneBean  implements Comparable<TwoSelectOneBean>{
	private String value;
	private int count;
	public TwoSelectOneBean(int sum, String string) {
		this.value = string;
		this.count = sum;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.value+String.valueOf(this.count));
	}
	@Override
	public boolean equals(Object obj) {
		if(this.hashCode()==obj.hashCode()){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public int compareTo(TwoSelectOneBean o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "数字："+this.value+" 出现次数："+this.count;
	}
	
	
}
