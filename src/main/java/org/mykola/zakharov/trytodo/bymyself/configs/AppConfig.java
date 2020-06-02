package org.mykola.zakharov.trytodo.bymyself.configs;

import org.mykola.zakharov.trytodo.bymyself.entity.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "warriorUnitWithSword")
    public Unit warriorUnitWithSword () {
        Unit u = new Unit(new Warrior(), new Sword(), "Warrior_With_Sword");
        return u;
    }

    @Bean(name = "warriorUnitWithAxe")
    public Unit warriorUnitWithAxe () {
        Unit u = new Unit(new Warrior(), new Axe(), "Warrior_With_Axe");
        return u;
    }

    @Bean(name = "peasantUnitWithPlow")
    public Unit peasantUnitWithPlow () {
        Unit u = new Unit(new Peasant(), new Plow(), "Peasant_With_Plow");
        return u;
    }

    @Bean(name = "peasantUnitWithAxe")
    public Unit peasantUnitWithAxe () {
        Unit u = new Unit(new Peasant(), new Axe(), "Peasant_With_Axe");
        return u;
    }

}
