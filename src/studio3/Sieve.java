import java.util.Scanner;

public class Sieve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is n?");
        int n = scan.nextInt();

        int [] numbers = new int [n - 1];

        //assign numbers to array
        for (int i = 0; i<= n - 2; i++){
            numbers [i] = 2 + i;
        }

        // //take out multiples of 2 + replace with -1
        // for (int x = 1; x <= n; x++){
        //    if (numbers [x] % 2 == 0){
        //     numbers [x] = -1;
        //    }
        // }

        // for (int y = 2; y <=n; y++){
        //     if (numbers [y] % 3 ==0){
        //         numbers [y] = -1;
        //     }
        // }

        // for (int z = 4; z <= n; z++){
        //     if (numbers [z] % 5 == 0){
        //         numbers [z] = -1;
        //     }
        // }

        for (int p = 0; p <= n; p++){
            for (int a = 0; numbers [p] > 0; a++){
                for (int b = 0; numbers [p] % p == 0; b++){
                    numbers [p] = -1;
                }
            }
        System.out.println(p);
        System.out.println(numbers [p]);
        }









    }
}
