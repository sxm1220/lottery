package twentyfour;

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

public class Select24S3
{
  private static List list = new ArrayList();
  private static List finallist = new ArrayList();
  
  public static void main(String[] args)
    throws Exception
  {
    File file = new File("24xuan3.txt");
    List alist = new ArrayList();
    List resultlist = new ArrayList();
    Set set = new HashSet();
    BufferedReader br = new BufferedReader(new FileReader(file));
    String line = null;
    int temp = 1;
    while ((line = br.readLine()) != null)
    {
      int[] intArr = new int[3];
      line = line.trim().replace(" ", "");
      if (!"".equals(line))
      {
        String[] strArr = line.split("，");
        for (int i = 0; i < strArr.length; i++) {
          intArr[i] = Integer.valueOf(strArr[i]).intValue();
        }
        alist.add(intArr);
      }
      temp++;
    }
    br.close();
    if (alist.size() % 8 == 0)
    {
      for (int i = 0; i < alist.size() / 8; i++)
      {
        int[] temp1 = new int[3];
        int[] temp2 = new int[3];
        int[] temp3 = new int[3];
        int[] temp4 = new int[3];
        int[] temp5 = new int[3];
        int[] temp6 = new int[3];
        int[] temp7 = new int[3];
        int[] temp8 = new int[3];
        int[] result = new int[24];
        if(i==0){
        	temp1 = (int[])alist.get(0 + 3 * i);
            temp2 = (int[])alist.get(1 + 3 * i);
            temp3 = (int[])alist.get(2 + 3 * i);
            temp4 = (int[])alist.get(3 + 3 * i);
            temp5 = (int[])alist.get(4 + 3 * i);
            temp6 = (int[])alist.get(5 + 3 * i);
            temp7 = (int[])alist.get(6 + 3 * i);
            temp8 = (int[])alist.get(7 + 3 * i);
        }else{
        	temp1 = (int[])alist.get(0 + 4 * (i*2));
            temp2 = (int[])alist.get(1 + 4 * (i*2));
            temp3 = (int[])alist.get(2 + 4 * (i*2));
            temp4 = (int[])alist.get(3 + 4 * (i*2));
            temp5 = (int[])alist.get(4 + 4 * (i*2));
            temp6 = (int[])alist.get(5 + 4 * (i*2));
            temp7 = (int[])alist.get(6 + 4 * (i*2));
            temp8 = (int[])alist.get(7 + 4 * (i*2));
        }
        for (int j = 0; j < temp1.length; j++) {
          result[j] = temp1[j];
        }
        for (int j = 0; j < temp2.length; j++) {
          result[(3 + j)] = temp2[j];
        }
        for (int j = 0; j < temp3.length; j++) {
          result[(6 + j)] = temp3[j];
        }
        for (int j = 0; j < temp4.length; j++) {
          result[(9 + j)] = temp4[j];
        }
        for (int j = 0; j < temp5.length; j++) {
          result[(12 + j)] = temp5[j];
        }
        for (int j = 0; j < temp6.length; j++) {
          result[(15 + j)] = temp6[j];
        }
        for (int j = 0; j < temp7.length; j++) {
          result[(18 + j)] = temp7[j];
        }
        for (int j = 0; j < temp8.length; j++) {
          result[(21 + j)] = temp8[j];
        }
        resultlist.add(result);
      }
      for (int i = 0; i < resultlist.size(); i++) {
        combine((int[])resultlist.get(i), 3);
      }
      for (int i = 0; i < list.size(); i++)
      {
        int sum = 1;
        for (int j = 0; j < list.size(); j++) {
          if (i != j) {
            if (list.get(i).equals(list.get(j))) {
              sum++;
            }
          }
        }
        set.add(new Result24S3((Bean24S3)list.get(i), sum));
      }
      finallist.addAll(set);
      Collections.sort(finallist);
      File file1 = new File("24xuan3out.txt");
      if (file1.exists()) {
        file1.delete();
      }
      FileWriter writer = new FileWriter("24xuan3out.txt", true);
      for (Iterator iterator = finallist.iterator(); iterator.hasNext();)
      {
        Result24S3 object = (Result24S3)iterator.next();
        writer.write(object.toString() + "\r\n");
        writer.write("\r\n");
        writer.flush();
        System.out.println(object.toString());
      }
      writer.close();
    }
    else
    {
      System.out.println("实际有效行数不正确，行数应能被8整除，请检查!");
    }
  }
  
  static void zuhe(int[] a, int m)
  {
    int n = a.length;
    
    boolean flag = false;
    
    int[] tempNum = new int[n];
    for (int i = 0; i < n; i++)
    {
      if (i < m) {
        tempNum[i] = 1;
      } else {
        tempNum[i] = 0;
      }
      System.out.print(tempNum[i]);
    }
    print(tempNum);
    int[] arrt = new int[m];
    arrt = createResult(a, tempNum, m);
    list.add(new Bean24S3(arrt[0], arrt[1], arrt[2]));
    do
    {
      int pose = 0;
      int sum = 0;
      for (int i = 0; i < n - 1; i++) {
        if ((tempNum[i] == 1) && (tempNum[(i + 1)] == 0))
        {
          tempNum[i] = 0;
          tempNum[(i + 1)] = 1;
          pose = i;
          break;
        }
      }
      print(tempNum);
      int[] arrt1 = new int[m];
      arrt1 = createResult(a, tempNum, m);
      list.add(new Bean24S3(arrt1[0], arrt1[1], arrt1[2]));
      for (int i = 0; i < pose; i++) {
        if (tempNum[i] == 1) {
          sum++;
        }
      }
      for (int i = 0; i < pose; i++) {
        if (i < sum) {
          tempNum[i] = 1;
        } else {
          tempNum[i] = 0;
        }
      }
      flag = false;
      for (int i = n - m; i < n; i++) {
        if (tempNum[i] == 0) {
          flag = true;
        }
      }
    } while (flag);
  }
  
  public static int[] createResult(int[] a, int[] temp, int m)
  {
    int[] result = new int[m];
    
    int j = 0;
    for (int i = 0; i < a.length; i++) {
      if (temp[i] == 1)
      {
        result[j] = a[i];
        System.out.println("result[" + j + "]:" + result[j]);
        j++;
      }
    }
    return result;
  }
  
  public static void print(int[] a)
  {
    System.out.println("生成的辅助数组为：");
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
    if (n == 0)
    {
      StringBuffer stb = new StringBuffer();
      for (int i = 0; i < index; i++) {
        stb.append(b[i] + " ");
      }
      System.out.println(stb.toString());
      String[] arr = stb.toString().split(" ");
      list.add(new Bean24S3(Integer.valueOf(arr[0]).intValue(), Integer.valueOf(arr[1]).intValue(), Integer.valueOf(arr[2]).intValue()));
      return;
    }
    for (int i = begin; i < a.length; i++)
    {
      b[index] = a[i];
      getCombination(a, n - 1, i + 1, b, index + 1);
    }
  }
}
