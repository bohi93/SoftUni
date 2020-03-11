package entities;

import entities.interfaces.Fighter;

public class FighterImpl extends BaseMachine implements Fighter {

    private boolean aggressiveMode;
    private final double attackPointsModifier = 50;
    private final double defencePointsModifier = 25;

    public FighterImpl(String name, double attackPoints, double defensePoints) {
        super(name, attackPoints, defensePoints);
        this.setHealthPoints(200);
        aggressiveMode = true;
    }

    @Override
    public boolean getAggressiveMode() {
        return this.aggressiveMode;
    }

    @Override
    public void toggleAggressiveMode() {
        if(this.aggressiveMode){
            this.aggressiveMode = false;
            this.attackPoints += attackPointsModifier;
            this.defensePoints -= defencePointsModifier;
        }else{
            this.aggressiveMode = true;
            this.attackPoints -= attackPointsModifier;
        this.defensePoints += defencePointsModifier;
        }
    }
}
