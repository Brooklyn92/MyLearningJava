package com.study_abstract_classes_and_interfaces.innopolis;

public abstract class Player {

    protected int score;
    protected int health;

    protected Artefact artefact;
    protected PassiveSkill skill;

    public Player(int score, int health) {
        this.score = score;
        this.health = health;
    }

    public abstract void attack(Player enemy);
    public abstract void damage(int value);

    public int getScore() {
        return score;
    }

    public int getHealth() {
        return health;
    }


    public void setSkill(PassiveSkill skill) {
        this.skill = skill;
    }

    public void setArtefact(Artefact artefact) {
        this.artefact = artefact;
    }
}
