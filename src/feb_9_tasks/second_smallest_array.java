package feb_9_tasks;

public class second_smallest_array {
    public static void main(String[] args) {
        int[] number = new int[]{10,5,67,23};
        for (int i=0;i< number.length;i++){
            for(int j=i+1;j< number.length;j++){
               if(number[i]>number[j]){
                int temp=0;
                temp=number[i];
                number[i]= number[j];
                number[j]=temp;
            }}

        }System.out.print(number[number.length-2]);
    }
}
