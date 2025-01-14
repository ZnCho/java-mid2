package collection.link;

public class MyLinkedListV1 {
	
	private Node first;
	private int size = 0;
	
	public void add(Object e) { //O(n)
		Node newNode = new Node(e);
		if (first == null) {
			first = newNode;
		} else {
			Node lastNode = getLastNode(); //마지막 노드 찾는덴 O(n)
			lastNode.next = newNode; //마지막 노드에 새 노드 추가하는 건 n(1)
		}
		size++;
	}

	private Node getLastNode() { //O(n)
		Node x = first;
		while (x.next != null) {
			x = x.next;
		}
		return x;
	}
	
	public Object set(int index, Object element) { //O(n)
		Node x = getNode(index);
		Object oldValue = x.item;
		x.item = element;
		return oldValue;
	}

	public Object get(int index) { //O(n)
		Node node = getNode(index);
		return node.item;
	}

	private Node getNode(int index) {
		Node x = first;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}

	public int indexOf(Object o) { //O(n)
		int index = 0;
		for (Node x = first; x != null; x = x.next) {
			if (o.equals(x.item)) {
				return index;
			}
			index++;
		}
		return -1;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		return "MyLinkedListV1{" +
				"first=" + first +
				", size=" + size +
				'}';
	}
}
