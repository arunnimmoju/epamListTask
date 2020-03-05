package epamListTask.epamListTask;

import java.util.ArrayList;
import java.util.Scanner;

import operations.addOp;
import operations.deleteOp;

class listOperation {
	listOperation() {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(9);
		aList.add(5);
		aList.add(6);
		aList.add(2);
		aList.add(3);
		aList.add(6);
		aList.add(4);
		aList.add(1);
		aList.add(10);
		aList.add(7);

		System.out.println(aList);

		System.out.println("Choose a List Operation from the following:- \n1.Add\n2.Delete\n3.View");
		Scanner s = new Scanner(System.in);
		Integer sel = s.nextInt();

		addOp op = new addOp();
		deleteOp dop = new deleteOp();

		if (sel == 1) {
			op.add(aList);
			System.out.println("Updated List after adding elements:-\n" + aList);

		} else if (sel == 2) {
			dop.delete(aList);
			System.out.println("Updated List after deleting element:-\n" + aList);

		} else if (sel == 3) {
			System.out.println(aList);

		} else {

			System.out.println("Invalid operator selected");
		}

	}

}
