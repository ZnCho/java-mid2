package generic.ex5;

import generic.animal.Animal;

/***
 *   와일드카드는 이미 만들어진 제네릭 타입을 활용하는 것. 제네릭 타입을 쉽게 활용할 수 있게 도와주는 도구.
 *   제네릭 타입이나 제네릭 메서드가 꼭 필요한 상황이면 <T>를 사용하고,
 *   그렇지 않은 상황이면 와일드카드를 사용하는 것을 권장한다.
 */
public class WildcardEx {

	//이것은 제네릭 메서드이다.
	//Box<Dog> dogBox를 전달한다. 타입 추론에 의해 타입 T가 Dog가 된다.
	static <T> void printGenericV1(Box<T> box) {
		System.out.println("T = " + box.get());
	}

	// 이것은 제네릭 메서드가 아니다. 일반적인 메서드이다.
	// Box<Dog> dogBox를 전달한다. 와일드카드 ?는 모든 타입을 받을 수 있다.
	//  ?는 뭐든 들어올 수 있다는 의미: ? == <? extends Object>
	// 비제한 와일드카드: ?만 사용해서 제한 없이 모든 타입을 다 받을 수 있는 와일드카드
	static void printWildcardV1(Box<?> box) {
		System.out.println("? = " + box.get());
	}

	static <T extends Animal> void printGenericV2(Box<T> box) {
		T t = box.get();
		System.out.println("이름 = " + t.getName());
	}

	// 상한 와일드카드
	// 제네릭 메서드처럼 상한 제한을 두는 것.
	static void printWildcardV2(Box<? extends Animal> box) {
		Animal animal = box.get();
		System.out.println("이름 = " + animal.getName());
	}

	// 메서드의 타이들을 특정 시점에 변경하려면 제네릭 타입이나, 제네릭 메서드를 사용해야한다.
	static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
		T t = box.get();
		System.out.println("이름 = "	 + t.getName());
		return t;
	}

	// 이미 만들어진 제네릭 타입을 전달 받아서 활용할 때 사용. 따라서 메서드의 타입들을 타입 인자를 통해 변경할 수 없다.
	static Animal printAndReturnWildcard(Box<? extends Animal> box) {
		Animal animal = box.get();
		System.out.println("이름 = "	 + animal.getName());
		return animal;
	}
}
