import static java.lang.Math.*;

public class Program1{

    public static void main(String[] args){

        long[] z = new long[19];
        for(int i = 0; i < 19; i++){
            z[i] = i+1;
        }

        float[] x = new float[18];
        float a;
        for(int i = 0; i < 18; i++){
            a = (float)random();
            a *= 16;
            a -= 12;
            x[i] = a;
        }

        float[][] z1 = new float[19][18];
        for(int i = 0; i < 19; i++){
            for(int j = 0; j < 18; j++){
                z1[i][j] = DJ(z[i], x[j]);
            }
        }

        Screen(z1);
    }

    static float DJ(long a, float b){
        long[] mas = new long[] {2, 6, 8, 11, 13, 14, 15, 17, 19};
        boolean k = false;

        for(int i = 0; i < 9; i++){
            if(mas[i] == a){k = true;}
        }

        if (a == 16){
            return (float) tan(pow(b, 1/3)/(asin((b-4)/16) - PI));
        }
        else if (k){
            return (float) pow(E, (pow(b, 1/3)/(tan(b)-3)));
        }
        else{
            return (float) pow(pow((1 - tan(pow((b-1), 3)))/2, log(pow(E, b))), (pow(sin(pow(((b-1)/b), b)), (atan(1/pow(E, abs(b))))/2))/2);
        }
    }

    static void Screen(float[][] ar){
        for(int i = 0; i < ar.length; i++){
            for(int j = 0; j < ar[i].length; j++){
                System.out.printf("%.5f ", ar[i][j]);
            }
            System.out.println();
        }
    }
}

