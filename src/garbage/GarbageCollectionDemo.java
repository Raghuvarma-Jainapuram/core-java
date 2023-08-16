package garbage;

public class GarbageCollectionDemo {

	public void finalize()
	{
		System.out.println ("Garbage Collection performed by JVM");
	}
	public static void main (String args[])
	{
		GarbageCollectionDemo s1 = new GarbageCollectionDemo();
		GarbageCollectionDemo s2 = new GarbageCollectionDemo();
		s1 = null;
		s2 = null;
		System.gc();
	}

}
