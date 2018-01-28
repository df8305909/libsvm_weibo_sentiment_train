package util;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//ºÏ²¢
public class TestStep2 {
static List li =new ArrayList();
	
	public static void sta2() throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream("pos60000-1.txt"), "GBK"));
		BufferedReader br2 =new BufferedReader(new InputStreamReader(new FileInputStream("neg60000-1.txt"), "GBK"));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("negpos-2.txt"), "GBK"));

		String s=null;
		while((s=br.readLine())!=null){
			li.add(s);
			
		}
		
		String s2=null;
		while((s2=br2.readLine())!=null){
			li.add(s2);
			
		}
		
		Iterator it = li.iterator();
		while(it.hasNext()){
			
			String next = (String)it.next();
			bw.write(next);
			bw.newLine();
			
		}
		
		br.close();
		br2.close();
		bw.close();
		
	}
}
