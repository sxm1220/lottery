package twentyfour;

public class Result24S2
  implements Comparable<Result24S2>
{
  private Bean24S2 bean24S2;
  private int count;
  
  public Result24S2(Bean24S2 bean24S2, int count)
  {
    this.bean24S2 = bean24S2;
    this.count = count;
  }
  
  public int compareTo(Result24S2 o)
  {
    if (this.count > o.count) {
      return 1;
    }
    return 0;
  }
  
  public String toString()
  {
    return "组合：" + this.bean24S2.toString() + "数量：" + this.count;
  }
  
  public int hashCode()
  {
    return (String.valueOf(this.bean24S2.hashCode()) + "_" + this.count).hashCode();
  }
  
  public boolean equals(Object obj)
  {
    if (hashCode() == obj.hashCode()) {
      return true;
    }
    return false;
  }
}
