package bin;

public class Minion extends Hero{
 

    private boolean justRevived;

    public Minion(String heroID, int attackRange, int moveRange){
        super(heroID, attackRange, moveRange);
        this.justRevived = false;
    }

    public void specialAbility(){
        //need to allow this 'attack modifier to be 1 turn only'
    }

    public boolean isJustRevived() {
        return justRevived;
    }

    public void setJustRevived(boolean justRevived) {
        this.justRevived = justRevived;
    }

	@Override
	public void move(int moveRange, int currPosX, int currPosY, int endX, int endY) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void capture(Hero hero, int attackRange) {
		// TODO Auto-generated method stub
		
	}


}