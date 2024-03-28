package com.dragon.pattern.iterador.third;

import com.dragon.pattern.iterador.common.MenuItem;

import java.util.Iterator;

/**
 * @date: 2024/3/26 16:43
 * @author: ybl
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (position >= list.length || list[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
       MenuItem menuItem = list[position++];
       return menuItem;
    }

    public void remove() {
        if (position <= 0) {
            throw new UnsupportedOperationException();
        }
        if(list[position - 1] != null) {
            for (int i = position - 1; i < list.length - 1; i++) {
                list[i] = list[i + 1];
            }
            list[list.length - 1] = null;
        }
    }
}
