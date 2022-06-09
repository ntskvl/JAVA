import java.util.Scanner;

public class Ativ4 {
    public static void main(String[] args){
        Scanner velocidade = new Scanner(System.in);
        System.out.println("Digite a velocidade: ");
        double val = velocidade.nextDouble();
        if(val > 80){
            Double acima = val - 80;
            Double multa = acima * 5;
            System.out.println("Voce ultrapassou a velocidade permitida, sua multa e de: " + multa);
        }else{
            System.out.println("Voce esta dentro do limite permitido.");
        }

    }
}
