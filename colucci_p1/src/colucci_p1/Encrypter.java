package colucci_p1;

import java.util.Scanner;

public class Encrypter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int digit1, digit2, digit3, digit4, num, temp;
Scanner input = new Scanner(System.in);

//encrypts the number entered by the user
do {
	num = input.nextInt();
}while (num / 1000 == 0 || num / 10000 != 0);

digit1 = num / 1000;
digit2 = num / 100 % 10;
digit3 = num / 10 % 10;
digit4 = num % 10;

digit1 = (digit1 + 7) % 10;
digit2 = (digit2 + 7) % 10;
digit3 = (digit3 + 7) % 10;
digit4 = (digit4 + 7) % 10;

temp = digit1;
digit1 = digit3;
digit3 = temp;

temp = digit2;
digit2 = digit4;
digit4 = temp;

//prints out the encrypted number
System.out.printf("Encrypted Number: %d%d%d%d\n", digit1, digit2, digit3, digit4);
	}

}
