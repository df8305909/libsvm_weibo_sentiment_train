package svm;

import java.io.IOException;

public class SvmDemo {
	// "-c","9.0", "-g","1.0",
	public static void svm_start() throws IOException {
		
		  String[] arg = {"train.txt", //训练集  
          "model.txt" }; // 存放SVM训练模型  
		System.out.println("........SVM运行开始..........");
		long start = System.currentTimeMillis();
		
		 svm_train.main(arg); //训练
		
		System.out.println("测试用时:" + (System.currentTimeMillis() - start));
	}

	

}
