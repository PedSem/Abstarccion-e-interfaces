public class Estudiante implements Comparable<Estudiante> {
    public String nombre;
    public int edad,altura;

    public Estudiante(String nombre, int altura, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + " Altura:" + altura + " Edad:" + edad;
    }

    @Override
    public int compareTo(Estudiante o) {
        int resultado;
        if (this.altura > o.altura) {
            resultado = -1;
        } else if (this.altura < o.altura) {
            resultado = 1;
        } else {
            if (this.edad > o.edad) {
                resultado = -1;
            } else if (this.edad < o.edad) {
                resultado = 1;
            } else {
                resultado = 0;
            }

        }
        return resultado;

    }
}
