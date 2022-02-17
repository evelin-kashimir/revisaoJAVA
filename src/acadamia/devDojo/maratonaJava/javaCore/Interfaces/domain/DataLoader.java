package acadamia.devDojo.maratonaJava.javaCore.Interfaces.domain;

//Funciona como um contrato, serve para criar métodos que serão implementados em outras classes
public interface DataLoader {
  void load();
  void checkPermission();
  default void metodoConcreto(){
    System.out.println("Fazendo o teste sem alterar nada...");
  }
}
