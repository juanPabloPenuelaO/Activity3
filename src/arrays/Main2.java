package arrays;

import java.lang.reflect.Array;

public class Main2 {
    public static void main(String[] args) {
        String[] nombres = {"juan", "manuel", "Sara"};
        int[] numeros = {1,2,3};
        float[] vacio = new float[5];
        System.out.println(numeros.length);
        vacio[0]=1.5f;
        vacio[1]=3.3f;
        Array.set(vacio,2,4.7);
        System.out.println(vacio[1]);
        System.out.println(Array.get(vacio,2));
        for (float i:vacio) {
            System.out.println(i);
        }
    }
}
