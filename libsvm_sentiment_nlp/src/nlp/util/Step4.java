package nlp.util;
//去空白
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Step4 {
public static void step4() throws IOException{
	BufferedReader br =new BufferedReader(new FileReader("./com__data/i_data_ppl_2.txt"));
	BufferedWriter bw =new BufferedWriter(new FileWriter("./com__data/i_data_ppl_3.txt"));
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
