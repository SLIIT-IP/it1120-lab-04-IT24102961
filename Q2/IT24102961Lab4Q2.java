import java.util.Scanner;

public class IT24102961Lab4Q2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter exam marks (out of 100): ");
        double eMarks=scanner.nextDouble();//Exam Marks=eMarks
        System.out.print("Please enter lab submission marks (out of 100): ");
        double lMarks=scanner.nextDouble();//Lab Marks=lMarks

        if(eMarks<0 || eMarks>100 || lMarks<0 || lMarks>100){
            System.out.println("Invalid input for exam or lab marks. Terminating program.");
            return;
        }
        System.out.print("Please enter the percentage given for the exam: ");
        double ePtg = scanner.nextDouble();//ePtg=Exam percentage 
        System.out.print("Please enter the percentage given for the lab submission: ");
        double lPtg = scanner.nextDouble();//lPtg=Lab percentage 

        if(ePtg+lPtg!=100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }
        double fMark=(eMarks*ePtg/100)+(lMarks*lPtg/100);
        System.out.println("\n\nFinal Exam Mark is : "+fMark);
    }
}
