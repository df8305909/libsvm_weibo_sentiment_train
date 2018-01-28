package nlp.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
//2去空白
public class Step2 {

	public static void step2() throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream("./com__data/i_data_ppl.txt"),"GBK"));

		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(  
                new FileOutputStream("./com__data/i_data_ppl_1.txt"), "GBK"));
		String s=null;
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
