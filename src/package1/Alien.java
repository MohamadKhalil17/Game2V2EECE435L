package package1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Alien extends Sprite {
	
	private final int BOARD_TOP = 10;
    private final int ALIEN_SPEED = 3;
    private double ALIEN_ANGLE;
    private int ALIEN_DIRECTION;
    public boolean collision = false;
    public int counter = 5;
    
    
    


    
    public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public boolean isCollision() {
		return collision;
	}

	public void setCollision(boolean collision) {
		this.collision = collision;
	}

	public double getALIEN_ANGLE() {
		return ALIEN_ANGLE;
	}

	public void setALIEN_ANGLE(double aLIEN_ANGLE) {
		ALIEN_ANGLE = aLIEN_ANGLE;
	}
	

	public int getALIEN_DIRECTION() {
		return ALIEN_DIRECTION;
	}

	public void setALIEN_DIRECTION(int aLIEN_DIRECTION) {
		ALIEN_DIRECTION = aLIEN_DIRECTION;
	}

	public Alien(int x, int y) {
        super(x, y);

        initAlien();
    }

    private void initAlien() {
    	
        loadImage("pictures/alien.png");
        getImageDimensions();
    }

    /**
	 * Function to move aliens
	 */
    public void move() {
    	Random rand = new Random();
    	int randomNum = rand.nextInt((2) + 1)-1;
   
        x += ALIEN_DIRECTION*ALIEN_SPEED;
        if (ALIEN_DIRECTION<0) {
        	y -= (int) ALIEN_SPEED* Math.sin(Math.toRadians(ALIEN_ANGLE))*2;
        }
        else {
        	y -=( int) ALIEN_DIRECTION*ALIEN_SPEED*Math.sin(Math.toRadians(ALIEN_ANGLE))*2;
        }
        
        //System.out.println(x+ " "+y);
    	
        
        if (y < BOARD_TOP)
            visible = false;
    }
    
}