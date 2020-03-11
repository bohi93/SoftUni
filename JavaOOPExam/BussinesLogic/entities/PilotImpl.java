package entities;

import entities.interfaces.Machine;
import entities.interfaces.Pilot;

import java.util.ArrayList;
import java.util.List;

public class PilotImpl implements Pilot {
    private String name;
    private ArrayList<Machine> machines;

    public PilotImpl(String name){
        setName(name);
        machines = new ArrayList<>();
    }
    private void setName(String name){
        if(name.equals(null) || name.isEmpty()){
            throw new IllegalArgumentException("Pilot name cannot be null or empty.");
        }
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addMachine(Machine machine) {
        if(machine == null){
            throw new NullPointerException("Null machine cannot be added to the pilot.");
        }
        machines.add(machine);
    }

    @Override
    public List<Machine> getMachines() {
        return machines;
    }

    @Override
    public String report() {
        return null;
    }
}
