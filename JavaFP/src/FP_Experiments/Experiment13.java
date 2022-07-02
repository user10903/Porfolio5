package FP_Experiments;

import java.util.function.Supplier;

public class Experiment13 {
  class NameSupplier implements Supplier<String>{
    String[] String = {"HH Pandya", "JC Buttler", "RM Patidar","DA Miller","Harpreet Brar"};
    int nextIndex = 0;
    public String get() {
      if(nextIndex< String.length) {
        return String[nextIndex++];
      }
      return null;
    }  
  }
  
  public void run() {
    NameSupplier ns = new NameSupplier();

    System.out.println(ns.get());
    System.out.println(ns.get());
    System.out.println(ns.get());
    System.out.println(ns.get());
    System.out.println(ns.get());
    System.out.println(ns.get());
  }

  public static void main(String[] args) {
    new Experiment13().run();
  }
}
