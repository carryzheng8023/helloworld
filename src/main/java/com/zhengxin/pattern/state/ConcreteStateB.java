package com.zhengxin.pattern.state;

/**
 * Created by 136931 on 2016/2/24.
 */
public class ConcreteStateB implements State {
    @Override
    public void handle(String sampleParameter) {

        System.out.println("ConcreteStateB handle ：" + sampleParameter);
    }
}
