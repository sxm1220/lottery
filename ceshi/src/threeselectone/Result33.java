package threeselectone;

public class Result33
  implements Comparable<Result33>
{
  private Bean33 fivebean;
  private int count;

  public Result33(Bean33 fivebean, int count)
  {
    this.fivebean = fivebean;
    this.count = count;
  }

  public int compareTo(Result33 o) {
    if (this.count > o.count) {
      return 1;
    }
    return 0;
  }

  public String toString()
  {
    return "组合：" + this.fivebean.toString() + "数量：" + this.count;
  }

  public int hashCode() {
    return Integer.valueOf(String.valueOf(this.fivebean.hashCode()) + this.count).intValue();
  }

  public boolean equals(Object obj)
  {
    if (hashCode() == obj.hashCode()) {
      return true;
    }
    return false;
  }
}