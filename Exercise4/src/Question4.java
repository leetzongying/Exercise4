import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		System.out.println("Question 4");
		//The variable list1 and list2 are reference arrays that each have 5 elements
		//Write code that copies the values in list1 to list2. Values in list1 are input by user
		int[] list1 = new int [5];
		int[] list2 = list1;
		Scanner in=new Scanner(System.in);
		System.out.println("List 1:");
		System.out.println("Enter 5 numbers: ");
		for (int i=0; i<list1.length; i++) {
			list1[i]=in.nextInt();
		} System.out.println();
		System.out.println("List 2");
		for (int i=0; i<list2.length; i++) {
			System.out.println(list2[i]);
		}	
		in.close();

	}

}
