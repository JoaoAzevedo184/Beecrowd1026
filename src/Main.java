import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a,b;

        while (True){
            try{
                String parametros = teclado.nextLine().strip();
                if (parametros.isEmpty()) {
                    break;  // Se a entrada estiver vazia, sai do loop
                }

                String[] partes = entrada.split(" ");

                a = Integer.parseInt(partes[0]);
                b = Integer.parseInt(partes[1]);
            }catch (ParametrosInvalidosException e){

            }catch (Exception e){

            }
        }
    }
    public static class ParametrosInvalidosException extends Exception{
        public ParametrosInvalidosException() {
            super("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }
    public static void operationXOR(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        int resultado = parametroUm ^ parametroDois;
        if(parametroUm>=parametroDois){
            throw new ParametrosInvalidosException();
        }
        System.out.println("Resultado de " + parametroUm + " ^ " + parametroDois + " = " + resultado);
    }
}