import java.util.*;

public class Exercicio02 {
    public static void main (String[] args){
            double[] vetorDouble = {8.4, 9.3, 0.2, 7.9, 3.4};
            Arrays.sort(vetorDouble);
            System.out.print("\nVETOR ORDENADO: ");

            for (double valor : vetorDouble){
                System.out.printf("%.1f - ", valor);
            }

            int[] vetorPreenchido = new int[10];
            Arrays.fill(vetorPreenchido, 7);
            mostraVetor(vetorPreenchido, "VETOR PREENCHIDO: ");

            int[] vetorInt = {1,2,3,4,5,6,7};
            int[] copiaVetorInt = new int[vetorInt.length];

            System.arraycopy(vetorInt, 3, copiaVetorInt, 0, vetorInt.length - 3);
            mostraVetor(vetorInt, "VETOR INTEIRO");
            mostraVetor(copiaVetorInt, "COPIA DO VETOR");

            boolean b = Arrays.equals(vetorInt, copiaVetorInt);

            System.out.printf("%n%nvetorInt %s copiaVetorInt%n", (b ? "==" : "!="));

            int local = Arrays.binarySearch(vetorInt, 5);

            String msg = local >= 0 ?
                "\nEncontrado 5 na posicao " + local :
                "\n5 nao encontrado no vetor ";
            System.out.println(msg);

            procuraVetor(vetorInt, 42);

        }
    public static void procuraVetor(int[] vetor, int valor){
        int local  = Arrays.binarySearch(vetor, valor);
        String msg = local >= 0 ?
            ("\n Encontrado " + valor + " na posicao " + local) :
            ("\n" + valor + " nao encontrado no vetor");
        System.out.println(msg);
    }
    public static void mostraVetor(int[] vetor, String descricao){
        System.out.printf("%n%s: ", descricao);
        for (int valor : vetor){
            System.out.printf("%d - ", valor);
        }
    }
    
}
