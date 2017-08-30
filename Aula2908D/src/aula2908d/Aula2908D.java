package aula2908d;

import java.util.Arrays;

public class Aula2908D {

    public static void main(String[] args) {
        int v[] = new int[50];
        Arrays.fill(v, 7, 48, 15);
        ///for (int i = 0; i < 50; i++) {
        //    System.out.println("Pos " + i + " = " + v[i]);
       // }
        int v1[] = {1,2,3,5,6,7,9,11,14,15};
        int v2[] = new int[10];
        System.arraycopy(v1, 2, v2, 6, 4);
        for (int x : v2) {
            System.out.println(x);    
        }
        
    }
    
}
