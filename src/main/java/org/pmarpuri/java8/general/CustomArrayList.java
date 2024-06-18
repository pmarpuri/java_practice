package org.pmarpuri.java8.general;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList {

    @Override
    public boolean add(Object o) {
        if (this.contains(o)){
            return true;
        } else {
            return super.add(o);
        }
    }

    public static void main(String[] args) {
        CustomArrayList cl = new CustomArrayList();
        cl.add(1);
        cl.add(1);
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(2);
        System.out.println(cl);
    }
}
