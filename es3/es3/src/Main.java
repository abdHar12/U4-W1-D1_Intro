import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Inserisci la base: ");
        float base= sc.nextFloat();
        System.out.print("Inserisci l'altezza: ");
        float altezza= sc.nextFloat();
        System.out.println("Area Rettangolo: "+perimetro(base, altezza));
        System.out.print("Inserisci un numero: ");
        int number= sc.nextInt();
        System.out.println(pariDispari(number));
        System.out.println("Area Triangolo: "+areaTriangolo(base, altezza));
        sc.close();
    }
    public static float perimetro(float base, float altezza){
        return base*altezza;
    }
    public static boolean pariDispari(int n){
        if(n%2==0) return true;
        else return false;
    }
    public static float areaTriangolo(float base, float altezza){
        return (base*altezza)/2;
    }
}