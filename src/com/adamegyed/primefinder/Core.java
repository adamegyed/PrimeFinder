package com.adamegyed.primefinder;

public class Core {

    public static void main(String[] args) {
        System.out.println("Starting PrimeFinder...");
        System.out.print("1 2 ");

        int numberCount = 3;
        for(;numberCount<=10000;numberCount+=2){
            boolean foundD = false;

            for(int n=3;n<=Math.sqrt(numberCount);n+=2){
                if(numberCount % n == 0){
                    foundD = true;
                    break;
                }
            }

            if(!foundD){
                System.out.print(String.valueOf(numberCount)+" ");
            }

        }


    }
}
