package collection.list.test.ex1;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] strudents = {90, 80, 70, 60, 50};

		int total = 0;
		for (int i = 0; i < strudents.length; i++) {
			total += strudents[i];
		}

		double average = (double) total / strudents.length;
		System.out.println("점수 총합 = " + total);
		System.out.println("점수 평균 = " + average);
	}
}
