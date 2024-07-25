import java.util.Random;
import java.util.Scanner;

public class DesafioLoop {
    public static void main(String[] args) throws Exception {

        @SuppressWarnings("resource")

        Scanner scan = new Scanner(System.in);

        // Gera um numero aleatorio de 1 a 100
        int numGerado = new Random().nextInt(100);
        
        int tentativas = 0;
        int numTentativa = 0;

        System.out.println("Foi gerado o numero, por favor informe seu palpite");

        while (tentativas < 5) {

            numTentativa = scan.nextInt();
            
            if (numTentativa == numGerado) {

                System.out.println("""
                        Parabéns, você acertou o numero que foi gerado neste desafio em %d tentativas
                        """.formatted(tentativas));
                break;

            }
            else if (numTentativa > numGerado) {
                
                System.out.println("O numero inforamdo é maior do que o qeu foi gerado");
                tentativas++;
                System.out.println("Qual seu proximo palpite ?");

            }
            else{

                System.out.println("O numero informado é menor do que o que foi gerado");
                tentativas++;
                System.out.println("Qual seu proximo palpite ?");

            }

        }

        if (tentativas == 5 && numTentativa !=numGerado) {
            System.out.println("""
                    Você não possui mais chances (GAME OVER)
                    O numero correto era: %d
                    """.formatted(numGerado));
        }
    }
}
