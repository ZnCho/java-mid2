package generic.ex4;

/***
 * 제네릭 타입
 * 정의: GenericClass<T>
 * 타입 인자 전달: 객체를 생성하는 시점
 * 		예) new GenericClass<String>
 *
 * 제네릭 메서드 / static 사용 가능, 타입 매개변수 제한 가능
 * 정의: <T> T generigMethod(T t)
 * 타입 인자 전달: 메서드를 호출하는 시점
 * 		예) GenericMethod.<Integer>genericMethod(i);
 */
public class GenericMethod {

	public static Object objMethod(Object obj) {
		System.out.println("Object print: " + obj);
		return obj;
	}

	// <T> : generic method라는 것을 선언해줌
	public static <T> T genericMethod(T t) {
		System.out.println("Generic print: " + t);
		return t;
	}

	public static <T extends Number> T numberMethod(T t) {
		System.out.println("bound print: " + t);
		return t;
	}
}
