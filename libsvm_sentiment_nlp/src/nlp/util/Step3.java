package nlp.util;
//编号
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Step3 {

	public static void step3() throws IOException{
		BufferedReader br =new BufferedReader(new FileReader("./com__data/i_data_ppl_1.txt"));//初始分词完的文件
		BufferedReader br2 =new BufferedReader(new FileReader("./com__data/wordss.txt"));//词袋
		BufferedWriter bw =new BufferedWriter(new FileWriter("./com__data/i_data_ppl_2.txt"));//输出
		String s=null;
		String bb=null;//停用词
		HashMap map=new HashMap();
		while((bb=br2.readLine())!=null){
			String[] sp2 = bb.split(" ");
			if(sp2.length==2){
				map.put(sp2[0],sp2[1]);
			}
		}
		
		while((s=br.readLine())!=null){
			String[] split = s.split(" |	");
			if(split[0].equals("pos")){
				bw.write("1 ");
			}else{
				bw.write("2 ");
			}
			for(int i=1;i<split.length;i++){
				if(map.containsKey(split[i])){
					bw.write(map.get(split[i])+" ");
					//System.out.println(map.get(split[i]));
				}
				
			}
			
			bw.newLine();
		}
		
		br.close();
		bw.close();
		br2.close();
	}

}
