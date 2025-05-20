package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

	static final int CAPACIITY = 10; //capacity의 값에 따라 충돌 확률이 달라짐
	// 입력한 데이터의 수가 배열의 크기를 75% 넘지 않으면 해시 인덱스는 자주 충돌하지 않는다.

	public static void main(String[] args) {
		// {1, 2, 5, 8, 14, 99, 9}
		LinkedList<Integer>[] buckets = new LinkedList[CAPACIITY];
		System.out.println("buckets = " + Arrays.toString(buckets));
		for (int i = 0; i < CAPACIITY; i++) {
			buckets[i] = new LinkedList<>();
		}

		System.out.println("buckets = " + Arrays.toString(buckets));

		add(buckets, 1);
		add(buckets, 2);
		add(buckets, 5);
		add(buckets, 8);
		add(buckets, 14);
		add(buckets, 99);
		add(buckets, 9); //중복
		System.out.println("buckets = " + Arrays.toString(buckets));

		//검색
		int searchValue = 9;
		boolean contains = contains(buckets, searchValue);
		System.out.println("bucket.contains(" + searchValue + ") = " + contains);
	}

	private static void add(LinkedList<Integer>[] buckets, int value) {
		int hashIndex = hashIndex(value);
		LinkedList<Integer> bucket = buckets[hashIndex]; // 0(1)
		if (!bucket.contains(value)) { // O(n)
			bucket.add(value);
		}
	}

	private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
		int hashIndex = hashIndex(searchValue);
		LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
		return bucket.contains(searchValue); // O(n)
	}

	static int hashIndex(int value) {
		return value % CAPACIITY;
	}
}
