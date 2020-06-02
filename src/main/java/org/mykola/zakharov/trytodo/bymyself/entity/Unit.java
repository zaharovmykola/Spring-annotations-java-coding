package org.mykola.zakharov.trytodo.bymyself.entity;

import org.mykola.zakharov.trytodo.bymyself.interfaces.IPerson;
import org.mykola.zakharov.trytodo.bymyself.interfaces.ITool;
import org.springframework.stereotype.Component;

@Component
public class Unit {
    public IPerson iPerson;
    public ITool iTool;
    public String name;

    public Unit(IPerson iPerson, ITool iTool, String name) {
        this.iPerson = iPerson;
        this.iTool = iTool;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void doSmth() {
        if (iPerson instanceof Peasant && iTool instanceof Axe) {
            iPerson.goTo(15, 15);
            System.out.println("Slightly injure the enemy\n");
        } else {
            iPerson.goTo(15, 15);
            iTool.doAction();
        }
    }
}
