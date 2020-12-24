/**
 * matrix
 */
public class matrix {
    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 6, 12};
        System.out.println(Equal(arr, arr.length));
    }

    public static int Equal(int[] arr, int len) {

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < len; i++) {
            sum1 += arr[i];

        }

        for(int i = 0; i < len - 1; i++) {
            sum1 -= arr[i];
            sum2 += arr[i];

            if (sum1 == sum2) {
                return i;    

            }
            
        } return 0;

    }

    
}


