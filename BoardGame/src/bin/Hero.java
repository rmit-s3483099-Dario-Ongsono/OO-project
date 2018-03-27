package bin;

public abstract class Hero {

//comments hero
    private String heroID;
    private boolean isAlive;     //set to alive when respawned
    private boolean isSelected; //If hero is selected for the game
    private int attackRange; //Hero capture range
    private int moveRange;  //How many tiles can the hero move
    private int currPosX;
    private int currPosY;


    public Hero (String heroID, int attackRange, int moveRange){
        this.heroID = heroID;
        this.attackRange = attackRange;
        this.moveRange = moveRange;
        this.isAlive = false;
        this.isAlive = false;
    }

    public abstract void specialAbility();

    public abstract void move(int moveRange, int currPosX, int currPosY, int endX, int endY);

    public abstract void capture(Hero hero, int attackRange);


    //Getters & Setters
    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

    public int getMoveRange() {
        return moveRange;
    }

    public void setMoveRange(int moveRange) {
        this.moveRange = moveRange;
    }

    public String getHeroID() {
        return heroID;
    }

    public void setHeroID(String heroID) {
        this.heroID = heroID;
    }


    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }


    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }



}
