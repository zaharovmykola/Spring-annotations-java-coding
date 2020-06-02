package org.mykola.zakharov.trytodo.bymyself.entity;

import org.mykola.zakharov.trytodo.bymyself.interfaces.ITool;

public class Sword implements ITool {
    public void doAction() {
        System.out.println("Hit the enemy\n");
    }
}
