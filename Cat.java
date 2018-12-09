package net.ukr.andy777;

/* Описать класс "Cat". Наделить его свойствами. */

public class Cat {
	private String nickname;
	private String color;
	private double weight;
	private int age;
	private boolean home;
	private String eyeColor;
	private double jumping = 0;

	public Cat(String nickname, String color, double weight, int age,
			boolean home, String eyeColor) {
		super();
		this.nickname = nickname;
		this.color = color;
		this.weight = weight;
		this.age = age;
		this.home = home;
		this.eyeColor = eyeColor;
	}

	public Cat() {
		super();
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHome() {
		return home;
	}

	public void setHome(boolean home) {
		this.home = home;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public double getJumping() {
		return jumping;
	}

	public void jumpLong(double a) {
		jumping += a;
	}

	public void jumpShort(double b) {
		if (jumping - b >= 0)
			jumping -= b;
	}

	public void mumble() {
		System.out.println("MEOW-MEOW");
	}

	public String toString() {
		return "Cat [" + "nickname=" + nickname + ", color=" + color
				+ ", weight=" + weight + ", age=" + age + ", isHome=" + home
				+ ", eyeColor=" + eyeColor + ", jumping=" + jumping + "]";
	}

}