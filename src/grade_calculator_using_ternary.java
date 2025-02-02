import java.util.Scanner;

public class grade_calculator_using_ternary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Score!");
        int score = s.nextInt();

           String grade = ( (score >=90 && score<=100) ? "your grade is O":(score >=80 && score<90) ? "your grade is A":(score >=70 && score<80) ? "your grade is B":
                   (score >=60 && score<70) ?"your grade is C":(score >=50 && score<60) ? "your grade is D":"your grade is F");
            System.out.println(grade);

    }
}
