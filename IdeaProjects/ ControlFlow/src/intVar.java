public class intVar {
    public static void main(String args[]){
        int x= 15;

        if( x<10) {
            System.out.println("x is less than 10");
        }

    main2();
    main3();
    main4();

    }
    //question 2
    public static void main2(){
        int x= 15;

        if( x<10) {
            System.out.println("x is less than 10");
        } else{
            System.out.println( "Greater than 10");
        }


    }
    //question 3
    public static void main3() {
        int x = 50;

        if (x < 10) {
            System.out.println("x is less than 10");
        } else if ((x > 10) && (x <= 20)) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println( "Greater than 20");

        }

    }
// question 4
    public static void main4() {
        int x = 15;

        if ((x < 10) && (x > 20)) {
            System.out.println("Out of range");
        } else if ((x >= 10) && (x <= 20)) {
            System.out.println("In range");
        } else {
            System.out.println( "Out of range");

        }

    }


}
