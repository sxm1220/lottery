import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


/**
 * 读取文件中的数据进行统计分析
 * @author Administrator
 *
 */
public class Count {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		File file = new File("3xuan2.txt");
		List alist = new ArrayList();
		List resultlist = new ArrayList();
		Set set = new HashSet();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = br.readLine())!=null){
				line = line.trim().replace(" ", "");
				if(!"".equals(line)){
					String[] strArr = line.split("，");
					int[] intArr = new int[3] ;
					for(int i = 0;i<strArr.length;i++){
						intArr[i] = Integer.valueOf(strArr[i]);
					}
					
					alist.addAll(zuhe(intArr, 3, 2));
				}
				
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < alist.size(); i++) {
			int sum = 1;
			for (int j = 0; j < alist.size(); j++) {
				if(i==j){
					continue;
				}
				if(alist.get(i).equals(alist.get(j))){
					sum++;
				}
			}
			set.add(new resultBean(sum, (Bean)alist.get(i)));
		}
		resultlist.addAll(set);
		Collections.sort(resultlist);
		int size = resultlist.size();
		System.out.println("结果为：");
		File file1 = new File("3xuan2out.txt");
		if(file1.exists()){
			file1.delete();
		}
		FileWriter writer = new FileWriter("3xuan2out.txt", true);
		for (Iterator iterator = resultlist.iterator(); iterator.hasNext();) {
			resultBean object = (resultBean) iterator.next();
			writer.write(object.toString()+"\r\n");
			writer.write("\r\n");
			writer.flush();
			System.out.println(object.toString());
		}
		writer.close();
		System.out.println("前三排序为：");
		System.out.println(resultlist.get(size-1));
		System.out.println(resultlist.get(size-2));
		System.out.println(resultlist.get(size-3));
	}
	
	public static List zuhe(int[] intarr,int index,int head){
		List list = new ArrayList(); 
		list.add(new Bean(intarr[0], intarr[1]));
		list.add(new Bean(intarr[0], intarr[2]));
		list.add(new Bean(intarr[1], intarr[2]));
		return list;
	}

}

