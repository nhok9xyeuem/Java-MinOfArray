
public class MinOfArray {
    public static void main(String[] args) {
        int [] array= {12,23,4,123,4,5,12,23,4,5,6,7,1,2,3,3};
        System.out.println(minValue(array));
    }
    private static int minValue(int[] array){
        int min=array[0];
        for (int value : array) {
            if (min > value) {
                min = value;

            }

        }
        return min;
    }
}
