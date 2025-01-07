package generic.ex3;

/***
 *   제네릭에서 타입 매개변수를 사용하면 어떤 타입이든 들어올 수 있다.
 *   따라서 타입 매개변수를 어떤 타입이든 수용할 수 있는 Object로 가정하고, Object의 기능만 사용할 수 있다.
 *   타입 인자를 Animal과 관련된 인자로만 제한할 수 있다면? -> 타입 매개변수 제한
 */
public class AnimalHospitalV2<T> {

	private T animal;

	public void set(T animal) {
		this.animal = animal;
	}

	public void checkup() {
		// T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용
		animal.toString();
	  	animal.equals(null);
	  	// 컴파일 오류
//		System.out.println("동물 이름: " + animal.getName());
//		System.out.println("동물 크기: " + animal.getSize());
//		animal.sound();
	}

	public T bigger(T target) {
		// 컴파일 오류
//		return animal.getSize() > target.getSize() ? animal : target;
		return null;
	}
}
