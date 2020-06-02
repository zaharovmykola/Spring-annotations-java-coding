package org.mykola.zakharov.trytodo.bymyself.entity;

import org.mykola.zakharov.trytodo.bymyself.interfaces.IPerson;

public class Warrior implements IPerson {
    public void goTo(int _x, int _y) {
        System.out.printf("Run to %d; %d\n", _x, _y);
    }
}
