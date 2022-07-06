// Program to take value from user like Student Id, Gender (M/F), Age, Mobile No, CGPA

import java.util.Scanner;
class ScannerExample

	{
		public static void main(String[] args)
		{
			int id;
			char gender;
			byte age;
			long mobileno;
			float cgpa;

			Scanner sc= new Scanner(System.in);

			System.out.println("Enter Student Id:");
			id=sc.nextInt();

			System.out.println("Enter Gender:" );
			gender=sc.next().charAt(0);

			System.out.println("Enter Age:");
			age=sc.nextByte();


			System.out.println("Enter Mobile no :" );
			mobileno=sc.nextLong();

			System.out.println("Enter CGPA:" );
			cgpa=sc.nextFloat();



		}
	}