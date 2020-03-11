package entities;

import entities.interfaces.Tank;

public class TankImpl extends BaseMachine implements Tank {

    private boolean defenseMode;
    private final double attackPointsModifier = 40;
    private final double defencePointsModifier = 30;

    public TankImpl(String name, double attackPoints, double defensePoints) {
        super(name, attackPoints, defensePoints);
        this.setHealthPoints(100);
        defenseMode = true;
    }

    @Override
    public boolean getDefenseMode() {
        return this.defenseMode;
    }

    @Override
    public void toggleDefenseMode() {
        if(this.defenseMode){
            this.defenseMode = false;
            this.attackPoints += attackPointsModifier;
            this.defensePoints -= defencePointsModifier;
        }else{
            this.defenseMode = true;
            this.attackPoints -= attackPointsModifier;
            this.defensePoints += defencePointsModifier;
        }
    }
}
