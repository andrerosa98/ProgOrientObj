public class Data {
    private int dia;
    private int mes;
    private int ano;
    private boolean dataEValida;
    private String data;

    public void inicializaData (String data, int umDia, int umMes, int umAno){
    
        if (dataEValida == true){
            dia = umDia;
            mes = umMes;
            ano = umAno;
        }else{
            umDia = 0;
            umMes = 0;
            umAno = 0;
        }
        data = (umDia + "/" + umMes + "/" + umAno);
    }

    public boolean dataEValida(){
        if (mes == 2){
            if (dia < 1 || dia > 28 ){
                return false;
            }
        }else if(dia < 1 || dia > 31){
            return false;
        }
        if (mes < 1 || mes > 12){
            return false;
        }
        if (ano < 0){
            return false;
        }
        return true;
    }

    public String mostraData(){
        return data;
    }
}
