package com.zhengxin.innerClass;

/**
 * @author zhengxin
 * @date 2018-02-01 19:15:03
 */
public class Test1 {


    public static void main(String[] args){

        // 初始化Bean1
        Test1 test1 = new Test1();
        Bean1 bean1 = test1.new Bean1();
        bean1.I++;

        // 初始化Bean2
        Bean2 bean2 = new Bean2();
        bean2.J++;

        //初始化Bean3
        Bean bean = new Bean();
        Bean.Bean3 bean3 = bean.new Bean3();
        bean3.k++;
    }
    class Bean1{
        public int I = 0;
    }

    static class Bean2{
        public int J = 0;
    }
}

class Bean{
    class Bean3{
        public int k = 0;
    }

}
