import java.util.Arrays;
import java.util.Scanner;
public class vetores {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escolha uma opção: ");
        System.out.println("1 Para inicio vetor: \n2 Para percorrer 2 vetores: ");
        System.out.println("3 para For each: \n********************\n");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                int n[] = new int[4];

                for(int i = 0; i < n.length; i++){
                    n[i] = 2 * i;
                    System.out.print("numero:"+n[i] + "\n");
                }
                System.out.println(n.length);
                break;

            case 2:
                String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out",
                    "Nov","Dev"};
                int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 30};

                for(int c = 0; c < mes.length; c++){
                    System.out.print(mes[c] + " tem "+ tot[c] + " dias.\n");
                }    
                break;

            case 3:
                int num[] = {5, 12, 7, 8, 13, 5};

                for(int val: num){
                    //num[val] = 2 * 3 + val;
                    System.out.print(val + " ");
                }
                System.out.println(" ");
                Arrays.sort(num);
                for (int i : num) {
                    System.out.print(i + " ");
                }
                break;
        
            default:
                break;
        }

        
    }
}
