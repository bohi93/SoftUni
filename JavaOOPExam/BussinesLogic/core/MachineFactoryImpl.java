package core;

import core.interfaces.MachineFactory;
import entities.FighterImpl;
import entities.TankImpl;

public class MachineFactoryImpl implements MachineFactory {
    @Override
    public TankImpl createTank(String name, double attackPoints, double defensePoints) {
        return new TankImpl(name,attackPoints,defensePoints);
    }

    @Override
    public FighterImpl createFighter(String name, double attackPoints, double defensePoints) {
        return new FighterImpl(name,attackPoints,defensePoints);
    }
}
