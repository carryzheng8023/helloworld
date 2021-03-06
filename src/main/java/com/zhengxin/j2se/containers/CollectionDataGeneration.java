package com.zhengxin.j2se.containers;//: containers/CollectionDataGeneration.java
// Using the Generators defined in the Arrays chapter.

import com.zhengxin.j2se.net.mindview.util.*;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionDataGeneration {
    public static void main(String[] args) {
        System.out.println(new ArrayList<>(CollectionData.list(/*Convenience method*/new RandomGenerator.String(9), 10)));
        System.out.println(new HashSet<>(new CollectionData<>(new RandomGenerator.Integer(), 10)));
    }
} /* Output:
[YNzbrnyGc, FOWZnTcQr, GseGZMmJM, RoEsuEcUO, neOEdLsmw, HLGEahKcx, rEqUCBbkI, naMesbtWH, kjUrUkZPg, wsqPzDyCy]
[573, 4779, 871, 4367, 6090, 7882, 2017, 8037, 3455, 299]
*///:~
