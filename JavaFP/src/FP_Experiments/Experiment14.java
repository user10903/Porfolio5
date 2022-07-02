package FP_Experiments;

import java.util.stream.Stream;

public class Experiment14 {
  class NameStreamBuilder {
    public Stream<String> build(){
      Stream.Builder<String> builder = Stream.builder(); 
      builder.add("HH Pandya");
      builder.add("JC Buttler");
      builder.add("RM Patidar");
      builder.add("DA Miller");
      builder.add("Harpreet Brar");
      return builder.build();
    }
  }
  
  public void run() {
    NameStreamBuilder builder = new NameStreamBuilder();
    Stream <String> nameStream = builder.build();
    nameStream.forEach(n -> System.out.println(n));
  }

  public static void main(String[] args) {
    new Experiment14().run();
  }
}
