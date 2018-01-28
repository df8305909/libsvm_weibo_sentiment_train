package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.io.*;

import nlp.NlpirMethod;

public class TestStep1Neg {
	
	public static void sta() throws Exception {
		
		BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream("./_data/neg60000.txt"), "GBK"));
		BufferedReader br2 =new BufferedReader(new FileReader("stopwords.txt"));
		//∑÷¥ ("neg60000-1.txt")
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("neg60000-1.txt"), "GBK"));
		 
		//¥…∆ø
		BufferedWriter bw2 =new BufferedWriter(new FileWriter("cp_neg.txt"));
		String s=null;
		String bb=null;//Õ£”√¥ 
		HashSet set=new HashSet();
		HashMap map=new HashMap();
		while((bb=br2.readLine())!=null){
			set.add(bb);
		}
		int sta=1;
		while((s=br.readLine())!=null){
			String mmm=Tool.filterEmoji(s);
			String result = NlpirMethod.NLPIR_ParagraphProcess(mmm, 1);
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
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			Object key=it.next();
			Integer val=(Integer)map.get(key);
			if(val>=500){
				bw2.write(key+" "+val);
				bw2.newLine();
			}
		}
		
		br.close();
		bw.close();
		bw2.close();
	}
}