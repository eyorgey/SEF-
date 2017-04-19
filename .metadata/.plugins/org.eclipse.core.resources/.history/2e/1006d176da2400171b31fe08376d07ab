package Data;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;

//Display and initial setup code in helper class
import static helpers.Translator.*;

public class game {
    
	public game() {
		
		BeginSession();
		
		//initiate new tile
         CellGrid grid = new CellGrid();
		//while loop to make sure screen stays on
		//while we are not hitting exit button, proceed
		while(!Display.isCloseRequested()) {
            
			grid.Draw();
			
			Display.update();
			Display.sync(60);
			
		}
			
			if (Display.isCloseRequested()) {
				//destroy the display
				Display.destroy();
				System.exit(0);
			}
		
	}
	
	


	private Texture QuickLoad(String name) {
		Texture tex=null;
		tex = LoadTexture("resources/" + name + ".png", "PNG");
		return tex;
	}


	public static void main(String[] args) {
		new game();
	}
}
