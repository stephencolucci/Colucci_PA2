package colucci_p1;

import java.util.Scanner;

public class Decrypter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int digit1, digit2, digit3, digit4, num, temp;
Scanner input = new Scanner(System.in);

//decrypts the number entered by the user
do {
	num = input.nextInt();
}while (num / 1000 == 0 || num / 10000 != 0);

digit1 = num / 1000;
digit2 = num / 100% 10;
digit3 = num / 10 % 10;
digit4 = num % 10;

if(digit1 <= 6 && digit1 >= 0)
	digit1 = digit1 + 10;
if(digit2 <= 6 && digit2 >= 0)
	digit2 = digit2 + 10;
if(digit3 <= 6 && digit3 >= 0)
	digit3 = digit3 + 10;
if(digit4 <= 6 && digit4 >= 0)
	digit4 = digit4 + 10;

digit1 = digit1 + 3;
digit2 = digit2 + 3;
digit3 = digit3 + 3;
digit4 = digit4 + 3;

temp = digit1;
digit1 = digit3;
digit3 = temp * 10;

temp = digit2;
digit2 = digit4;
digit4 = temp * 10;

//prints out the decrypted number
System.out.printf("Decrypted Number: %d\n", digit1 + digit2 + digit3 + digit4);
	}

}
