public class Loops {
    public static void main(String[] args) {
        //print the result
        System.out.println("Output is : ");

        //loop  to print 1 to 10.
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Question 2");
        int x = 0;
        while (x < 100) {
            System.out.println((x += 10));
        }

        System.out.println("Question 3");
        int c = 0;
        do {
            System.out.println(c);
            c++;

        } while (c <= 10);
        System.out.println("Question 4");

        int weeks = 2;
        int days = 5;

        // outer loop prints weeks
        for (int v = 1; v <= weeks; ++v) {
            System.out.println("Week: " + v);

            // inner loop prints days
            for (int j = 1; j <= days; ++j) {
                System.out.println("  Day: " + j);
            }
        }

    }
}





