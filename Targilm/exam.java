public class exam {
    public static void main(String[] args) {

        int x = f(20, 4);

        System.out.print(x);

       
        }
    }

    public static int f(int n, int d) {
        int temp;
        if (n == d)
            return (1);

        if (n % d == 0) {
            temp = f(n / d, d);
            return (temp + 1);
        }
        return (f(n, d + 1));
    }

}