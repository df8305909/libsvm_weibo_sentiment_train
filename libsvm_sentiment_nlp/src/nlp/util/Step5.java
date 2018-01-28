package nlp.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

//逆回
public class Step5 {

	public static void step5() throws IOException{
		BufferedReader br =new BufferedReader(new FileReader("./com__data/i_data_ppl_3.txt"));
		BufferedReader br2 =new BufferedReader(new FileReader("./com__data/wordss.txt"));
		BufferedWriter bw =new BufferedWriter(new FileWriter("./com__data/i_data_ppl_nihui.txt"));
		String s=null;
		String bb=null;
		HashMap map=new HashMap();
		while((bb=br2.readLine())!=null){
			String[] sp2 = bb.split(" ");
			if(sp2.length==2){
				map.put(sp2[1],sp2[0]);
			}
		}
		
		while((s=br.readLine())!=null){
			String[] sp = s.split(" |	");
			bw.write("neg ");
			
			for(int i=1;i<sp.length;i++){
				bw.write(map.get(sp[i])+" ");
				
			}
			
			bw.newLine();
		}
		br.close();
		br2.close();
		bw.close();
	}
}
