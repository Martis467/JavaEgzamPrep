/**************************************************************************************************************
* Konspekta atliko Martynas Jakimčikas
* Radus netikslumų ar klausimų kreiptis
* martynas.jakimcikas@gmail.com
****************************************************************************************************************/

public class Main {


    public static void main(String[] args) {

        Main.CheckReferences(); //Tests how referencing works in JAVA
        Main.CheckCloning(); //Tests how Cloning works in JAVA

    }

    private static void CheckCloning()
    {
        //Clone Testing---------

        Point3 original = new Point3();
        original.x = 5;
        original.y = 8;
        original.name = "asdas";

        //Setting base values for extraCheck
        original.extraCheck = new ExtraClass();
        original.extraCheck.A = 8;
        original.extraCheck.B = 800;

        //Seting base values for cloneCheck
        original.cloningCheck = new ExtraClass();
        original.cloningCheck.A = 900;
        original.cloningCheck.B = 999;

        //Creating Clone
        Point3 clone;
        try {
            //Cloning from orginal obj. and setting base values
            clone = (Point3) original.clone();
            clone.y = 80;
            clone.x = 70;
            clone.name = "zxczxc";
            //Base values for extraCheck
            clone.extraCheck.A = 7;
            clone.extraCheck.B = 700;
            //Base values for cloneCheck
            clone.cloningCheck.A = 600;
            clone.cloningCheck.B = 666;
            //Checking if changes to clone fields effects the original
            System.out.println("Original: " + original.x + "," + original.y + " Clone: " + clone.x + "," + clone.y); //Not effected
            System.out.println("Original: " + original.extraCheck.A + "," + original.extraCheck.B); // Effected
            System.out.println("Original: " + original.cloningCheck.A + "," + original.cloningCheck.B); // Not effected
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public static void CheckReferences()
    {
        System.out.println("Hello");
        //Checking references

        Point3 p1 = new Point3();
        Point3 p2 = new Point3();
        p1.x = 5;
        p1.y = 5;
        p1.z = 8;

        p2.y = 5;
        p2.y = 5;

        Point3 p3 = p1;

        System.out.println(p1==p2);
        System.out.println(p1==p3);
        p2.x = 80;
        p2.y = 79;
        System.out.println("X value -> " + p2.x + " Y value -> " + p2.y);
        p1.itsiek(p2);
        System.out.println("X value -> " + p2.x + " Y value -> " + p2.y);

        System.out.println("Z't values are: " + (p1.z == p2.z));

        Point3.printmsg();

        Point3 p4 = Point3.createWithVal(80);

        System.out.println();
    }
}
