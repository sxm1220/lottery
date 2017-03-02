package fiveselectthree;

public class Bean5S5
{
  private int first;
  private int secend;
  private int third;
  private int four;
  private int five;

  public Bean5S5(int first, int secend, int third, int four, int five)
  {
    int[] arr = { first, secend, third, four, five };
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
  }

  public int hashCode() {
    String a = String.valueOf(this.first);
    String b = String.valueOf(this.secend);
    String c = String.valueOf(this.third);
    String d = String.valueOf(this.four);
    String e = String.valueOf(this.five);
    return (a + b + c + d + e).hashCode();
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
    return a + " " + b + " " + c + " " + d + " " + e;
  }
}