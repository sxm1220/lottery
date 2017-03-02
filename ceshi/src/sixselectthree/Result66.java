package sixselectthree;

public class Result66
  implements Comparable<Result66>
{
  private Bean66 bean66;
  private int count;

  public Result66(Bean66 bean66, int count)
  {
    this.bean66 = bean66;
    this.count = count;
  }

  public int compareTo(Result66 o) {
    if (this.count > o.count) {
      return 1;
    }
    return 0;
  }

  public String toString()
  {
    return "组合：" + this.bean66.toString() + "数量：" + this.count;
  }

  public int hashCode() {
    return (String.valueOf(this.bean66.hashCode()) + "_" + this.count).hashCode();
  }

  public boolean equals(Object obj)
  {
    if (hashCode() == obj.hashCode()) {
      return true;
    }
    return false;
  }
}