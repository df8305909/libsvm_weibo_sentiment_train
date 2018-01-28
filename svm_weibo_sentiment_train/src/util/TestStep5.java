package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
/**
* 去重复，1:1 1:1变成1:2
* @author lenovo
*1
*/


public class TestStep5{

//统计做成train
  static HashMap m =new HashMap();
  static Long y=1l;
	public static void sta() throws Exception {
		
		StringBuilder result = new StringBuilder();
		BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream("negpos-4a.txt"), "GBK"));
		String s = null;
		String s2 = null;
		
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("train.txt"), "GBK"));			
		
		
		
		//&&(s2 = br2.readLine()) != null
		while((s = br.readLine()) != null){
			
			
			
			String[] sp = s.split(" ");
			bw.write(sp[0]+" ");
			
			int[] so=new int[50000];
			for(int i=1;i<sp.length;i++){
					int b=Integer.parseInt(sp[i]);
					so[b]+=1;
				
			}
			for(int i=0;i<so.length;i++){
				if(so[i]!=0){
					bw.write(i+":"+so[i]);
					bw.write(" ");
				}
				
				
			}
			//bw.write("#"+s2);
			bw.newLine();
			
			/*y++;
			System.out.println(y);*/
			
		
	}
		bw.close();
		br.close();
		//br2.close();
	}

}
