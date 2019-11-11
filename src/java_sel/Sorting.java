package java_sel;

public class Sorting {

	public static void main(String[] args) {
		int[] a = { 5, 4, 6, 3, 3, 2, 2, 1 };
		int key, temp;
		int group = 0;
		for (int i = 0; i < a.length; i++) {
			key = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (key > a[j]) {
					temp = key;
					key = a[j];
					a[j] = temp;
				}
			}
			a[i] = key;
		}
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}
		if (a.length != 0) {

			group++;
		}
		key = a[0];
		for (int i = 0; i < a.length; i++) {
			if (key != a[i]) {
				key = a[i];
				group++;
			}
		}
		System.out.println("no.og groups=" + group);
	}

}
