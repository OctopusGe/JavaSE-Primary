package com.lanqiao.异常;

public class ExceptionTest1 {
    /**
     * 1.作业1
     * a)编写一个类ExceptionTest1，在main方法中使用try、catch、finally：
     * i.在try块中，编写被0除的代码，运行并观察结果。
     * ii.增加catch块，捕获被0除所产生的算术运算异常，并且打印异常信息。
     * iii.在finally块中，打印一条语句。
     */
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try {
            int result = a/b;
            System.out.println("result = " + result);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("程序正常终止！");
        }
    }
}
