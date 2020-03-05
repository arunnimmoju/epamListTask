package operations;

import java.util.ArrayList;
import java.util.Scanner;

public class addOp {
	public ArrayList<Integer> add(ArrayList<Integer> arrlist) {

		System.out.println("Number of elements you want to add:");
		Scanner s = new Scanner(System.in);
		Integer n = s.nextInt();
		int i;
		for (i = 1; i <= n; i++) {

			System.out.println("Enter the value of " + i + ":-");
			Scanner sc = new Scanner(System.in);
			Integer val = sc.nextInt();
			arrlist.add(val);
		}
		return arrlist;

	}
}
