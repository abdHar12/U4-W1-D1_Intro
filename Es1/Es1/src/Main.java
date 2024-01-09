import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(String.valueOf(moltiplica(2, 5)));
        System.out.println(concatena("yooooo", 2));
        String[] arrayStrings=new String[]{"yooooo", "noooo", "3456", "jjjjjjjj", "tredue"};
        System.out.println(Arrays.toString(insertInArray(arrayStrings, "swag")));

    }
    public static int moltiplica(int a, int b){
        return a*b;
    }
    public static String concatena(String stringEnter, int num){
        stringEnter=stringEnter.concat(String.valueOf(num));
    return stringEnter;
    }

    public static String[] insertInArray(String[] array, String onlyStr){
        System.out.println(Arrays.toString(array));
        String[] arrayStrings=new String[array.length+1];
        arrayStrings[0]=array[0];
        arrayStrings[1]=array[1];
        arrayStrings[2]=onlyStr;
        arrayStrings[3]=array[2];
        arrayStrings[4]=array[3];
        arrayStrings[5]=array[4];
        return arrayStrings;
    }
}