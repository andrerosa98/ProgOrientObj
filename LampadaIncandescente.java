
public class LampadaIncandescente{

    private boolean estadoDaLampada;

    public LampadaIncandescente(){
        estadoDaLampada = false;
    }
    public void acende(){
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


