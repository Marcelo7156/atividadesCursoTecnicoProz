import java.util.Scanner;

public class atividades {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escolha uma das atividades: ");
        for(int i = 1; i < 9; i++){
            System.out.println(i + " para atividade " + i );
        }

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite a altura do retangulo: ");
                double altura = scanner.nextDouble();
                System.out.println("Digite a largura do retangulo: ");
                double largura = scanner.nextDouble();
                
                double total = largura * altura;

                System.out.println("Um retrangulo com "+altura+" cm de altura \n e com "+largura+" cm de largura, seu retangulo tem \n "+total+"cm quadrados!");
                
                break;

            case 2:
                System.out.println("********************************\nConversor de Celsius para Fahrenheit: \n ************************************** \n \n Digite a temperatura em Graus Celsius: \n\n");
                double celcius = scanner.nextDouble();

                double fahrenheit = celcius * 1.8 + 32;
                System.out.println(celcius + " graus celcius ficam " + fahrenheit + " graus Fahrenheit!");

                break;
            
            case 3:
                System.out.println("Digite dois numeros para fazermos uma soma: \n 1º numero: ");
                int num1 = scanner.nextInt();
                System.out.println("2º numero: ");
                int num2 = scanner.nextInt();

                int soma = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + soma);
                break;

            case 4:
                System.out.println("Digite dois numeros para fazermos uma subtração: \n ******************************************** \n 1º numero: ");
                int numS1 = scanner.nextInt();
                System.out.println("2º numero: ");
                int numS2 = scanner.nextInt();

                int subtracao = numS1 - numS2;
                
                System.out.println(numS1 + " - " + numS2 + " = " + subtracao);
                break;

            case 5:
                System.out.println("Digite dois numeros para fazrmos um divizão, \n lembrando que não existe divizão por zero: ");
                System.out.println("*********************************************");
                System.out.println("1º Numero: ");
                int divizao1 = scanner.nextInt();
                System.out.println("2º Numero: ");
                int divizao2 = scanner.nextInt();

                if(divizao2 > 0 ){
                    double totDiv = divizao1 / divizao2;
                    
                    System.out.println(divizao1 + " / " + divizao2 + " = " + totDiv);
                }else{
                    System.out.println("Valor digitado invalido para divizão! ");
                }
                break;

            case 6:
                System.out.println("Digite um numero para fazermos sua tabuada: ");
                double tabuada = scanner.nextDouble();

                for(int i = 0; i < 11; i++){
                        double totalTab = tabuada * i;

                        System.out.println(tabuada + " x " + i + " = " + totalTab);
                }
                break;

            case 7:
                System.out.println("Digite tres notas que vamos tirar sua media: \n Digite a 1ª Nota: ");
                double nota1 = scanner.nextDouble();    

                System.out.println("Digite a 2ª Nota: ");
                double nota2 = scanner.nextDouble();

                System.out.println("Digite a 3ª Nota: ");
                double nota3 = scanner.nextDouble();

                double media = (nota1 + nota2 + nota3) /3;

                System.out.println("A media das suas notas é: " + media);
                break;

            case 8:
                System.out.println("Digite a sua Altura e peso para calcularmos seu IMC: ");
                System.out.println("Altura: ");
                double alturaPessoa = scanner.nextDouble();
                System.out.println("Peso: ");
                double peso = scanner.nextDouble();

                double imc = peso / (alturaPessoa * alturaPessoa);

                System.out.print("Seu IMC é de " + imc + " você tem ");

                if(imc < 16){
                    System.out.println("uma magreza grave!");
                }else if(imc < 17){
                    System.out.println("uma magreza moderada!");
                }else if(imc < 19){
                    System.out.println("uma magreza leve!");
                }else if(imc < 25){
                    System.out.println("o peso ideal!");
                }else if(imc < 30){
                    System.out.println("sobrepeso!");
                }else if(imc < 35){
                    System.out.println("obesidade grau I!");
                }else if(imc < 40){
                    System.out.println("obesidade grau II ou severa!");
                }else{
                    System.out.println("obesidade grau III ou mórbida!");
                }
                break;
        
            default:
                break;
        }
    }
}
