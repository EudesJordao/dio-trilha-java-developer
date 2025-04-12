package DesafioControleFluxo;
import java.util.Scanner;

public class Contador {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int numero = sc.nextInt();
    System.out.println("Digite um número maior que o anterior: ");
    int numero2 = sc.nextInt();

    sc.close();

    try {
      contar(numero, numero2);

    } catch (ParametroIvalidoExeption e) {
      System.out.println(e.getMessage());
    }
  }
  static void contar(int num1, int num2) throws ParametroIvalidoExeption {
    ParametroIvalidoExeption.validarParametros(num1, num2);
    int contador = 0;
    for(int i = num1; i < num2; i++){
      contador++;
      System.out.println(contador);
    }
  }
}


