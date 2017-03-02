package twentyfour;

public class Bean24S2
{
  private int first;
  private int secend;
  
  public Bean24S2(int first, int secend)
  {
    int[] arr = { first, secend };
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++)
      {
        int temp = arr[i];
        if (arr[i] > arr[j])
        {
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    this.first = arr[0];
    this.secend = arr[1];
  }
  
  public int hashCode()
  {
    String a = String.valueOf(this.first);
    String b = String.valueOf(this.secend);
    return Integer.valueOf(a + b).intValue();
  }
  
  public boolean equals(Object obj)
  {
    if (hashCode() == obj.hashCode()) {
      return true;
    }
    return false;
  }
  
  public String toString()
  {
    String a = String.valueOf(this.first);
    String b = String.valueOf(this.secend);
    return a + " " + b;
  }
}
