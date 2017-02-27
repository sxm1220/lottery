package twelve;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Select12S5 {
	private static List list = new ArrayList();
	private static List finallist = new ArrayList();

	public static void main(String[] args) throws Exception {
		File file = new File("12xuan5.txt");
		List alist = new ArrayList();
		List resultlist = new ArrayList();
		Set set = new HashSet();
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;
		int temp = 1;
		while((line = br.readLine())!=null){
			int[] intArr = new int[3] ;
			line = line.trim().replace(" ", "");
			if(!"".equals(line)){
				String[] strArr = line.split("，");
					for(int i = 0;i<strArr.length;i++){
						intArr[i] = Integer.valueOf(strArr[i]);
					}
					alist.add(intArr);
			}
			temp++;
		}
		br.close();
		if((alist.size())%4==0){
			for (int i = 0; i < (alist.size())/3; i++) {
				int[] temp1 = new int[3] ;
				int[] temp2 = new int[3] ;
				int[] temp3 = new int[3] ;
				int[] temp4 = new int[3] ;
				int[] result = new int[12] ; 
				if(i==0){
					temp1 = (int[]) alist.get(0+3*i);
					temp2 = (int[]) alist.get(1+3*i);
					temp3 = (int[]) alist.get(2+3*i);
					temp4 = (int[]) alist.get(3+3*i);
				}else{
					temp1 = (int[]) alist.get(i+3*i);
					temp2 = (int[]) alist.get(i+1+3*i);
					temp3 = (int[]) alist.get(i+2+3*i);
					temp4 = (int[]) alist.get(i+3+3*i);
				}
				for (int j = 0; j < temp1.length; j++) {
					result[j]=temp1[j];
				}
				for (int j = 0; j < temp2.length; j++) {
					result[3+j]=temp2[j];
				}
				for (int j = 0; j < temp3.length; j++) {
					result[6+j]=temp3[j];
				}
				for (int j = 0; j < temp4.length; j++) {
					result[9+j]=temp4[j];
				}
				resultlist.add(result);
		}
		for (int i = 0; i < resultlist.size(); i++) {
			//zuhe((int[]) resultlist.get(i), 2);
			combine((int[]) resultlist.get(i), 5);
		}
		for (int i = 0; i < list.size(); i++) {
			int sum = 1;
			for (int j = 0; j < list.size(); j++) {
				if(i==j){
					continue;
				}
				if(list.get(i).equals(list.get(j))){
					sum++;
				}
			}
			set.add(new Result12S5((Bean12S5) list.get(i),sum));
		}
		finallist.addAll(set);
		Collections.sort(finallist);
		File file1 = new File("12xuan5out.txt");
		if(file1.exists()){
			file1.delete();
		}
		FileWriter writer = new FileWriter("12xuan5out.txt", true);
		for (Iterator iterator = finallist.iterator(); iterator.hasNext();) {
			Result12S5 object = (Result12S5) iterator.next();
			writer.write(object.toString()+"\r\n");
			writer.write("\r\n");
			writer.flush();
			System.out.println(object.toString());
		}
		writer.close();
		
	}else{
		System.out.println("实际有效行数不正确，行数应能被4整除，请检查!");
	}
		}
		
	@SuppressWarnings("unchecked")
	static void zuhe(int[] a ,int m){
		   int n = a.length;

		   boolean flag = false; // 是否是最后一种组合的标记
	
		   // 生成辅助数组。首先初始化，将数组前n个元素置1，表示第一个组合为前n个数。
		   int[] tempNum = new int[n]; 
		   for (int i = 0; i < n; i++) {
			    if (i < m) {
			     tempNum[i] = 1;
	
			    } else {
			     tempNum[i] = 0;
			    }
			    System.out.print(tempNum[i]);
		   } 
		   
		   print(tempNum);// 打印辅助数组 
		   int[] arrt = new int[m];
		   arrt = createResult(a, tempNum, m);// 打印第一中默认组合
		   list.add(new Bean12S5(arrt[0],arrt[1],arrt[2],arrt[3],arrt[4]));
		   
		   do {
		    int pose = 0; // 记录改变的位置
		    int sum = 0; // 记录改变位置 左侧 1 的个数
		    // 然后从左到右扫描数组元素值的“10”组合，找到第一个“10”组合后将其变为“01”
		    for (int i = 0; i < (n - 1); i++) {
		     if (tempNum[i] == 1 && tempNum[i + 1] == 0) {
		      tempNum[i] = 0;
		      tempNum[i + 1] = 1;
		      pose = i;
		      break;
		     }
		    }
		    print(tempNum);// 打印辅助数组
		    int[] arrt1 = new int[m];
		    arrt1 = createResult(a, tempNum, m);// 打印第一中默认组合
		    list.add(new Bean12S5(arrt1[0],arrt1[1],arrt1[2],arrt1[3],arrt1[4]));
		    

		    // 同时将其左边的所有“1”全部移动到数组的最左端。

		    for (int i = 0; i < pose; i++) {
		     if (tempNum[i] == 1)
		      sum++;
		    }

		    for (int i = 0; i < pose; i++) {
		     if (i < sum)
		      tempNum[i] = 1;
		     else
		      tempNum[i] = 0;
		    }

		    // 判断是否为最后一个组合：当第一个“1”移动到数组的m-n的位置，即n个“1”全部移动到最右端时，就得到了最后一个组合。
		    flag = false;
		    for (int i = n - m; i < n; i++) {

		     if (tempNum[i] == 0)
		      flag = true;

		    }
		   } while (flag);

		} 
	
	// 根据辅助数组和原始数组生成 结果数组
	public static int[] createResult(int[] a, int[] temp, int m) {
	   int[] result = new int[m];

	   int j = 0;
	   for (int i = 0; i < a.length; i++) {

	    if (temp[i] == 1) {
	     result[j] = a[i];
	     System.out.println("result[" + j + "]:" + result[j]);
	     j++;

	    }
	   }

	   return result;
	} 
	// 打印整数数组的方法
	public static void print(int[] a) {
	   System.out.println("生成的辅助数组为：");
	   for (int i = 0; i < a.length; i++) {
	    System.out.print(a[i]);
	   }
	   System.out.println();
	} 
	/**
	 * 新的算法
	 * @param a
	 * @param n
	 */
	public static void combine(int[] a, int n) {
		
		if(null == a || a.length == 0 || n <= 0 || n > a.length)
			return;
			
		int[] b = new int[n];//辅助空间，保存待输出组合数
		getCombination(a, n , 0, b, 0);
	}

	private static void getCombination(int[] a, int n, int begin, int[] b, int index) {
		
		if(n == 0){//如果够n个数了，输出b数组
			StringBuffer stb = new StringBuffer();
			for(int i = 0; i < index; i++){
				stb.append(b[i]+" ");
				//System.out.print(b[i] + " ");
			}
			//System.out.println();
			System.out.println(stb.toString());
			String[] arr = stb.toString().split(" ");
			list.add(new Bean12S5(Integer.valueOf(arr[0]),Integer.valueOf(arr[1]),
					Integer.valueOf(arr[2]),Integer.valueOf(arr[3]),Integer.valueOf(arr[4])));
			return;
		}
			
		for(int i = begin; i < a.length; i++){
			
			b[index] = a[i];
			getCombination(a, n-1, i+1, b, index+1);
		}
		
	}
}
