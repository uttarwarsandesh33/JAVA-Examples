import java.util.*;
public class IteratorDemo
{
    public static void main(String args[])
    {
		// create a ArrrayList and add some values
	ArrayList myList = new ArrayList();	

	myList.add(new Integer(10));
	myList.add(new Double(25.5));
	myList.add(new Boolean(false));
	myList.add(new String("SNRao"));
	myList.add(new StringBuffer("Faculty"));
	myList.add(new Date());

	Iterator it = myList.iterator();
	while( it.hasNext() )
	{
		Object obj = it.next();
		System.out.println(obj);		
		if(obj instanceof Number)
			it.remove();
	}
	System.out.println("\nAFter deleting strings:");
	System.out.println(myList);
    }
}

	

	
	

