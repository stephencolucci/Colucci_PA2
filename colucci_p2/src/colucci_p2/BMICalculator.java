package colucci_p2;

import java.util.Scanner;

public class BMICalculator {
private double weight;
private double height;
private double bmi;
private int choice;
public BMICalculator() {
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BMICalculator app = new BMICalculator();
app.readUserData();
app.calculateBMI();
app.displayBMI();
	}

//readUserData
	public void readUserData() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			//Prints out the units for each formula and asks user to enter 1 or 2 depending on which formula they want to use
			System.out.println("Formula 1. Weight in pounds, height in inches.");
			System.out.println("Formula 2. Weight in kilograms, height in meters.");
			System.out.println("Enter 1 or 2:");
			choice = sc.nextInt();
			//If the user types 1 or 2, prompts for height and weight will be printed; if 1 is entered, height & weight must be in inches & lbs, if 2 is entered, heigth & weight must be meters & kg
			if(choice == 1) {
				System.out.println("Enter Weight in lbs:");
				weight = sc.nextDouble();
				System.out.println("Enter Height in inches:");
				height = sc.nextDouble();
				
						break;
				}else if (choice == 2) {
					System.out.println("Enter Weight in kg:");
					weight = sc.nextDouble();
					System.out.println("Enter Height in meters:");
					height = sc.nextDouble();
					
					break;
				}else {
					System.out.println("Invaild Choice");
				}
			}
		}
	//calculate BMI using the formula chosen in readUserData
	public void calculateBMI(){
		if (choice == 1) {
			bmi = (703 * weight)/(height * height); 
			}else {
				bmi = weight/(height * height);
			}
		}
	//displays the user's BMI along with the BMI categories
	public void displayBMI() {
		System.out.println("Your BMI:" +bmi);
		System.out.println("Underweight: BMI <18.5");
		System.out.println("Normal Weight: BMI = 18.5-24.9");
		System.out.println("Overweight: BMI = 25-29.9");
		System.out.println("Obese: BMI 30 or higher");
		}
	}