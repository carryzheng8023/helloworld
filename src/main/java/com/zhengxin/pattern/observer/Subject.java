package com.zhengxin.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 136931 on 2016/2/24.
 */
public abstract class Subject {

    /**
     * 用来保存注册的观察者对象
     */
    private  List<Observer> list = new ArrayList<>();

    /**
     * 注册观察者对象
     * @param observer  观察者对象
     */
    public void attach(Observer observer){
        list.add(observer);
        System.out.println("Attached an observer" + observer.toString());
    }

    /**
     * 删除观察者对象
     * @param observer  观察者对象
     */
    public void detach(Observer observer){

        list.remove(observer);
    }
    /**
     * 通知所有注册的观察者对象
     */
    public void nodifyObservers(String newState){

        for(Observer observer : list){
            observer.update(newState);
        }
    }



}
