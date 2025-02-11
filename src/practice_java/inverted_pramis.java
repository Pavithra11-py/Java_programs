package practice_java;

public class inverted_pramis {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int k=0;k<n-i;k++)
            {
                System.out.print("*");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print(" ");
            }

            System.out.println("");
        }
    }
}
