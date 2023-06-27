class Student {
    int marks;
    String name;
    void checkPass(){
        if (marks >= 40){
            System.out.println("pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}

public class ControlFLow {

    int findMax(int a, int b, int c) {
        if (a > b) {                        //Nested If-Else
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {
     Student S1 = new Student();
     S1.name = "Ronak";
     S1.marks = 52;

     Student S2 = new Student();
     S2.name = "Chitranshu";
     S2.marks = 25;
     S1.checkPass();
     S2.checkPass();

     ControlFLow obj = new ControlFLow();
        System.out.println(obj.findMax(10,15,7));



        char c = 'a';
        switch(c){
            case 'a':
                System.out.println("hi I am A");
                break;
            case 'b':
                System.out.println("hi I am B");
                break;

            case 'c':
                System.out.println("hi I am C");
                break;
            default:
                System.out.println("I am not A,B or c");
        }


    }
}
