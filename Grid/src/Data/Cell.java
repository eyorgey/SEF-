package Data;


import static helpers.Translator.LoadTexture;
import static helpers.Translator.DrawQuadTex;

import org.newdawn.slick.opengl.Texture;

public class Cell {

	private float x, y, width, height;
	private Texture texture;
	private CellType type;
	
	//make constructor and set to what they =
	public Cell(float x, float y, float width, float height, CellType type) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.type = type;
		this.texture = QuickLoad(type.textureName);
		
	}
	
	public void Draw() {
		DrawQuadTex(texture, x, y, width, height);
	}
	
	
	public float getX() {
		return x;
	}




	public void setX(float x) {
		this.x = x;
	}


	public float getY() {
		return y;
	}



	public void setY(float y) {
		this.y = y;
	}



	public float getWidth() {
		return width;
	}




	public void setWidth(float width) {
		this.width = width;
	}




	public float getHeight() {
		return height;
	}





	public void setHeight(float height) {
		this.height = height;
	}




	public Texture getTexture() {
		return texture;
	}




	public void setTexture(Texture texture) {
		this.texture = texture;
	}




	public CellType getType() {
		return type;
	}




	public void setType(CellType type) {
		this.type = type;
	}





	//make public to share between classes
	private Texture QuickLoad(String name) {
		Texture tex=null;
		tex = LoadTexture("resources/" + name + ".png", "PNG");
		return tex;
	}
	
	
	
}
