package sixselectthree;

public class Bean66
{
  private int first;
  private int secend;
  private int third;
  private int four;
  private int five;
  private int six;

  public Bean66(int first, int secend, int third, int four, int five, int six)
  {
    int[] arr = { first, secend, third, four, five, six };
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
    this.four = arr[3];
    this.five = arr[4];
    this.six = arr[5];
  }

  public int hashCode() {
    String a = String.valueOf(this.first);
    String b = String.valueOf(this.secend);
    String c = String.valueOf(this.third);
    String d = String.valueOf(this.four);
    String e = String.valueOf(this.five);
    String f = String.valueOf(this.six);
    return (a + b + c + d + e + f).hashCode();
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
    String d = String.valueOf(this.four);
    String e = String.valueOf(this.five);
    String f = String.valueOf(this.six);
    return a + " " + b + " " + c + " " + d + " " + e + " " + f;
  }
}