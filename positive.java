import java.util.Scanner;
class positive{
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) //for loop 
        {
            arr[i] = sc.nextInt();
            if (arr[i] > 0) {
                count++;
            }
        }

        System.out.println("Total number of positive numbers: " + count);
        sc.close();
    }
}


