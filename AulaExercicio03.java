public class AulaExercicio03 {
    private float altura;
    private float largura;

    public AulaExercicio03(){
        altura = 0;
        largura = 0;
    }

    public float getAltura(){
        return altura;
    }

    public void setAltura(float a){
        altura = a;
    }

    public float getLargura(){
        return largura;
    }

    public void setLargura(float l){
        largura = l;
    }

    public float calculaArea(){
        float area;
        area = altura * largura;
        return area;
    }

    public float calculaPerimetro(){
        float perimetro;
        perimetro = 2 * (altura + largura);
        return perimetro;
    }


}
