package com.acme.basic;

public class HelloWorld {

  void sayHello(String str) {
    if("11".equals(str)){
      System.out.println("Hello World!");
    }else{
      System.out.println("Hello World!111");
    }

  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
  }

}
