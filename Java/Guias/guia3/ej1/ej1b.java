package Guias.guia3.ej1;

public class ej1b {
    public static void main(String[] args) {
        String s1, s2;
        s1 = new String("hola");
        s2 = new String("hola");
        if (s1.equals(s2)) {   //metodo equals
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
    }
}