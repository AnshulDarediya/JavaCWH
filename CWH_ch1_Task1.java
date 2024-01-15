import java.util.Scanner;

public class CWH_ch1_Task1 {
    public static void main(String[] args) {
        System.out.println("Enter Your Marks for 5 subjects out of 100 below !!");
        Scanner sc = new Scanner((System.in));

        int num1=sc.nextInt(),num2=sc.nextInt(),num3=sc.nextInt(),num4=sc.nextInt(),num5=sc.nextInt();
        float percentage=(num1+num2+num3+num4+num5)/5.0f;
        System.out.print("Your Total Percentage is " );
        System.out.println(percentage);
    }
}
