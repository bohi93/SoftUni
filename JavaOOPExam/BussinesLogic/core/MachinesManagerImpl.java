package core;

import core.interfaces.MachineFactory;
import core.interfaces.PilotFactory;
import core.interfaces.MachinesManager;

import entities.FighterImpl;
import entities.PilotImpl;
import entities.TankImpl;
import entities.interfaces.Fighter;
import entities.interfaces.Machine;
import entities.interfaces.Pilot;
import entities.interfaces.Tank;

import java.util.Map;

public class MachinesManagerImpl implements MachinesManager {

    private PilotFactoryImpl pilotFactory;
    private MachineFactoryImpl machineFactory;
    private Map<String, Pilot> pilots;
    private Map<String, Machine> machines;


    public MachinesManagerImpl(PilotFactory pilotFactory, MachineFactory machineFactory, Map<String, Pilot> pilots, Map<String, Machine> machines) {
     this.machineFactory = (MachineFactoryImpl) machineFactory;
     this.pilotFactory = (PilotFactoryImpl) pilotFactory;
     this.pilots = pilots;
     this.machines = machines;
    }

    @Override
    public String hirePilot(String name) {
        if(pilots.containsKey(name)){
            return String.format("Pilot %s is hired already]",name);
        }else{
            PilotImpl tempPilot = pilotFactory.createPilot(name);
            pilots.put(name,tempPilot);
            return String.format("Pilot %s hired",name);
        }
    }

    @Override
    public String manufactureTank(String name, double attackPoints, double defensePoints) {
        if (machines.containsKey(name)) {
            return String.format("Machine %s is manufactured already", name);
        } else {
            TankImpl tempTank = machineFactory.createTank(name, attackPoints, defensePoints);
            machines.put(name, tempTank);
            return String.format("ManufactureTank $s %d %d", name, attackPoints, defensePoints);
        }
    }

    @Override
    public String manufactureFighter(String name, double attackPoints, double defensePoints) {
        if(machines.containsKey(name)){
            return String.format("Machine %s is manufactured already", name);
        }else{
            FighterImpl tempFighter = machineFactory.createFighter(name,attackPoints,defensePoints);
            machines.put(name,tempFighter);
            return String.format("ManufactureFighter $s %d %d",name,attackPoints,defensePoints);
        }
    }

    @Override
    public String engageMachine(String selectedPilotName, String selectedMachineName) {

        return String.format("Pilot %s engaged machine %s",selectedPilotName,selectedMachineName);
    }

    @Override
    public String attackMachines(String attackingMachineName, String defendingMachineName) {
        return null;
    }

    @Override
    public String pilotReport(String pilotName) {
        return null;
    }

    @Override
    public String toggleFighterAggressiveMode(String fighterName) {
        FighterImpl tempFighter = (FighterImpl) machines.get(fighterName);
        tempFighter.toggleAggressiveMode();
        return String.format("Fighter %s toggled aggressive mode",fighterName);
    }

    @Override
    public String toggleTankDefenseMode(String tankName) {
        TankImpl tempTank = (TankImpl) machines.get(tankName);
        tempTank.toggleDefenseMode();
        return String.format("Tank %s toggled defense mode",tankName);
    }
}
