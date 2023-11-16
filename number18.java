import java.util.Arrays;

public class number18 {
    public static void main(String[] args) {
        
        int[][] mynumber = new int[3][];
        mynumber[0] = new int [5];
        mynumber[1] = new int [3];
        mynumber[2] = new int [1];

        for (int i = 0; i < mynumber.length; i++ ){
            System.out.println(Arrays.toString(mynumber[i]));
        

        for ( i = 0; i < mynumber.length; i++){
            System.out.println("length of row" + (i+1) + ":" +mynumber[i].length);
        }
        }
    }
}
