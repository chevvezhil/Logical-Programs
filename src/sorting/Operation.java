package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Operation {
	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static Scanner scan = new Scanner(System.in);

	public static void selectOperation() {
		System.out.println(" 1. number operation");
		System.out.println(" 2. String Operation");
		System.out.println(" 3. Exit");
	}

	public static void NumShow() {

		System.out.println(" 1.Sorting");
		System.out.println(" 2.Reversing");
		System.out.println(" 3.PrimeNumber");
		System.out.println(" 4.Duplicate");
		System.out.println(" 5.Calculator");
		System.out.println(" 6.Exit");

	}

	public static void sortNum() {

		int i, j, num = 0, temp;
		try {
			System.out.println("enter the number of element to sort");
			num = scan.nextInt();
			int[] n = new int[num];
			if (num != 0) {

				if (num >= 2) {
					System.out.println("enter " + num + " integers");
					for (int k = 0; k < num; k++)
						n[k] = scan.nextInt();
					for (i = 0; i < num - 1; i++) {
						for (j = 0; j < num - i - 1; j++) {
							if (n[j] > n[j + 1]) {
								temp = n[j];
								n[j] = n[j + 1];
								n[j + 1] = temp;
							}
						}
					}

				} else {
					System.out.println("enter atleast 2 number");
				}
			} else {
				System.out.println("please provide any number");
				sortNum();
			}

			for (i = 0; i < num; i++)
				System.out.println("the sorted Number is " + n[i]);
		} catch (Exception e) {
			System.out.println("Enter only number");
			scan.next();
			sortNum();

		}
		NumberOperations();
	}

	public static void revNum() {
		try {
			int n, rev = 0;
			System.out.println("Enter the num that you want to reverse");
			n = scan.nextInt();
			while (n != 0) {
				rev = rev * 10;
				rev = rev + n % 10;
				n = n / 10;
			}
			System.out.println("The reversed Number is " + rev);

		} catch (InputMismatchException e) {
			System.out.println("enter only number");
			scan.next();
			revNum();
		}

		NumberOperations();

	}

	public static void primeNum() {
		try {
			long n;
			System.out.println("Enter the number");
			n = scan.nextLong();
			if (n != 0) {
				for (int j = 2; j <= n / 2; j++) {
					if (n % j == 0) {
						System.out.println("Not a prime number");
					} else {
						System.out.println(" the  number " + n + "is  " + "prime number");
					}
				}
			} else {
				System.out.println("invalid number provide a number other than 0");
				primeNum();
			}
		} catch (InputMismatchException e) {
			System.out.println("enter number only");
			scan.next();
			primeNum();
		}
		NumberOperations();
	}

	public static void duplicate() {
		try {
			System.out.println("Enter the number of elements you want to enter");
			int num = scan.nextInt();
			if (num >= 2) {
				int[] numbers = new int[num];
				System.out.println(" enter the numbers");
				for (int j = 0; j < num; j++) {
					numbers[j] = scan.nextInt();
				}
				for (int i = 0; i < numbers.length; i++) {
					int count = 0;
					for (int j = i + 1; j < numbers.length; j++) {

						if (numbers[i] == (numbers[j])) {
							count++;
							break;
						}
						System.out.println("duplicate element " + numbers[i] + " found" + " and is printed" + count
								+ " times");}
				}
			} else {
				System.out.println("The number of elements must be greater than or equal to 2");
				duplicate();
			}
		} catch (Exception e) {
			System.out.println("enter number only");
			scan.next();
			duplicate();
		}
		NumberOperations();
	}

	public static void calcMenu() {
		System.out.println(" 1.adition");
		System.out.println(" 2.Subtraction");
		System.out.println(" 3.Multiplication");
		System.out.println(" 4.Division");
		System.out.println(" 5.absolute Integer value");
		System.out.println(" 6.square Root");
		System.out.println(" 7.power of number");
		System.out.println(" 8.Log value");
		System.out.println(" 9.sin value");
		System.out.println(" 10.cos value");
		System.out.println(" 11.inverse sin value");
		System.out.println(" 12. a cos value");
		System.out.println(" 13.Exit");
	}

	public static void add() {
		try {
			int sum = 0, i;
			System.out.println(" enter the for addition");
			int a[] = new int[100];
			for (i = 0; i < 100; i++) {
				a[i] = scan.nextInt();
			}
			if (a[i] >= 2) {
				for (i = 0; i < 100; i++) {
					sum = sum + a[i];
				}
				System.out.println(" the sum of  numbers are " + sum);
			} else {
				System.out.println("please enter atleast two number");
				add();
			}
		} catch (InputMismatchException e) {
			System.out.println("enter only intergers");
			scan.next();
			add();
		}
		calc();
	}

	public static void sub() {
		try {
			int sub = 0, i;
			System.out.println(" enter the for addition");
			int a[] = new int[100];
			for (i = 0; i < 100; i++) {
				a[i] = scan.nextInt();
			}
			if (a[i] >= 2) {
				for (i = 0; i < 100; i++) {
					sub = a[i] - sub;
					System.out.println(" the subtraction of numbers are " + sub);
				}
			} else {
				System.out.println("please enter atleast two number");
				sub();
			}
		} catch (InputMismatchException e) {
			System.out.println("enter only intergers");
			scan.next();
			sub();
		}
		calc();
	}

	public static void mul() {
		try {
			int mul = 1, i;
			int a[] = new int[100];

			for (i = 0; i < 100; i++) {
				a[i] = scan.nextInt();
			}
			if (a[i] >= 2) {
				for (i = 0; i < 100; i++) {
					mul = mul * a[i];
				}
				System.out.println(" the multiplication of   numbers are " + mul);
			} else {
				System.out.println("please enter atleast two number");
				mul();
			}
		} catch (InputMismatchException e) {
			System.out.println("enter only intergers");
			scan.next();
			mul();
		}
		calc();
	}

	public static void div() {
		try {
			System.out.println("enter the first number");
			int first = scan.nextInt();
			System.out.println("enter the second number");
			int second = scan.nextInt();

			int c = first / second;
			System.out.println("the division of numbre is " + c);
		} catch (Exception e) {
			System.out.println("enter only integers");
			scan.next();
			div();
		}
		calc();
	}

	public static void absoluteInt() {
		try {
			System.out.println("Enter the integer number for absolute value");
			int a = scan.nextInt();
			System.out.println(Math.abs(a));

		} catch (Exception e) {
			System.out.println("enter integer only");
			scan.next();
			absoluteInt();
		}
		calc();
	}

	public static void squareRoot() {
		try {
			System.out.println("Enter the number");
			int n = scan.nextInt();
			System.out.println("the square root of " + n + "is " + Math.sqrt(n));
		} catch (InputMismatchException e) {
			System.out.println("enter numbers only");
			scan.next();
			squareRoot();
		}
		calc();

	}

	public static void power() {
		try {
			System.out.println("Enter the number");
			int a = scan.nextInt();
			System.out.println("enter num");
			int b = scan.nextInt();
			System.out.println("the " + a + "power " + b + "is " + Math.pow(a, b));
		} catch (InputMismatchException e) {
			System.out.println("enter num only");
			scan.next();
			power();
		}
		calc();
	}

	public static void logValue() {
		try {
			System.out.println("Enter the number");
			int n = scan.nextInt();
			System.out.println("the log value of " + n + "is " + Math.log(n));

		} catch (InputMismatchException e) {
			System.out.println("enter num only");
			scan.next();
			logValue();
		}
		calc();
	}

	public static void sinValue() {
		try {
			System.out.println("Enter the number");
			int n = scan.nextInt();
			System.out.println("the sin value of " + n + "is " + Math.sin(n));
		} catch (InputMismatchException e) {
			System.out.println("enter num only");
			scan.next();
			sinValue();
		}
		calc();
	}

	public static void cosValue() {
		try {
			System.out.println("Enter the number");
			int n = scan.nextInt();
			System.out.println("the cos value of " + n + "is " + Math.cos(n));
		} catch (InputMismatchException e) {
			System.out.println("enter num only");
			scan.next();
			cosValue();
		}
		calc();
	}

	public static void sinHValue() {
		try {
			System.out.println("Enter the number");
			int n = scan.nextInt();
			System.out.println("the inverse sin value of " + n + "is " + Math.sinh(n));
		} catch (InputMismatchException e) {
			System.out.println("enter num only");
			scan.next();
			sinHValue();
		}
		calc();
	}

	public static void aCosValue() {
		try {
			System.out.println("Enter the number");
			int n = scan.nextInt();
			System.out.println("the  acos value of " + n + "is " + Math.acos(n));
		} catch (InputMismatchException e) {
			System.out.println("enter num only");
			scan.next();
			aCosValue();
		}
		calc();
	}

	public static void calc() {

		calcMenu();
		try {
			int choice;
			System.out.println("Enter the operation you want");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				add();
				break;
			case 2:
				sub();
				break;
			case 3:
				mul();
				break;
			case 4:
				div();
				break;
			case 5:
				absoluteInt();
				break;
			case 6:
				squareRoot();
				break;
			case 7:
				power();
				break;
			case 8:
				logValue();
				break;
			case 9:
				sinValue();
				break;
			case 10:
				cosValue();
				break;
			case 11:
				sinHValue();
				break;
			case 12:
				aCosValue();
				break;
			case 13:
				selectOperation();
				choice();
				break;
			default:
				System.out.println("invalid choice");
				calc();
			}
		} catch (InputMismatchException e) {
			System.out.println("enter valid choice");
			scan.next();
			calc();
		}
	}

	public static void NumberOperations() {
		NumShow();
		try {
			System.out.println(" Enter your choice");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				sortNum();
				break;
			case 2:
				revNum();
				break;
			case 3:
				primeNum();
				break;
			case 4:
				duplicate();
				break;
			case 5:
				calc();
				break;
			case 6:
				selectOperation();
				choice();
				break;
			default:
				System.out.println("Invalid choice");
				NumberOperations();
			}

		} catch (InputMismatchException e) {
			System.out.println("enter valid choice");
			scan.next();
			NumberOperations();
		}
	}

	public static void stringShow() {

		System.out.println("1. String Sorting");
		System.out.println("2. String Reversing");
		System.out.println("3.Exit");
		System.out.println("Enter the choice");

	}

	public static void stringSort() {
		try {
			String s = "";
			System.out.println("Enter the string");
			try {
				s = bf.readLine();
			} catch (IOException e) {

			}
			char[] c = s.toCharArray();
			char temp;
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c.length; j++) {
					if (c[j] > c[i]) {
						temp = c[i];
						c[i] = c[j];
						c[j] = temp;
					}
				}
			}
			for (int k = 0; k < c.length; k++) {
				System.out.print(c[k]);
			}
		} catch (Exception e) {
			System.out.println("enter the string only");
			stringSort();
		}
		StringOperation();
	}

	public static void revChar() {
		String s = "";
		System.out.println("Enter the string");
		try {
			s = scan.next();
			char[] c = s.toCharArray();
			for (int i = s.length() - 1; i >= 0; i--)
				System.out.print(c[i]);
		} catch (Exception e) {

		}
		stringRev();
	}

	public static void revByword() {
		try {
			System.out.println("enter string");
			String s = scan.nextLine();
			String[] words = s.split(" ");
			for (int i = words.length - 1; i >= 0; i--) {
				System.out.print(words[i] + " ");
			}
		} catch (Exception e) {
			System.out.println("invalid");
			scan.next();
			revByword();
		}
		stringRev();
	}

	public static void revSentence() {
		try {
			System.out.println("Enter the string");
			String s = "";

			s = bf.readLine();

			String[] words = s.split(" ");
			for (int i = 0; i < s.length(); i++) {
				char[] s1 = words[i].toCharArray();

				for (int k = s1.length - 1; k >= 0; k--) {
					System.out.print(s1[k]);
				}
			}
		} catch (Exception e) {
			System.out.println("invalid");
			scan.next();
			revSentence();
		}
		stringRev();
	}

	public static void stringRev() {
		System.out.println(" 1. reverse by char");
		System.out.println(" 2.reverse by word");
		System.out.println(" 3.reverse by sentence");
		System.out.println(" 4. Exit");
		System.out.println("enter the choice");
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			revChar();
			break;
		case 2:
			revByword();
			break;
		case 3:
			revSentence();
			break;
		case 4:
			StringOperation();
			break;
		default:
			System.out.println("invalid choice");
			stringRev();
		}
	}

	public static void StringOperation() {
		stringShow();
		try {
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				stringSort();
				break;
			case 2:
				stringRev();
				break;
			case 3:
				selectOperation();
				choice();
				break;
			default:
				System.out.println("Invalid choice");
				StringOperation();
			}
		} catch (InputMismatchException e) {
			System.out.println("enter valid choice");
			scan.next();
			StringOperation();
		}
	}

	public static void choice() {
		try {
			System.out.println("Enter your choice:");
			Scanner sc = new Scanner(System.in);
			int ch;
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				NumberOperations();
				break;
			case 2:
				StringOperation();
				break;
			case 3:
				System.exit(0);
				
				break;
			default:
				System.out.println("invalid choice");
				choice();
			}
		} catch (Exception e) {
			System.out.println("enter only valid choice ");
			scan.next();
			choice();
		}
	}

	public static void main(String[] args) {
		selectOperation();
		choice();
	}
}
