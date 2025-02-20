import java.util.Scanner;

public class Janela {
    public static void main (String[] args){
        AulaExercicio03 r1, r2;
        float altura;
        float largura;
        float area;
        float perimetro;

        try(Scanner input = new Scanner(System.in)){
            System.out.print("Digite a altura do 1º retângulo: ");
            altura = input.nextFloat();
            System.out.print("Digite a largura do 1º retângulo: ");
            largura = input.nextFloat();

            r1 = new AulaExercicio03();
            r1.setAltura(altura);
            r1.setLargura(largura);

            area = r1.calculaArea();
            perimetro = r1.calculaPerimetro();

            System.out.println("A área do 1º retângulo é       : " + area);
            System.out.println("O perímetro do 1 1º retângulo é: " + perimetro);

            System.out.print("Digite a altura do 2º retângulo: ");
            altura = input.nextFloat();
            System.out.print("Digite a largura do 2º retângulo: ");
            largura = input.nextFloat();


            r2 = new AulaExercicio03();
            r2.setAltura(altura);
            r2.setLargura(largura);

            area = r2.calculaArea();
            perimetro = r2.calculaPerimetro();

            System.out.println("A área do 2º retângulo é       : " + area);
            System.out.println("O perímetro do 2º retângulo é  : " + perimetro);


        }
    }
}
