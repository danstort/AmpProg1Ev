import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int cont = 0;

        int vec[] = new int[7];

        for (int i = 0; i < vec.length; i++) {

            vec[i] = tec.nextInt();
            if (vec[i] >= 18) {
                cont++;
            }
        }
        System.out.print("Mayores de edad="+cont);
    }

}
