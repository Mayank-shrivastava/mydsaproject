package function;

public class LocalOrGlobal {

    public static int val = 200;//Global variable

    public static void main(String[] args) {
        int a = 40; //Local variable - known by main function only
        System.out.println(val); //200
        int val = 400;
        System.out.println(val); //400
        System.out.println(LocalOrGlobal.val); //200
    }
}
