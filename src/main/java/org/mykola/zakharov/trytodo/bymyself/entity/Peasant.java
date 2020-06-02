package org.mykola.zakharov.trytodo.bymyself.entity;

import org.mykola.zakharov.trytodo.bymyself.interfaces.IPerson;

public class Peasant implements IPerson {
    public void goTo(int _x, int _y) {
        System.out.printf("Walk to %d; %d\n", _x, _y);
    }
}
