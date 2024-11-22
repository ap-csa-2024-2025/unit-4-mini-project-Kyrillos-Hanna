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
		String output = input.substring(0, 1);
		String vowels = "aeiou";
		int removedVowels = 0;
		int repeatedConsonants = 0;
		int charactersSaved = input.length();
		
		for (int i = 1; i < input.length(); i++) {
			if (vowels.indexOf(input.substring(i, i +1)) == -1 || input.substring(i - 1, i).equals(" ") ) {
				if (!(input.substring(i, i + 1).equals(input.substring(i - 1, i)))) {
					output += input.substring(i, i + 1);
				}  else {
					repeatedConsonants++;
				}
			} else {
				removedVowels+=1;
			}
		} 

		charactersSaved = input.length() - output.length();

		System.out.println("Algorithm 1");
		System.out.println("Vowels removed: " + removedVowels);
		System.out.println("Repeats removed: " + repeatedConsonants);
		System.out.println("Algorithm 1 message: " + output);
		System.out.println("Algorithm 1 characters saved: " + charactersSaved);

	}

	// This method should implement Algorithm 2 and print all neccessary data
	public static void algorithm2(String input)
	{
		input = input.toLowerCase();
		String output = "";
		int count = 0;
		int unique = 0;

		for (int i = 0; i < input.length(); i++) {
			String currentLetter = input.substring(i, i + 1);
			
			if (!(currentLetter.equals(" ") && output.indexOf(currentLetter) == -1)) {
				

				
			}
		}
	}
}
