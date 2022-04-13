public class MyClass {
    int a = 4;
    int b = 5;
    String  s = "s";

    MyClass(int a, int b, String s){
        this.a = this.a / 2 + a;
        System.out.printf("-x "+ a);
        this.s = "p";
        System.out.println("-x " + this.b);
        this.b += b;
    }
    void methodA(int m, int n, String s){
        a = this.a - m;
        b = this.b - n;
        s = this.s;
        System.out.println(" -x " + a + " -x " + b + " -x " + s);
    }

    void methodB(int a, String s){
        this.a = this.a + a;
        this.s = "5";
    }

    public static void main(String[] args){
        MyClass mc = new MyClass(1,4,"h");
        mc.methodB(4, "k");
        mc.methodA(5, 8, "w");
    }
}
