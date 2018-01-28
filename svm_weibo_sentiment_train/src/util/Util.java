package util;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Util {

	
	public static void Sta() throws Exception{   
        // 获得指定文件对象  
        File file = new File("./_data");   
        // 获得该文件夹内的所有文件   
        File[] array = file.listFiles();   
        	Set  set=new HashSet();
        for(int i=0;i<array.length;i++)
        {   
            if(array[i].isFile())//如果是文件
            {   
                   
                // 只输出文件名字  
                System.out.println(array[i].getName());   
                if(array[i].getName().equals("pos60000.txt")){
                	TestStep1Pos.sta();
                }else if(array[i].getName().equals("neg60000.txt")){
                	TestStep1Neg.sta();
                	
                }
              
            }
          
        }
	
    }   

}
