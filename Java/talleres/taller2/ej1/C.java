package talleres.taller2.ej1;

public class C extends B{
    int m1() {
        return 3;
    }
    int m2() {
        return super.m2();
    }
    int m3() {
        return m3();
    }
}
