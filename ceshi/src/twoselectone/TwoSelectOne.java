package twoselectone;

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

public class TwoSelectOne {

	/** 
	 * @Title: main 
	 * @Description: 3选一
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("2xuan1.txt");
		List<String> alist = new ArrayList<String>();
		List resultlist = new ArrayList();
		Set set = new HashSet();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = br.readLine())!=null){
				line = line.trim().replace(" ", "");
				if(!"".equals(line)){
					String[] strArr = line.split("，");
					for (int i = 0; i < strArr.length; i++) {
						alist.add(strArr[i]);
					}
				}
				
			}
			br.close();
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
				set.add(new TwoSelectOneBean(sum, alist.get(i)));
			}
			resultlist.addAll(set);
			Collections.sort(resultlist);
			File file1 = new File("2xuan1out.txt");
			if(file1.exists()){
				file1.delete();
			}
			FileWriter writer = new FileWriter("2xuan1out.txt", true);
			for (int i = 0; i < resultlist.size(); i++) {
				TwoSelectOneBean object = (TwoSelectOneBean) resultlist.get(i);
				writer.write(object.toString()+"\r\n");
				writer.write("\r\n");
				writer.flush();
				System.out.println(object.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
