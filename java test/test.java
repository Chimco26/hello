/**
 * test
 */

import java.util.Scanner;
import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        int[] arr = new int[10];

        Merkazit(arr);

        
    }

    public static void Arr(int[] arr, int i, int len) {

        Scanner in = new Scanner(System.in);

        if(i < len) {
            arr[i] = in.nextInt();
            Arr(arr, i + 1, len);
        }else {
            System.out.println(Arrays.toString(arr));
        }


        
    }

    public static int Toward(int num, int newNum) {

        newNum *= 10;
        newNum += num % 10;
        num /= 10;

        if (num == 0) {
            return newNum;
        } else
            return Toward(num, newNum);

    }

    public static int Prime(int x, int y) {

        if (y == 1) {
            return 1;
        } else if (x % y == 0) {
            return 0;
        } else {
            return Prime(x, y - 1);
        }
    }

    public static int Sort(int[] arr, int len) {

        if (len == 1) {
            return 1;
        } else if (arr[len - 1] < arr[len - 2]) {
            return 0;
        } else {
            return Sort(arr, len - 1);
        }

    }

    public static String Binary(int[] arr, int x, int start, int len) {
        String error = "Error!";
        String yes = "1";
        String no = "0";
        int mid = (start + len) / 2;

        if (Sort(arr, arr.length) == 0 || x > arr[arr.length - 1] || x < arr[0]) {
            return error;
        } else {
            if (arr[mid] == x) {
                return yes;
            } else if(start >= len) {
                return no;
            } else if (arr[mid] < x) {
                return Binary(arr, x, mid + 1, len);
            } else {
                return Binary(arr, x, start, mid - 1);
            }
        }
    }

    public static int Sum(int[] arr, int index, int x, int sum) { // index = 0, x = 2, sum = arr[0] + arr[1]

        if(x == arr.length) {
            return index;
        } else if(sum == arr[x]) {
            index++;
            sum += arr[x];
            x++;
            return Sum(arr, index, x, sum);
        } else {
            sum += arr[x];
            x++;
            return Sum(arr, index, x, sum);
        }

    }

    public static void Merkazit(int[] arr) {

        Scanner in = new Scanner(System.in);

        System.out.println("Hello how are you? please choose number between 0 and 6. 0 to exit: _1 to enter numbers into the array, _2 to inverse a number, _3 to chek a number if it prime, _4 to chek if your array is sorting, _5 to chek if some number is in your array, _6 to chek how many time of times that one of the array numbers is equal to the all members to its left.");
        int choice = in.nextInt();

        switch (choice) {
            case 0: System.out.println("Good bye!");
                break;

            case 1: System.out.println("Please enter your arrays number.");
                    Arr(arr, 0, arr.length);
                    Merkazit(arr);
                break;

            case 2: System.out.println("Please choose one number you want inverse.");
                    int x = in.nextInt();
                    System.out.println(Toward(x, 0));
                    Merkazit(arr);
                break;
                

            case 3: System.out.println("Please choose one number you want to chek if it's a prime number. 1 for prime and 0 fot not prime.");
                    int y = in.nextInt();
                    System.out.println(Prime(y, y-1));
                    Merkazit(arr);
                break;
                

            case 4: System.out.println("If you see 1 it means that your array is sorting, if you see 0 it means that he's not sorting.");
                    System.out.println(Sort(arr, arr.length));
                    Merkazit(arr);
                break;
                

            case 5: System.out.println("Choose one number you want to chek if it's a member of the array. 1 for yes and 0 for no.");
                    int z = in.nextInt();
                    System.out.println(Binary(arr, z, 0, arr.length));
                    Merkazit(arr);
                break;
                

            case 6: System.out.println("The number of times that one member of the array is equal to the all members to its left is: " + Sum(arr, 0, 2, arr[0]+arr[1]) + " .");
                    Merkazit(arr);
                break;

            default: System.out.println("incorrect input");
                    Merkazit(arr);
                break;
        }
        
    }

} 