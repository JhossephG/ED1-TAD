import mypackage.Stack;
import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Stack<Integer> pilha = new Stack();
        int num, resto, quoc;
        System.out.print("Digite um número inteiro em decimal: ");
        num = in.nextInt();
         do {
            quoc = num / 2;
            resto = num % 2;
            pilha.push(resto);
            num = quoc; 
         } while (num != 0);
         while (pilha.isEmpty() == false) {
             resto = pilha.pop();
             System.out.print(resto);
         }
         System.out.println();
    }
}
