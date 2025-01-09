package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

// 하한 와일드 카드: 하한은 제네릭 메서드, 제네릭 타입에서는 사용 불가능.
public class WildcardMain2 {

	public static void main(String[] args) {
		Box<Object> objBox = new Box<>();
		Box<Animal> animalBox = new Box<>();
		Box<Dog> dogBox = new Box<>();
		Box<Cat> catBox = new Box<>();

		// Animal 포함 상위 타입 전달 가능
		writeBox(objBox);
		writeBox(animalBox);
		// 하한이 Animal : 최소 Animal 타입까지만 가능. 이 이상의 상위 타입만 사용 가능.
//		writeBox(dogBox);
//		writeBox(catBox);

		Animal animal = animalBox.get();
		System.out.println("animal = " + animal);
	}

	static void writeBox(Box<? super Animal> box){ // super 하한 / extends 상한
		box.set(new Dog("멍멍이", 100));
	}
}
