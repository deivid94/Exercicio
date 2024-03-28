package br.com.java.modelo;

public class Cachorro extends Animal {
  
  public void AbanarRabo(){
    System.out.println("Abanando o Rabo");
  }


  @Override
  public void emitirSom(){
    System.out.println("Au au");
  }
  

}
