import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Inserire la prima stringa: ");
        String str1=scanIn.next();
        System.out.print("Inserire la seconda stringa: ");
        String str2=scanIn.next();
        System.out.print("Inserire la terza stringa: ");
        String str3=scanIn.next();
        System.out.println(concatStringsAndInverse(str1,str2,str3));
        scanIn.close();
    }

    public static String concatStringsAndInverse(String str1, String str2, String str3 ){
        return "normal: " + str1 + str2 + str3 + "\nInverse: " + str3 + str2 + str1;
    }
}