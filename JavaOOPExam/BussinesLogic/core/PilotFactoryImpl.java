package core;

import core.interfaces.PilotFactory;
import entities.PilotImpl;

public class PilotFactoryImpl implements PilotFactory {
    @Override
    public PilotImpl createPilot(String name) {
        return new PilotImpl(name);
    }
}
