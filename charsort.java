import java.util.Arrays;
class Sortchar
{
	public static void main(String args[])
	{
		String str="tony k mathew";
		char[] charArray=str.toCharArray();
		Arrays.sort(charArray);
		System.out.println("Sorted characters:"+new String(charArray));
	}
}


/*Output:-

Sorted characters:  aehkmnottwy
*/
