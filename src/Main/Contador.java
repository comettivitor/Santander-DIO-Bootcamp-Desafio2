package Main;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parametro: ");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            exception.printStackTrace();
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm < parametroDois){
            int contagem = parametroDois - parametroUm;
            for(int i = 1; i <= contagem; i++){
                System.out.println("Imprimindo o numero " + i);
            }
        }else{
            throw new ParametrosInvalidosException();
        }
        
        //realizar o for para imprimir os números com base na variável contagem
        
    }
}
