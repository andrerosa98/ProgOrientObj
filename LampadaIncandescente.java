
public class LampadaIncandescente{

    private boolean estadoDaLampada; //Atributo

    public LampadaIncandescente(){ //Método Construtor
        estadoDaLampada = false;
    }
    public void acende(){         //Demais métodos
        estadoDaLampada = true;
    }
    public void apaga(){
        estadoDaLampada = false;
    }
    public String mostraEstado(){
        if (estadoDaLampada == true){
            return "A lâmpada está acesa";
        } else {
            return "A lâmpada está apagada";
        }

    }
  
}


