public class Point3 implements Cloneable
{
    public int x;
    public int y;
    public static int z;
    String name;

    ExtraClass extraCheck; //Used for proving that cloning returns a reference if not specified
    ExtraClass cloningCheck; //Used for proving that if specified does not effect the original obj.

    public Point3(){}
    private Point3(int tmp) {x = tmp;}
    public static Point3 createWithVal(int tmp) {
       return new Point3(tmp);
    }
    //Used to check if the passed value is effected
    void itsiek (Point3 p)
    {
        int xx = this.x; this.x = p.x; p.x = xx;
        int yy = this.y; this.y = p.y; p.y = yy;

        p = this; // ?!
    } //Conclusion: the passed value is effected

    //Used to test how static functions and variables work
    public static void printmsg() {
        System.out.println(z);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        Point3 clonned = (Point3) super.clone();
        clonned.cloningCheck = new ExtraClass();
        return clonned;
    }
}
