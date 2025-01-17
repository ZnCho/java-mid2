package collection.list;

public class BatchProcessorMain {

	public static void main(String[] args) {
		MyArrayList<Integer> list = new MyArrayList<>(); //x001
		MyLinkedList<Integer> list2 = new MyLinkedList<>(); //x002

		BatchProcessor processor = new BatchProcessor(list);
		processor.logic(1_000_000);
	}
}
