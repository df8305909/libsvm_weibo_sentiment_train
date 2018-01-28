package nlp.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;








import nlp.demo.NlpirMethod;
//分词
public class Step1 {

	

	public static void step1() throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream("./com__data/initial_data.txt"),"GBK"));
		BufferedReader br2 =new BufferedReader(new FileReader("./com__data/stopwords.txt"));
		//分词
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(  
                new FileOutputStream("./com__data/i_data_ppl.txt"), "GBK"));
		
		String s=null;
		String bb=null;//停用词
		HashSet set=new HashSet();
		HashMap map=new HashMap();
		//读取停用词语
		while((bb=br2.readLine())!=null){
			set.add(bb);
		}
		int sta=1;
		//分词
		while((s=br.readLine())!=null){
			String result = NlpirMethod.NLPIR_ParagraphProcess(s, 1);
			String[] s2 = result.split(" ");
			StringBuffer a=new StringBuffer();
			bw.write("neg ");
			for(int i=0;i<s2.length;i++){
				//
				if(s2[i].contains("/e")||s2[i].contains("/n")||s2[i].contains("/t")||s2[i].contains("/w")||s2[i].contains("/m")||s2[i].contains("/ude1")){
				}else{
					
					String b=s2[i].replaceAll("/|[a-z]|[A-Z]|[0-9]","");
					if(set.contains(b)){
					}else{
						bw.write(b+" ");
						if(!map.containsKey(b)){
							map.put(b, 1);
						}else{
							Integer ob = (Integer)map.get(b);
							
							int value=ob+1;
							map.put(b, value);
						}
					}
				}
				
			}
			bw.newLine();
	}
		br.close();
		br2.close();
		bw.close();
}
}