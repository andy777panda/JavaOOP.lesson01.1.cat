package net.ukr.andy777;

/*
 Описать класс "Cat". Наделить его свойствами. 
 Создать несколько экземпляров класса. Использовать объекты
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("Lesson1 Task1");
		Cat();
	}

	private static void Cat() {

		Cat cat1 = new Cat("Reddy", "red", 2.3, 3, true, "green");
		Cat cat2 = new Cat("Greyy", "grey", 1.5, 2, false, "grey");
		Cat cat3 = new Cat("Blacky", "black", 3, 4, true, "blue");

		cat1.mumble();
		System.out.println(cat1);
		cat1.setEyeColor("brown");
		cat1.setHome(true);
		System.out.println(cat1);
		System.out.println();

		cat2.mumble();
		cat2.jumpLong(1.3);
		System.out.println(cat2);
		System.out.println();

		cat3.mumble();
		cat3.jumpShort(2);
		cat3.jumpLong(2);
		cat3.jumpShort(0.9);
		System.out.println(cat3);
	}
}