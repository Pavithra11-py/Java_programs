package feb_9_tasks;

public class sort_array {
    public static void main(String[] args) {
        int[] numbers = new int[]{12, 34, 10, 1, 100, 3, 4, 32};
        int temp=0;
        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }System.out.println(numbers[i]);
        }


    }

}
