package rough;

public class complexity {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000_00; i++) {
            //O(N)
		}
		long end = System.currentTimeMillis();//O(1)
		System.out.println(end - start);

        System.out.println("Java padhna to Monu bhaiya se, 29 Oct se Noida me  ");//O(1)
        System.out.println("hey");//O(1)
        int n = 10000000;//O(1)
        int i = 0;//O(1)
        while (i < n) {    //O(N)
            System.out.println("Hey");//O(1)

            i++;//O(1)
        }
        // i=1,n = 6;
        while (i < n) {
            System.out.println("Hey");
            //log n
            i *= 2;
        }

        while (n > 0) {
            System.out.println("Hey");
            //log n
            n /= 2;
        }

        while (i <= n) {
            System.out.println("Hey");
            //O(N)
            i += 2;
            i += 3;
        }

        while (i <= n) {
            System.out.println("Hey");
            //O(log N)
            i *= 2;
            i *= 3;
        }

        while (n > 0) {
            System.out.println("Hey");
            //log n
            n /= 2;
            n /= 3;
        }

        int k = 10;
        while (i <= n) {
            System.out.println("Hey");
            //O(N)
            i += k;
        }

        while (i <= n) {
            System.out.println("Hey");
//            O(log N)
            i *= k;
        }

        while (n > 0) {
            System.out.println("Hey");
            // O(N)
            n = n - 1;
        }
        while (n > 0) {
            System.out.println("Hey");
            // O(N)
            n = n - 2;//8//3
            n = n - 3;//5//0
        }
        while (n > 0) {
            //O(N)
            n = n - k;
        }

        for (i = 1; i <= n; i++) { // O(N)
            for (int j = 1; j <= n; j++) { //O(N) //O(N^2)
                System.out.println("hey");


            }
//            System.out.println();
        }

        for (i = 1; i * i <= n; i++) {
            System.out.println("hey");
        //O(sqr root N)
        }

        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= i * i; j++) {// log n
                for (k = 1; k <= n / 2; k++) {//Log n
                    System.out.println("hey");
                    // O(N^4)
                }
            }
        }

        for (i = 1; i <= n; i *= 2) {
            System.out.println("hey");
            //O(log N)
        }

        for (i = n / 2; i <= n; i++) {
            for (int j = 1; j <= n / 2; j++) {
                for ( k = 1; k <= n; k = k * 2) {
                    System.out.println("hey");
                }
            }
        }

        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j += i) {
                System.out.println("hey");

            }
        }

        int val = 1000;
        for (i = 0; i < n; i++) {
            for (int j = 0; j < val; j++) {
                for (int t = 0; t <=j; t++) {

                }
            }
        }


    }

}
