
//public class ArrayIterationExample {
//			public static void main(String[] args) {
//			int[][] array1 = {{1, 2}, {3, 4}};
//			int[][] array2 = {{11, 22}, {33, 44}};
//
//			// Enhanced loop with nested loops
//			for (int[] row1 : array1) {
//			for (int[] row2 : array2) {
//			for (int element1 : row1) {
//			System.out.print(element1 + " ");
//			}
//			System.out.print("| ");
//			for (int element2 : row2) {
//			System.out.print(element2 + " ");
//			}
//			System.out.println();
//			}
//			}
//			}
//			}

public class ArrayIterationExample {
public static void main(String[] args) {
int[][] array1 = {{1, 2}, {3, 4}};
int[][] array2 = {{11, 22}, {33, 44}};

// Enhanced loop with nested loops
for (int i = 0; i < array1.length; i++) {
for (int element1 : array1[i]) {
System.out.print(element1 + " ");
}
System.out.print("| ");
for (int element2 : array2[i]) {
System.out.print(element2 + " ");
}
System.out.println();
}
}
}