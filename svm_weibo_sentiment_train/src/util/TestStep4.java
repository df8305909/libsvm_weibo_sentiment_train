package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.*;
import java.io.InputStreamReader;
import java.util.HashMap;
//±àºÅ
public class TestStep4 {
static int a=1;
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void sta() throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream("negpos-3.txt"), "GBK"));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("negpos-4.txt"), "GBK"));			
		BufferedWriter bw2=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("wordss.txt"), "GBK"));			
		String s=null;
		HashMap<String,String> m=new HashMap<String,String>(); 
		while((s=br.readLine())!=null){
			String[] split = s.split(" |	");
			if(split[0].equals("pos")){
				bw.write("1 ");
			}else{
				bw.write("2 ");
			}
			for(int i=1;i<split.length;i++){
				
				if(!m.containsKey(split[i])){
					m.put(split[i], a+"");
					bw.write(a+" ");
					bw2.write(split[i]+" "+a);
					bw2.newLine();
					a++;
				}else{
					String string = m.get(split[i]);
					bw.write(string+" ");
				}
				
			}
			bw.newLine();
		}
		bw2.close();
		br.close();
		bw.close();
	}

}
