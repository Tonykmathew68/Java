import java.util.Arrays;
class Sortstr
{
	public static void main(String args[])
	{
		String[] words={"aju","aji","luna","rohit","kumar"};
		Arrays.sort(words);
		System.out.println("Sorted array:");
		for(String word:words)
			System.out.println(word);
	}
}


/*Outpu:-

Sorted array:
aji
aju
kumar
luna
rohit
*/
