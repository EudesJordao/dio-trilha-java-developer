package Desafios.DesafioControleFluxo;

public class ParametroIvalidoExeption extends Exception {

  public ParametroIvalidoExeption(String message){
    super(message);
  }

  public static void validarParametros(int num1, int num2) throws ParametroIvalidoExeption{
    if(num1 >= num2){
      throw new ParametroIvalidoExeption("O primeiro número deve ser menor que o segundo número");
    }
  }
}