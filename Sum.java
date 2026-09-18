import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the start number:");
        int start=input.nextInt();
        System.out.print("Enter the end number:");
        int end=input.nextInt();
        int sum = 0;
        int evenCount = 0;
        int count = 0;
        float average = 0;
        if (start <= end) {
            for (int i = start; i <= end; i++) {
                sum = sum + i;
                count++;
                if(i % 2 == 0){
                    evenCount++;
                }
            }
            average=(float)sum/count;
            System.out.println("The sum from" + start + "to" + end + "is" + sum);
            System.out.println("Total even numbers: " + evenCount);
        }
        else {
            System.out.println("Error: start cannot be larger than end!");
        }
        input.close();
    }
}
