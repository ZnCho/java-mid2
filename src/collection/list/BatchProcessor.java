package collection.list;

public class BatchProcessor {

	private final MyList<Integer> list;

	//의존 관계까 외부에서(생성할 때) 주입 : 생성자 의존관계주입(DI) (new BatchProcessor(new MyLinkedList());)
	//MyList = new MyArrayList
	//MyList = new MyLinkedList
	public BatchProcessor(MyList<Integer> list) {
		this.list = list;
	}

	public void logic(int size) {
		long statrtTiem = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			list.add(0, i); //앞에 추가
		}
		long endTime = System.currentTimeMillis();
		System.out.println("크기: " + size + ", 계산 시간: " + (endTime - statrtTiem) + "ms");
	}
}
