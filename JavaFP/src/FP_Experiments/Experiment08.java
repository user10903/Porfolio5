package FP_Experiments;

import java.util.Arrays;
import java.util.List;

public class Experiment08 {
	public void run() {
	  String[] n1 = {"HH Pandya", "JC Buttler", "RM Patidar","DA Miller","Harpreet Brar"};
		
		List<String> n2 = Arrays.asList(n1);
		
		System.out.println("Serial name\n--------");
		n2.stream().forEach(String -> System.out.println(String));
		
		System.out.println("\nParallel names\n--------");
		n2.parallelStream().forEach(String -> System.out.print(String));
	}
	
	public static void main(String[] args) {
		new Experiment08().run();
	}

}
