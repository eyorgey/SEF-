package Data;
import static helpers.Translator.*;


public enum CellType {
 
	//true = buildable, eventually will hold player
	//identify two different textures
	Cement ("tile1", true), Black ("tile2", false);
	
	
	String textureName;
	boolean buildable;
	
	CellType(String textureName, boolean buildable) {
		this.textureName = textureName;
		this.buildable = buildable;
	}
}
