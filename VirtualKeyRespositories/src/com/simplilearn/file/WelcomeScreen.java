package com.simplilearn.file;

import java.io.IOException;
import java.util.Scanner;

public class WelcomeScreen{

	public static void main(String[] args) {

		BusinessLevel bl = new BusinessLevel();
		Scanner sc = new Scanner(System.in);

		int ch = 0, ch2 = 0;

		System.out.println(" *****Welcome to the LockedMe.com application ******** ");
		System.out.println("***************************************************************");
		System.out.println(" Developer: Harish ");

		do {
			System.out.println("\nPlease Select valid Option from the Main Menu");
			System.out.println("***********************************************************");
			System.out.println("1) Display all files in Ascending order");
			System.out.println("2) if you want Create/Search/Delete a file");
			System.out.println("3) Exit from the application");
			System.out.println("Enter your appropriate option between (1-3)");

			try {
				ch = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {

			}
			switch (ch) {
			case 1: {
				try {
					bl.SortingFile();
				} catch (IOException e1) {
					System.out.println("Directory does not exists");
				}
				break;
			}
			case 2:

				do {
					System.out.println("\nPlease Select Appropriate Option from the File Menu");
					System.out.println("*********************************************");
					System.out.println("4) To Create a File");
					System.out.println("5) To Search for a File");
					System.out.println("6) To Delete a File");
					System.out.println("7) Navigate to Main Menu");
					System.out.println("Enter your appropriate option between(4-7)");
					try {
						ch2 = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
					}
					switch (ch2) {
					case 4:
						try {
							bl.CreateFile(bl.Filedetails());
						} catch (IOException e) {
							System.out.println("File already exists");
						}
						break;

					case 5:
						try {
							bl.SearchFile(bl.Filedetails());

						} catch (IOException e) {

							System.out.println("Directory doesnot exists");
						}
						break;

					case 6:
						try {
							bl.DeleteFile(bl.Filedetails());
						} catch (IOException e) {

							System.out.println("Directory does not exists");
						}
						break;

					case 7:
						break;

					default:
						break;
					}
				} while (ch2 == 4 || ch2 == 5 || ch2 == 6);
				break;
			case 3:
				System.out.println("Thank you for using our application");
				break;

			default:
				break;
			}

		} while (ch != 3);

	}
}