import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite oque voce quer criptografar");
        Criptografar.criptografar(scan.nextLine());

          System.out.print("\nSeu codigo criptografado é: " + Criptografar.criptografado + "\n");
          System.out.println("\nDeseja descriptografar? (s/n)");
          char descriptografar = scan.next().charAt(0);
          if(descriptografar == 's') {
            System.out.println(Criptografar.descriptografado);
          } else {
            System.out.println("\nSeu codigo criptografado é: " + Criptografar.criptografado + "\n");
          }
        }
    }