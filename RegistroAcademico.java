public class RegistroAcademico {
    private String nomeDoAluno;
    private double numeroDeMatricula;
    private int dataDeNascimento;
    private boolean eBolsista;
    private int anoDeMatricula;

    public void inicializaRegistro(String oNome, double aMatricula, int aData, boolean temBolsa, int qualAno){
        nomeDoAluno = oNome;
        numeroDeMatricula = aMatricula;
        dataDeNascimento = aData;
        eBolsista = temBolsa;
        anoDeMatricula = qualAno;
    }

    public double calculaMensalidade(double mensalidade){
        mensalidade = 400;

        if (eBolsista){
            mensalidade = mensalidade / 2;
        }
        return mensalidade;
    }

    public void mostraRegistro(){
        System.out.println("Nome: " + nomeDoAluno);
        System.out.println("Matrícula: " + numeroDeMatricula);
        System.out.println("Data de Nascimento: " + dataDeNascimento);

        if (eBolsista){
            System.out.println("O aluno é bolsista.");
        }else{
            System.out.println("O aluno não é bolsista.");
        }
    
        System.out.println("Ano de Matrícula: " + anoDeMatricula);    
    }   

}
