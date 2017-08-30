package aula2908vetor;

public class Aula2908Vetor {

    public static void main(String[] args) {
        // TODO code application logic here
        //Vetor de tipos primitivos
        int[] x = {2,4,6,8,10,12,14,16,18,20};
        for (int i = 0; i < 10; i++) {
            System.out.println(x[i]);
        }
        //Alternativo (for)
        for (int elemento : x) {
            System.out.println(elemento);
        }
    }
    
}
