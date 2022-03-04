public class nestedLoop {
    public static void main(String[] args) {


        for (int v = 0; v <= 10; ++v) {

            // inner loop prints days
            for (int j = 2; j <= 20; ++j) {
                System.out.println("Inner loop: i: " + v + ", j: " + j);
            }

        }
    }
}
