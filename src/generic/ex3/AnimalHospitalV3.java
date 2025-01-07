package generic.ex3;

import generic.animal.Animal;

/***
 *   제네릭에 타입 매개변수 상한을 사용해서 타입 안정성을 지키면서 상위 타입의 원하는 기능까지 사용할 수 있다.
 *   코드 재사용성과 타입 안정성 둘 다 잡을 수 있다.
 */
public class AnimalHospitalV3<T extends Animal> { //매개변수 상항(T extends Animal): 매개변수로 Animal과 그 자식만 받을 수 있도록 제한을 두는 것

	private T animal;

	public void set(T animal) {
		this.animal = animal;
	}

	public void checkup() {
		System.out.println("동물 이름: " + animal.getName());
		System.out.println("동물 크기: " + animal.getSize());
		animal.sound();
	}

	public T bigger(T target) {
		return animal.getSize() > target.getSize() ? animal : target;
	}
}
