
import java.util.Scanner;



public class Calculadora {
    public static void main(String[] args) {
        Scanner arg= new Scanner(System.in); 

        System.out.print("Digite o Primeiro Numero:   ");
        double num1 = arg.nextDouble();
        
        System.out.print("Digite o Tipo de Operação (+ , - , *, / ):  ");
        char operacao = arg.next().charAt (0);
        
        System.out.print("Digite o Segundo Numero:  ");
        double num2 = arg.nextDouble();

        double resultado = 0;

        
        if (operacao == '+' || operacao == 'a'){
            resultado = num1 + num2; }
        
        else if (operacao == '-' || operacao == 's'){
            resultado = num1 - num2 ;
        }
        else if (operacao == '*' || operacao == 'm'){
            resultado = num1 * num2;
        }
        else if (operacao == '/' || operacao == 'd') {
            if (num2 !=0) {
            resultado = num1 / num2;
            }
            else{
                arg.close();
                throw new ArithmeticException("Operação Invalida");
            }
        }
        else{
            arg.close();
            throw new IllegalArgumentException ("Opção Invalida");

        }
        System.out.println("O Resultado é :  " + resultado + "  Da Operação "+ operacao);


        

    }
}
