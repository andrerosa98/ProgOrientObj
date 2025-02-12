import java.util.Scanner;

public class Exercicio01{
    public static void Cabecalho(){
        System.out.println("+----------------------+");
        System.out.println("|   XXXX  XXX    XXXX  |");
        System.out.println("|   X  X  X  X   X     |");
        System.out.println("|   XXXX  X  X   XXXX  |");
        System.out.println("|   X  X  X  X      X  |");
        System.out.println("|   X  X  XXX    XXXX  |");
        System.out.println("+----------------------+");;
    }   

    public static int SegundosDia(){
        int segundosDia;
        final int HORASDODIA = 24;
        final int MINUTOSDAHORA = 60;
        final int SEGUNDOSDAMINUTO = 60;
        segundosDia = (HORASDODIA * MINUTOSDAHORA * SEGUNDOSDAMINUTO);
        return segundosDia;
    }

    public static void Rodape(String mensagem){
        System.out.println("\n\n********** " + mensagem + " **********");
    }

    public static int CalculaIdade(int anoAtual, int anoNasc){
        int idade;
        idade = anoAtual - anoNasc;
        return idade;
    }
    public static void main (String[] args){
        try(Scanner dado = new Scanner(System.in);){
        String nome;
        String mensagem;
        int anoAtual = 2025; 
        int anoNasc;
        int idade;
        int segVividos;
        final int DIASDOANO = 365;
        final int ANOIMPOSSIVEL = 1900;

        System.out.print("\n\nDigite seu nome: ");
        nome = dado.nextLine();
        System.out.print("Digite seu ano de nascimento: ");
        anoNasc = dado.nextInt();
        //Validação do ano de nascimento
        while(anoNasc > anoAtual || anoNasc < ANOIMPOSSIVEL){
            System.out.print("Ano de nascimento inválido, digite novamente: ");
            anoNasc = dado.nextInt();
        }
        dado.nextLine();
        System.out.print("Mensagem motivacional: ");
        mensagem = dado.nextLine();
        idade = CalculaIdade(anoAtual, anoNasc);
        segVividos = idade * DIASDOANO * SegundosDia();

        Cabecalho();
        System.out.printf("\n\n%s, \nVocê já viveu %,d segundos", nome, segVividos);
        Rodape(mensagem);
        }
    }
}