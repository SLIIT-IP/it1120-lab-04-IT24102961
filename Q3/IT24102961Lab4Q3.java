import java.util.Scanner;

public class IT24102961Lab4Q3{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();//num=number
        String state=(num>0)?"Positive":(num<0)?"Negative":"Zero";
        System.out.println("The number is: "+state);
    }
}
