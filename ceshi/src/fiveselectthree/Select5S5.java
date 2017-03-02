package fiveselectthree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Select5S5
{
  private static List list = new ArrayList();
  private static List finallist = new ArrayList();

  public static void main(String[] args) throws Exception {
    File file = new File("5xuan5.txt");
    List alist = new ArrayList();
    List resultlist = new ArrayList();
    Set set = new HashSet();
    BufferedReader br = new BufferedReader(new FileReader(file));
    String line = null;
    int temp = 1;
    while ((line = br.readLine()) != null) {
      int[] intArr = new int[3];
      int[] intArr1 = new int[2];
      line = line.trim().replace(" ", "");
      if (!"".equals(line)) {
        String[] strArr = line.split("��");
        if (temp % 2 != 0) {
          for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.valueOf(strArr[i]).intValue();
          }
          alist.add(intArr);
        } else {
          for (int i = 0; i < strArr.length; i++) {
            intArr1[i] = Integer.valueOf(strArr[i]).intValue();
          }
          alist.add(intArr1);
        }
      }
      temp++;
    }
    br.close();
    for (int i = 0; i < alist.size(); i++) {
      if (i % 2 != 0) {
        int[] temp1 = new int[3];
        int[] temp2 = new int[2];
        int[] result = new int[5];
        temp1 = (int[])alist.get(i - 1);
        temp2 = (int[])alist.get(i);
        for (int j = 0; j < temp1.length; j++) {
          result[j] = temp1[j];
        }
        for (int j = 0; j < temp2.length; j++) {
          result[(3 + j)] = temp2[j];
        }
        resultlist.add(result);
      }
    }
    for (int i = 0; i < resultlist.size(); i++) {
      combine((int[])resultlist.get(i), 5);
    }
    for (int i = 0; i < list.size(); i++) {
      int sum = 1;
      for (int j = 0; j < list.size(); j++) {
        if (i != j)
        {
          if (list.get(i).equals(list.get(j)))
            sum++;
        }
      }
      set.add(new Result5S5((Bean5S5)list.get(i), sum));
    }
    finallist.addAll(set);
    Collections.sort(finallist);
    File file1 = new File("5xuan5out.txt");
    if (file1.exists()) {
      file1.delete();
    }
    FileWriter writer = new FileWriter("5xuan5out.txt", true);
    for (Iterator iterator = finallist.iterator(); iterator.hasNext(); ) {
      Result5S5 object = (Result5S5)iterator.next();
      writer.write(object.toString() + "\r\n");
      writer.write("\r\n");
      writer.flush();
      System.out.println(object.toString());
    }
    writer.close();
  }

  static void zuhe(int[] a, int m)
  {
    int n = a.length;

    boolean flag = false;

    int[] tempNum = new int[n];
    for (int i = 0; i < n; i++) {
      if (i < m) {
        tempNum[i] = 1;
      }
      else {
        tempNum[i] = 0;
      }
      System.out.print(tempNum[i]);
    }

    print(tempNum);
    int[] arrt = new int[m];
    arrt = createResult(a, tempNum, m);
    list.add(new Bean5S5(arrt[0], arrt[1], arrt[2], arrt[3], arrt[4]));
    do
    {
      int pose = 0;
      int sum = 0;

      for (int i = 0; i < n - 1; i++) {
        if ((tempNum[i] == 1) && (tempNum[(i + 1)] == 0)) {
          tempNum[i] = 0;
          tempNum[(i + 1)] = 1;
          pose = i;
          break;
        }
      }
      print(tempNum);
      int[] arrt1 = new int[m];
      arrt1 = createResult(a, tempNum, m);
      list.add(new Bean5S5(arrt1[0], arrt1[1], arrt1[2], arrt1[3], arrt1[4]));

      for (int i = 0; i < pose; i++) {
        if (tempNum[i] == 1) {
          sum++;
        }
      }
      for (int i = 0; i < pose; i++) {
        if (i < sum)
          tempNum[i] = 1;
        else {
          tempNum[i] = 0;
        }
      }

      flag = false;
      for (int i = n - m; i < n; i++)
      {
        if (tempNum[i] == 0)
          flag = true;
      }
    }
    while (flag);
  }

  public static int[] createResult(int[] a, int[] temp, int m)
  {
    int[] result = new int[m];

    int j = 0;
    for (int i = 0; i < a.length; i++)
    {
      if (temp[i] == 1) {
        result[j] = a[i];
        System.out.println("result[" + j + "]:" + result[j]);
        j++;
      }

    }

    return result;
  }

  public static void print(int[] a) {
    System.out.println("���ɵĸ�������Ϊ��");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
    }
    System.out.println();
  }

  public static void combine(int[] a, int n)
  {
    if ((a == null) || (a.length == 0) || (n <= 0) || (n > a.length)) {
      return;
    }
    int[] b = new int[n];
    getCombination(a, n, 0, b, 0);
  }

  private static void getCombination(int[] a, int n, int begin, int[] b, int index)
  {
    if (n == 0) {
      StringBuffer stb = new StringBuffer();
      for (int i = 0; i < index; i++) {
        stb.append(b[i] + " ");
      }

      System.out.println(stb.toString());
      String[] arr = stb.toString().split(" ");
      list.add(new Bean5S5(Integer.valueOf(arr[0]).intValue(), Integer.valueOf(arr[1]).intValue(), Integer.valueOf(arr[2]).intValue(), Integer.valueOf(arr[3]).intValue(), Integer.valueOf(arr[4]).intValue()));
      return;
    }

    for (int i = begin; i < a.length; i++)
    {
      b[index] = a[i];
      getCombination(a, n - 1, i + 1, b, index + 1);
    }
  }
}