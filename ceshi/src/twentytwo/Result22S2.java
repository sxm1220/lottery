package twentytwo;

public class Result22S2
  implements Comparable<Result22S2>
{
  private Bean22S2 bean22S2;
  private int count;
  
  public Result22S2(Bean22S2 bean22S2, int count)
  {
    this.bean22S2 = bean22S2;
    this.count = count;
  }
  
  public int compareTo(Result22S2 o)
  {
    if (this.count > o.count) {
      return 1;
    }
    return 0;
  }
  
  public String toString()
  {
    return "组合：" + this.bean22S2.toString() + "数量：" + this.count;
  }
  
  public int hashCode()
  {
    return (String.valueOf(this.bean22S2.hashCode()) + "_" + this.count).hashCode();
  }
  
  public boolean equals(Object obj)
  {
    if (hashCode() == obj.hashCode()) {
      return true;
    }
    return false;
  }
}
