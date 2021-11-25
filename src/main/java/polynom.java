import java.util.Scanner;

public class polynom {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Input array size: ");
        int size = scan.nextInt();
        float array[] = new float[size];
        float answer=0;

        for(int i=0; i<size; i++){
            array[i] = scan.nextFloat();
        }

        for(int i=0; i<size; i++){
            answer = answer + (1/(array[i]*3));
        }
        System.out.println(answer);
    }
}
