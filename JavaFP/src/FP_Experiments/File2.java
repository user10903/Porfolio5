package FP_Experiments;

import java.io.BufferedReader;
import java.io.FileReader;

public class File2 {
	public static void main(String[] args)throws Exception{
		BufferedReader r = new BufferedReader(new FileReader("workshop5data/Helen_of_Troy.txt"));
		//r.lines().forEach(l->System.out.println(l));
		System.out.println(r.lines().count());
		r.close();
	}
}
