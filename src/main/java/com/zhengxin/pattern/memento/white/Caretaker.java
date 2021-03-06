package com.zhengxin.pattern.memento.white;

/**
 * Created by 136931 on 2016/2/24.
 */
public class Caretaker {
    private Memento memento;
    /**
     * 备忘录的取值方法 getter
     */
    public Memento retrieveMemento(){
        return this.memento;
    }
    /**
     * 备忘录的赋值方法 setter
     */
    public void saveMemento(Memento memento){
        this.memento = memento;
    }
}
