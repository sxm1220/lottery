package twentyfive;

public class Result25S2
  implements Comparable<Result25S2>
{
  private Bean25S2 bean25S2;
  private int count;
  
  public Result25S2(Bean25S2 bean25S2, int count)
  {
    this.bean25S2 = bean25S2;
    this.count = count;
  }
  
  public int compareTo(Result25S2 o)
  {
    if (this.count > o.count) {
      return 1;
    }
    return 0;
  }
  
  public String toString()
  {
    return "组合：" + this.bean25S2.toString() + "数量：" + this.count;
  }
  
  public int hashCode()
  {
    return (String.valueOf(this.bean25S2.hashCode()) + "_" + this.count).hashCode();
  }
  
  public boolean equals(Object obj)
  {
    if (hashCode() == obj.hashCode()) {
      return true;
    }
    return false;
  }
}
