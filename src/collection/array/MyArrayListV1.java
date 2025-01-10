package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

	//리스트(MyArrayList)를 생성할 때 사용하는 기본 배열 크기
	//배열의 크기를 다르게 만들고 싶으면 MyArrayListV1(int initialCapacity) 생성자를 사용하면 된다.
	private static final int DEFAULT_CAPACITY = 5;

	private Object[] elementData; //다양한 타입의 데이터를 보관하기 위해 Object 배열을 사용한다.
	private int size = 0; //리스트의 크기는 size를 사용한다. 리스트를 표현하기 위해 내부에서 배열을 사용할 뿐이다. 배열의 크기를 뜻하는 capacity와 다르다.

	public MyArrayListV1() {
		elementData = new Object[DEFAULT_CAPACITY];
	}

	public MyArrayListV1(int initialCapacity) {
		elementData = new Object[initialCapacity];
	}

	public int size(){
		return size;
	}

	//리스트에 데이터를 추가한다. 데이터를 추가하면 size가 하나 증가한다.
	public void add(Object e){
		elementData[size] = e;
		size++;
	}

	//인덱스에 있는 항목을 조회한다.
	public Object get(int index){
		return elementData[index];
	}

	//인덱스에 있는 항목을 변경한다.
	public Object set(int index, Object element){
		Object oldValue = get(index);
		elementData[index] = element;
		return oldValue;
	}

	//검색 기능. 리스트를 순차 탐색해서 인수와 같은 데이터가 있는 인덱스의 위치를 반환한다. 데이터가 없으면 -1을 반환한다.
	public int indexOf(Object o){
		for (int i = 0; i < size; i++) {
			if (o.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}

	//Arrays.copyOf(elementData, size): size 크기의 배열을 새로 만든다. 여기서 toString() 출력시 size 이후의 의미 없는 값을 출력하지 않기 위해 사용한다.
	public String toString() {
//		[1, 2, 3, null, null] // size = 3
//		[1, 2, 3] // size = 3
		return Arrays.toString(Arrays.copyOf(elementData, size)) +
				" size = " + size + ", capacity = " + elementData.length;
	}
}
