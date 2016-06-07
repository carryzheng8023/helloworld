//: enumerated/EnumMaps.java
// Basics of EnumMaps.
package com.zhengxin.j2se.enumerated;

import java.util.EnumMap;
import java.util.Map;

import static com.zhengxin.j2se.enumerated.AlarmPoints.*;
import static com.zhengxin.j2se.net.mindview.util.Print.print;
import static com.zhengxin.j2se.net.mindview.util.Print.printnb;

interface Command {
    void action();
}

public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoints, Command> em = new EnumMap<>(AlarmPoints.class);
        em.put(KITCHEN, new Command() {
            public void action() {
                print("Kitchen fire!");
            }
        });
        em.put(BATHROOM, new Command() {
            public void action() {
                print("Bathroom alert!");
            }
        });
        for (Map.Entry<AlarmPoints, Command> e : em.entrySet()) {
            printnb(e.getKey() + ": ");
            e.getValue().action();
        }
        try { // If there's no value for a particular key:
            em.get(UTILITY).action();
        } catch (Exception e) {
            print(e);
        }
    }
} /* Output:
BATHROOM: Bathroom alert!
KITCHEN: Kitchen fire!
java.lang.NullPointerException
*///:~
