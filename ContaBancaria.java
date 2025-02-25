public class ContaBancaria {
    private String nomeDoCorrentista;
    private double saldo;
    private boolean contaEspecial;
    private String nome;
    private double deposito;
    private boolean especial;

    public ContaBancaria(String nomeDoCorrentista, double saldo, boolean contaEspecial){
        nomeDoCorrentista = nome;
        saldo = deposito;
        contaEspecial = especial;
    }

    public void abreContaSimples(){
        nomeDoCorrentista = nome;
        saldo = 0.00;
        contaEspecial = false;
    }

    public double deposita(double valor){
        saldo = saldo + valor;
        return saldo;
    }

    public double retira(double valor){
        if (contaEspecial == false){
            if (valor <= saldo){
                saldo = saldo - valor;
            }
        }else{
            saldo = saldo - valor;
        }
        return saldo;
    }

    public void mostraDados(){
        System.out.println("O nome do correntista é: " + nomeDoCorrentista);
        System.out.println("O saldo da conta é: " + saldo);
        if (contaEspecial == true){
            System.out.println("A conta é especial");
        }else{
            System.out.println("A conta é comum");
        }
    }
    
}
