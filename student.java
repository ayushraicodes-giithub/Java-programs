import java.util.*;
public class student {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int ph,che,maths,eng,hin;
        String name;
        System.out.println("Enter your name:");
        name=obj.nextLine();
        System.out.println("Enter the marks of the subjects");
        ph = obj.nextInt();
        che = obj.nextInt();
        maths = obj.nextInt();
        eng = obj.nextInt();
        hin = obj.nextInt();
        int total = ph+che+maths+eng+hin;
        int per = total/500;
        if(per>90)
            System.out.println("A+");
        else if (per>=80) {
            System.out.println("A");

        }
        else if (per>=70) {
            System.out.println("B");
        }
        else if (per>=60) {
            System.out.println("C");
        }
        else if (per>=50) {
            System.out.println("D");

        }
        else
            System.out.println("Fail");

    }
}
