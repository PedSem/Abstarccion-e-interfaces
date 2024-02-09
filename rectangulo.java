public class  rectangulo implements Comparable<rectangulo> {
    double altura;
    double ancho;


    public rectangulo(double altura, double ancho) {
        this.altura = altura;
        this.ancho = ancho;

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double getArea(){
        return ancho*altura*0.5;
    }

    @Override
    public String toString() {
        return "rectangulo{" +
                "altura=" + altura +
                ", ancho=" + ancho +
                '}';
    }

    @Override
    public int compareTo(rectangulo o) {
        int resultado=0;
        if(this.getArea()<o.getArea()){
            resultado=-1;
        }else if(this.getArea()>o.getArea()){
            resultado=1;
        }else{
            resultado=0;
        }
        return resultado;
    }
}
