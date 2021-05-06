package com.bjpowernode;

public class Test10 {
    public static void main(String[] args) {
        goSwimming(new ISmoke() {
            @Override
            public int swimming() {
                return 39;
            }
        });

    }

    public static void goSwimming(ISmoke iSmoke){
        int swimming = iSmoke.swimming();
        System.out.println("执行到此");
    }


}


@FunctionalInterface
interface ISmoke{
    public abstract int swimming();
//    public abstract int getsome();
}