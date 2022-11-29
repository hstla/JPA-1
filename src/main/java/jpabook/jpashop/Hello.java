package jpabook.jpashop;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Hello {
  private String data;

  public static void main(String[] args) {
    Hello hello = new Hello();
    hello.setData("안녕");
    System.out.println(hello.getData());
  }
}
