package com.dragon.pattern.iterador.second;

import com.dragon.pattern.iterador.common.MenuItem;

/**
 * @date: 2024/3/26 16:43
 * @author: ybl
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
       MenuItem menuItem = items[position++];
       return menuItem;
    }
}
