package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(3,0,15));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){


        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }else{
            int sum = (bigCount * 5) + smallCount;
            int bigTotal = bigCount * 5;

            if(sum >= goal){
                if(bigCount == 0){
                    if (smallCount >= goal){
                        return true;
                    }else{
                        return false;
                    }

                }else if(smallCount == 0){
                    if(goal % 5 != 0){
                        return false;
                    }else{
                        return true;
                    }
                }else{
                    int rem = goal % 5;
                    if(smallCount < rem){
                        return false;
                    } else{
                        return true;
                    }
                }
            }else{
                return false;
            }
        }

    }
}
