package Model;

public class Time {
    private int h;
    private int m;
    private int s;
    private int l;
    private int t;
    public static int n = 1440;
    public int w;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
        int l = n - ((h * 60) + m + (s / 60));
        this.l = l;
    }


    public Time(int w){
        this.w=w;
        int t= l+w;
        this.t=t;
    }
    public void DisplayInfo() {
        System.out.println(l);
    }

    public void DisplayInfo2() {
        System.out.println(t);
    }
}
