class resultBean implements Comparable<resultBean>{
	private int count;
	private Bean bean;
	public resultBean(int count, Bean bean) {
		super();
		this.count = count;
		this.bean = bean;
	}
	@Override
	public int compareTo(resultBean o) {
		if(this.count>o.count){
			return 1;
		}else{
			return 0;
		}
		
	}
	@Override
	public String toString() {
		
		return"组合："+bean.toString()+"数量："+count;
	}
	@Override
	public int hashCode() {
		return Integer.valueOf(String.valueOf(bean.hashCode())+count);
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
