package com.zhengxin.concurrency.t16;

/**
 * @author zhengxin
 * @date 2018-02-02 15:06:48
 */
public class C implements Runnable{

    private InOrder2 inOrder;

    public C(InOrder2 inOrder) {
        this.inOrder = inOrder;
    }

    @Override
    public void run() {
        for(;;){
            inOrder.c();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
