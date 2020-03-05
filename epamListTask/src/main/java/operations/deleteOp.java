package operations;

import java.util.ArrayList;
import java.util.Scanner;

public class deleteOp {
	public ArrayList<Integer> delete(ArrayList<Integer> arrlist) {

		System.out.println("Position where the element to be deleted:-");
		Scanner s = new Scanner(System.in);
		Integer index = s.nextInt();
		arrlist.remove(index);
		return arrlist;
	}
}
