package svm;

import java.io.IOException;

public class SvmDemo {
	// "-c","9.0", "-g","1.0",
	public static void svm_start() throws IOException {
		
		String[] parg = {
				"./com__data/i_data_test.txt", // 测试数据
				"./com__data/model2.txt", // 调用训练模型
				"./com__data/predict.txt" }; // 预测结果
		System.out.println("........SVM运行开始..........");
		long start = System.currentTimeMillis();
		
		// svm_train.main(arg); //训练
		// 预测 //
		svm_predict.main(parg);
		System.out.println("测试用时:" + (System.currentTimeMillis() - start));
	}

	public static void main(String[] args) throws IOException {
		String[] parg = {
				"./com__data/i_data_test.txt", // 测试数据
				"./com__data/model2.txt", // 调用训练模型
				"./com__data/predict.txt" }; // 预测结果
		System.out.println("........SVM运行开始..........");
		long start = System.currentTimeMillis();
		
		// svm_train.main(arg); //训练
		// 预测 //
		svm_predict.main(parg);
		System.out.println("测试用时:" + (System.currentTimeMillis() - start));
	}

}
