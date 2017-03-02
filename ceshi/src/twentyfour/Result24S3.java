package twentyfour;

public class Result24S3
  implements Comparable<Result24S3>
{
  private Bean24S3 bean24S3;
  private int count;
  
  public Result24S3(Bean24S3 bean24S3, int count)
  {
    this.bean24S3 = bean24S3;
    this.count = count;
  }
  
  public int compareTo(Result24S3 o)
  {
    if (this.count > o.count) {
      return 1;
    }
    return 0;
  }
  
  public String toString()
  {
    return "组合：" + this.bean24S3.toString() + "数量：" + this.count;
  }
  
  public int hashCode()
  {
    return (String.valueOf(this.bean24S3.hashCode()) + "_" + this.count).hashCode();
  }
  
  public boolean equals(Object obj)
  {
    if (hashCode() == obj.hashCode()) {
      return true;
    }
    return false;
  }
}
