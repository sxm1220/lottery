package fiveselectthree;

public class Result5S5
  implements Comparable<Result5S5>
{
  private Bean5S5 bean5S5;
  private int count;

  public Result5S5(Bean5S5 bean5S5, int count)
  {
    this.bean5S5 = bean5S5;
    this.count = count;
  }

  public int compareTo(Result5S5 o) {
    if (this.count > o.count) {
      return 1;
    }
    return 0;
  }

  public String toString()
  {
    return "组合：" + this.bean5S5.toString() + "数量：" + this.count;
  }

  public int hashCode() {
    return (String.valueOf(this.bean5S5.hashCode()) + "_" + this.count).hashCode();
  }

  public boolean equals(Object obj)
  {
    if (hashCode() == obj.hashCode()) {
      return true;
    }
    return false;
  }
}