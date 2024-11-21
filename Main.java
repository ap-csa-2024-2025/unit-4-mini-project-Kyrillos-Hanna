import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// No need to touch anything in here
		Scanner sc = new Scanner(System.in);
		String str = null;

		System.out.println("Enter a sentence:");
		str = sc.nextLine();

		algorithm1(str);
		algorithm2(str);

		sc.close();
	}

	// This method should implement Algorithm 1 and print all neccessary data
	public static void algorithm1(String input)
	{
		input = input.toLowerCase();
		String output = "";
		String vowels = "aeiou";
		int removedVowels = 0;
		int repeatedVowels = 0;
		int charactersSaved = 0;
		
		for (int i = 1; i < input.length(); i++) {
			if (vowels.index)) {
				if (input.substring())
			}
		}

	}

	// This method should implement Algorithm 2 and print all neccessary data
	public static void algorithm2(String input)
	{
		// TODO: Put solution to Algorithm 1 here
		System.out.println("Implement me!");
	}
}
