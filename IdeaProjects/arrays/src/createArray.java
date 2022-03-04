public class createArray {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 2;
        numbers[1] = 3;
        numbers[2] = 5;

        for (int element : numbers) {
            System.out.println(element);
        }
        main2();
    }

    public static void main2() {
        int[] numbers = {13, 5, 7, 68, 2};
        if (numbers.length % 2 == 0) {
            System.out.println(numbers[numbers.length / 2]);
            System.out.println(numbers[(numbers.length / 2) - 1]);
        } else {
            System.out.println(numbers[(numbers.length / 2) - 1]);
        }

        // System.out.println("Question 2");
       // for (int element : numbers) {
            //System.out.println(element);
           // }

        }

    }

