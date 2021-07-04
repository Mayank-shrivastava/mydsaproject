package algorithms.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        toh(n, "src", "dest", "helper");
    }

    public static void toh(int n, String src, String dest, String helper) {
        //base-case
        if(n == 0) {
            return;
        }
        //Step 1-> Move (n-1) disk from src to helper using dest as helper
        toh(n - 1, src, helper, dest);
        //Step 2->Move nth disk from src to dest
        System.out.println("Move " + n + "th disk from " + src + " to " + dest);
        //Step 3->Move (n-1) disk from helper to dest using src as helper
        toh(n - 1, helper, dest, src);

    }
}
