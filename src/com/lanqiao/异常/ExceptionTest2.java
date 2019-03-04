package com.lanqiao.异常;

public class ExceptionTest2 {
    /**
     * 2.作业2
     * 编写类ExceptionTest2：
     * 定义一个方法：go()
     * 在go方法中用throws声明抛出异常，在该方法体内，用throw抛出一个Exception。
     * 在main()方法中调用go方法时，使用try/catch捕获go方法中抛出的异常
     */

    static void go(){
        throw new NullPointerException("空指针异常");
    }
    public static void main(String[] args) {
        try {
            go();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
