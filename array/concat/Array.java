import java.util.Arrays;

public class ConcatArray
{
	public static void main(String[] args)
	{
		System.out.println( "Concatenate two Array's:");

                String[] x = {"alpha","bravo","charlie","delta","echo","foxtrot"};
                String[] y = {"golf","hotel"};

		Array.concat(x,y);
		
		System.out.println("");
	}
	public static void concat(String[] a,String[] b)
	{
		List<String> array = new ArrayList<String>(Arrays.asList(a));
		array.addAll(Arrays.asList(b));
		
		Object[] c = array.toArray();
		System.out.print(Arrays.toString(c) + "\n");
	}
}
