public class grade_ {
    public static void main(String[] args) {
        int score = 96;
        if (score >= 90 && score<=100)
        {
            String grade="A+";
            System.out.println("Your grade is "+grade);
        } else if  (score >= 80 && score<90)
        {
            String grade="A";
            System.out.println("Your grade is "+grade);
        }else if  (score >= 70 && score<80)
        {
            String grade="B";
            System.out.println("Your grade is "+grade);
        }else if  (score >= 60 && score<70)
        {
            String grade="C";
            System.out.println("Your grade is "+grade);
        }else if  (score >= 50 && score<60)
        {
            String grade="D";
            System.out.println("Your grade is "+grade);
        }else if  (score >= 40 && score<50)
        {
            String grade="E";
            System.out.println("Your grade is "+grade);
        }
        else {

            System.out.println("Your grade is Fail");
        }

    }
}
