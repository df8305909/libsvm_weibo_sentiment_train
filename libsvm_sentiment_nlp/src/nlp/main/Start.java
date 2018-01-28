package nlp.main;

import svm.SvmDemo;
import nlp.util.Step1;
import nlp.util.Step2;
import nlp.util.Step3;
import nlp.util.Step4;
import nlp.util.Step5;
import nlp.util.Step6;

public class Start {

	public static boolean start(){
		try {
			Step1.step1();
			Step2.step2();
			Step3.step3();
			Step4.step4();
			Step5.step5();
			Step6.step6();
			SvmDemo.svm_start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return false;
		
	}
	public static void main(String[] args) {
		start();
	}
}
