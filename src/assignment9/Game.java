package assignment9;

import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;

public class Game {
	
	//private Snake snake;
	private Snake snake;
	private Food food;
	
	public Game() {
		StdDraw.enableDoubleBuffering();
		
		//FIXME - construct new Snake and Food objects
		snake = new Snake(0.5, 0.5);
		food = new Food();
	}
	
	public void play() {
	    // Intro screen
	    StdDraw.clear();
	    StdDraw.setPenColor(StdDraw.BLACK);
	    StdDraw.text(0.5, 0.5, "Press any key to start");
	    StdDraw.show();

	    while (!StdDraw.hasNextKeyTyped()) {
	        // wait for keypress
	    }
	    StdDraw.nextKeyTyped(); // flush the input
	    StdDraw.clear();
	    StdDraw.show();

	    // Game loop
	    while (snake.isInbounds()) {
	        int dir = getKeypress();
	        System.out.println("Keypress: " + dir);

	        snake.changeDirection(dir);
	        snake.move();

	        if (snake.eatFood(food)) {
	            food = new Food(); // Replace with new food if eaten
	        }

	        updateDrawing();
	    }

	    // Game Over screen
	    System.out.println("Game Over");
	    StdDraw.clear();
	    StdDraw.setPenColor(StdDraw.BLACK);
	    StdDraw.text(0.5, 0.5, "Game Over");
	    StdDraw.show();
	    StdDraw.pause(2000);
	}

	
	private int getKeypress() {
		if(StdDraw.isKeyPressed(KeyEvent.VK_W)) {
			return 1;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_S)) {
			return 2;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_A)) {
			return 3;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_D)) {
			return 4;
		} else {
			return -1;
		}
	}
	
	/**
	 * Clears the screen, draws the snake and food, pauses, and shows the content
	 */
	private void updateDrawing() {
		//FIXME
		
		/*
		 * 1. Clear screen
		 * 2. Draw snake and food
		 * 3. Pause (50 ms is good)
		 * 4. Show
		 */
		
		StdDraw.clear(); //Clears screen
		snake.draw();
		food.draw();
		StdDraw.show();
		StdDraw.pause(50);
	}
	
	public static void main(String[] args) {
		Game g = new Game();
		g.play();
	}
}
