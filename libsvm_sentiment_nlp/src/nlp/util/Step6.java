package nlp.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

//将4生文件做成测试集
public class Step6 {
	 static HashMap m =new HashMap();
	  static Long y=1l;
	public static void step6() throws IOException{
		StringBuilder result = new StringBuilder();
		BufferedReader br =new BufferedReader(new FileReader("./com__data/i_data_ppl_3.txt"));
		String s = null;
		String s2 = null;
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("./com__data/i_data_test.txt"));
		
		
		
		//&&(s2 = br2.readLine()) != null
		while((s = br.readLine()) != null){
			
			
			
			String[] sp = s.split(" ");
			bw.write(sp[0]+" ");
			
			int[] so=new int[30000];
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
