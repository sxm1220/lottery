package threeselectone;

public class Bean33
{
  private int first;
  private int secend;
  private int third;

  public Bean33(int first, int secend, int third)
  {
    int[] arr = { first, secend, third };
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int temp = arr[i];
        if (arr[i] > arr[j]) {
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    this.first = arr[0];
    this.secend = arr[1];
    this.third = arr[2];
  }

  public int hashCode() {
    String a = String.valueOf(this.first);
    String b = String.valueOf(this.secend);
    String c = String.valueOf(this.third);
    return Integer.valueOf(a + b + c).intValue();
  }

  public boolean equals(Object obj) {
    if (hashCode() == obj.hashCode()) {
      return true;
    }
    return false;
  }

  public String toString()
  {
    String a = String.valueOf(this.first);
    String b = String.valueOf(this.secend);
    String c = String.valueOf(this.third);
    return a + " " + b + " " + c;
  }
}