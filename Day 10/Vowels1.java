import java.util.Scanner;
class Vowels1
{
	public static void main(String[] args)
	{
		Scanner bk = new Scanner(System.in);
		System.out.print("choose your option : ");
		char a=bk.next().charAt(0);
		switch(a)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
		    System.out.println("Vowel");
			break;
			default: 
			System.out.println("consonant");
		}
	}
}