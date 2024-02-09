mport java.util.Arrays;

public class Mainrectangulo{
    public static void main(String[] args) {
        rectangulo r1=new rectangulo(30,20);
        rectangulo r2=new rectangulo(15,16);
        rectangulo r3=new rectangulo(20,30);
        rectangulo[] arrayrectangulo={r1,r2,r3};
        System.out.println("Rectangulos ordenados:");
        Arrays.sort(arrayrectangulo);
        for(rectangulo num:arrayrectangulo){
            System.out.println(num.toString());
        }
    }
}
