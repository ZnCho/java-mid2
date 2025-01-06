package generic.ex1;

public class RowTypeMain {

	public static void main(String[] args) {
		GenericBox integerBox = new GenericBox(); //하위호환을 위해 사용하는 로타입 <> 다이아몬드 안에 타입 지정 x
//		GenericBox<Object> integerBox = new GenericBox<>();
		integerBox.set(10);
		Integer result = (Integer) integerBox.get();
		System.out.println("result = " + result);
	}
}
