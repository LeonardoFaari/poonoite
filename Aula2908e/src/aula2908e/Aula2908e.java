package aula2908e;

public class Aula2908e {


    public static void main(String[] args) {
        int matriz[][] = new int[3][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = j;
            }
        }
        for (int[] vetor : matriz) {
            for (int elemento : vetor) {
                 System.out.println("Elemento: " + elemento);    
            }
            System.out.println("-------");
        }
    }
    
}
