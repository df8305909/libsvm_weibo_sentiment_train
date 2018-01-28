package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

//È¥¿Õ°×
public class TestStep4a {
	
	public static void sta() throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream("negpos-4.txt"), "GBK"));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("negpos-4a.txt"), "GBK"));			
			String s=null;
			HashMap<String,String> m=new HashMap<String,String>(); 
			while((s=br.readLine())!=null){
				String[] abc=s.split(" |	");
				if(abc.length==1){
				}else{
					bw.write(s);
						
					bw.newLine();
				}
				
			}

			br.close();
			bw.close();
		}
	}

