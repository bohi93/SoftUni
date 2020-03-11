package entities;

import entities.interfaces.Machine;
import entities.interfaces.Pilot;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseMachine implements Machine {

    private String name;
    private Pilot pilot;
    protected double attackPoints;
    private double healthPoints;
    protected double defensePoints;
    private List<String> targets;

    protected BaseMachine(String name, double attackPoints, double defensePoints){
        setName(name);
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        targets = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if(name.isEmpty() || name.equals(null)){
            throw new IllegalArgumentException("Machine name cannot be null or empty.");
        }
        this.name = name;
    }

    @Override
    public Pilot getPilot() {
        return this.pilot;
    }

    @Override
    public void setPilot(Pilot pilot) {
        if(pilot.equals(null)){
            throw new NullPointerException("Pilot cannot be null.");
        }
        this.pilot = pilot;
    }

    @Override
    public double getHealthPoints() {
        return this.healthPoints;
    }

    @Override
    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    @Override
    public double getAttackPoints() {
        return this.attackPoints;
    }

    @Override
    public double getDefensePoints() {
        return this.defensePoints;
    }

    @Override
    public List<String> getTargets() {
        return targets;
    }

    @Override
    public void attack(String target) {
        if(target.equals(null) || target.isEmpty()){
            throw new NullPointerException("Attack target cannot be null or empty string.");
        }
        targets.add(target);
    }
}
