package org.mykola.zakharov.trytodo.bymyself.configs;

import org.mykola.zakharov.trytodo.bymyself.entity.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "warrior")
    public Warrior warrior () {
        return new Warrior();
    }

    @Bean(name = "peasant")
    public Peasant peasant () {
        return new Peasant();
    }

    @Bean(name = "sword")
    public Sword sword () {
        return new Sword();
    }

    @Bean(name = "axe")
    public Axe axe () {
        return new Axe();
    }

    @Bean(name = "plow")
    public Plow plow () {
        return new Plow();
    }

    @Bean(name = "warriorUnitWithSword")
    public Unit warriorUnitWithSword (Warrior warrior, Sword sword) {
        Unit u = new Unit(warrior, sword, "Warrior_With_Sword");
        return u;
    }

    @Bean(name = "warriorUnitWithAxe")
    public Unit warriorUnitWithAxe (Warrior warrior, Axe axe) {
        Unit u = new Unit(warrior, axe, "Warrior_With_Axe");
        return u;
    }

    @Bean(name = "peasantUnitWithPlow")
    public Unit peasantUnitWithPlow (Peasant peasant, Plow plow) {
        Unit u = new Unit(peasant, plow, "Peasant_With_Plow");
        return u;
    }

    @Bean(name = "peasantUnitWithAxe")
    public Unit peasantUnitWithAxe (Peasant peasant, Axe axe) {
        Unit u = new Unit(peasant, axe, "Peasant_With_Axe");
        return u;
    }

}
