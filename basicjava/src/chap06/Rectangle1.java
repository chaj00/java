package chap06;
public class Rectangle1 {
	private int width;
	private int height;
	private String color;
	private int area;
	public Rectangle1(){
	}
	public Rectangle1(int width, int height) {
		this.width = width;
		this.height = height;
		this.color ="Èò»ö";
	}
	public Rectangle1(int width, int height, String color) {
		this(width, height);
		this.color = color;
	}
	public int calculateArea(){
		this.area = this.width * this.height;
		return area;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
}
