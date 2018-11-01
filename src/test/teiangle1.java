package test;

public class teiangle1 {

	private int width;
	private int height;
	public int getWidth() {
		return width;
	}

	public int getheight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;

	}
	public void setheight(int height) {
		this.height = height;
	}
	public double calc(){
		return(double) this.width * this.height * 0.5;
	}
}





