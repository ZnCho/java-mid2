package generic.ex4;

public class MethodMain1 {

	public static void main(String[] args) {
		Integer i = 10;
		Object object = GenericMethod.objMethod(i);
//		Integer result = (Integer) GenericMethod.objMethod(i);

		// 타입 인자(Type Argument) 명시적 전달 : ㅇㅇㅇ.<~~~>ㅁㅁㅁ();
		System.out.println("명시적 타입 인자 전달");
		Integer result = GenericMethod.<Integer>genericMethod(i);
		System.out.println("result = " + result);
		Integer integerValue = GenericMethod.<Integer>numberMethod(10);
		Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

		//타입 추론: 메서드에 전달되는 인자의 타입과 반환 타입을 통해서 자바 컴파일러는 타입 인자를 추론할 수 있다. <~~~> 생략 가능.
		Integer result2 = GenericMethod.genericMethod(i);
		Integer integerValue2 = GenericMethod.numberMethod(10);
		Double doubleValue2 = GenericMethod.numberMethod(20.0);
	}
}
