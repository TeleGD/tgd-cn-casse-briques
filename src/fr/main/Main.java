package fr.main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import fr.main.World;


public class Main extends StateBasedGame {
	

	public static void main(String[] args) throws SlickException {
		AppGameContainer app = new AppGameContainer(new Main(),800, 600, false);
		app.setTargetFrameRate(60);
		app.setVSync(true);
		app.setShowFPS(true);
		app.start();
	}
	

	public Main() {
		super("Ouep");
	}



	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		
		addState(new World());
	}


}