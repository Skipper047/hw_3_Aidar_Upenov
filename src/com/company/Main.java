package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {1.7, 9.8, -6.5, 16.3, -15.9, -9.5, -2.3, 4.8, 5.6, 12.6, 8.9,
                -25.5, 19.5, -21.7, 12.0};

        double sum2= 0;
        double sum = 0;
        boolean Ge= false;
        for (Double hkl:numbers
             ) {
            if(hkl < 0){
                Ge = true;
            }
            else {
                if(Ge){
                    sum += hkl;
                sum2 ++;
                }

            }

        }
        System.out.println(sum/sum2);

    }
}
