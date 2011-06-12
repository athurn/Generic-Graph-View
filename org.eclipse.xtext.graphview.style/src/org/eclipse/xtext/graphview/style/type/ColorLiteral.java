package org.eclipse.xtext.graphview.style.type;

public class ColorLiteral {

	private int red, green, blue;
	
	public ColorLiteral(String rgb) {
		if (rgb.startsWith("#") && rgb.length() == 7) {
			red = Integer.parseInt(rgb.substring(1, 3), 16);
			green = Integer.parseInt(rgb.substring(3, 5), 16);
			blue = Integer.parseInt(rgb.substring(5, 7), 16);
		}
	}

	public ColorLiteral(int red, int green, int blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	public int getRed() {
		return red;
	}
	
	public int getGreen() {
		return green;
	}
	
	public int getBlue() {
		return blue;
	}
	
	@Override
	public String toString() {
		return "#" + Integer.toHexString(((((red << 8) | green) << 8) | blue));
	}
}