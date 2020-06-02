package org.mykola.zakharov.trytodo.bymyself;

import org.mykola.zakharov.trytodo.bymyself.configs.AppConfig;
import org.mykola.zakharov.trytodo.bymyself.entity.Unit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Unit unitWarSword = context.getBean("warriorUnitWithSword", Unit.class);
        System.out.println(unitWarSword.getName());
        unitWarSword.doSmth();

        Unit unitWarAxe = context.getBean("warriorUnitWithAxe", Unit.class);
        System.out.println(unitWarAxe.getName());
        unitWarAxe.doSmth();

        Unit unitPeasPlow = context.getBean("peasantUnitWithPlow", Unit.class);
        System.out.println(unitPeasPlow.getName());
        unitPeasPlow.doSmth();

        Unit unitPeasAxe = context.getBean("peasantUnitWithAxe", Unit.class);
        System.out.println(unitPeasAxe.getName());
        unitPeasAxe.doSmth();
    }

}
