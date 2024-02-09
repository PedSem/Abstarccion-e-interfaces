import java.util.Arrays;

public class MainEstudiante {
    public static void main(String[]args){
        Estudiante estudiante1=new Estudiante("Patri",170,12);
        Estudiante estudiante2=new Estudiante("Manuel",173,43);
        Estudiante estudiante3=new Estudiante("Javier",189,72);
        Estudiante estudiante4=new Estudiante("Alicia",168,52);
        Estudiante estudiante5=new Estudiante("Alberto",189,35);
        Estudiante[]estudiantes={estudiante1,estudiante2,estudiante3,estudiante4,estudiante5};
        
        System.out.println("Estudiantes sin ordenar:");
        for(Estudiante num:estudiantes){
            System.out.println(num + "");
        }

        Arrays.sort(estudiantes);
        System.out.println("\nEstudiantes ordenados:");
        for(Estudiante num:estudiantes){
            System.out.println(num + "");
        }



    }
}
