package FP_Experiments;

import java.util.Arrays;
import java.util.List;

public class Experiment05 {
	
	public static void main(String[] args) {
	  String[] n1 = {"HH Pandya", "JC Buttler", "RM Patidar","DA Miller","Harpreet Brar"};
		
		/*
		 * for (String name:n1){
		 * System.out.println(name);
		 * }
		 */
		List<String> n2 = Arrays.asList(n1);
		n2.forEach(String -> System.out.println(String));
	}
	

}
