package br.com.java.modelo;

public class Gato extends Animal {
  public void ArranharMoveis(){
    System.out.println("Arranhando moveis");
  }

  @Override
  public void emitirSom(){
    System.out.println("miau miau");
  }
}
