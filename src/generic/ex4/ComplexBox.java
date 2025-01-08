package generic.ex4;

import generic.animal.Animal;

/***
 *   제네릭 타입보다 제네릭 메서드가 우선순위를 가진다. (즉, 이름이 똑같아도 좀 더 가깝고 구체적인 쪽이 우선순위를 가짐)
 */
public class ComplexBox <T extends Animal> {

	private T animal;

	public void set(T animal) {
		this.animal = animal;
	}

	public <T> T printAndReturn(T t) { //이름이 모호할 땐 해당 제네릭을 T가 아닌 다른 이름으로 선언해야함. (T -> Z)
		System.out.println("animal.className: " + animal.getClass().getName());
		System.out.println("t.className: " + t.getClass().getName());
//		t.getName(); //Animal의 기능을 호출할 수 없음.
		return t;
	}
}
