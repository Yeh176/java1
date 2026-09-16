import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the start number:");
        int start=input.nextInt();
        System.out.print("Enter the end number:");
        int end=input.nextInt();
        int sum = 0;
        if (start <= end) {
            for (int i = start; i <= end; i++) {
                sum = sum + i;
            }
            System.out.println("The sum from" + start + "to" + end + "is" + sum);
        }
        else {
            System.out.println("Error: start cannot be larger than end!");
        }
        input.close();
    }
}
