package stringconcepts;

public class StringBuilderClass {
	/*
	 * Java StringBuilder class is used to create mutable (modifiable) string, which is same as StringBuffer.
	 * The only difference is StringBuilder is non-synchronized, i.e. not thread safe. i.e. not thread safe.
	 */
	
	public StringBuilderClass() {
		// TODO Auto-generated constructor stub
		long startTime = 0;
		StringBuffer strBuff = new StringBuffer("Hello");
		startTime = System.currentTimeMillis();
		for(int i=0; i<=100_000; i++) {
			strBuff.append(" World");
		}
		System.out.println("Time taken by Concating with StringBuffer: "+ (System.currentTimeMillis() - startTime) + "ms");  
		
		StringBuilder strBuild = new StringBuilder("Hello");
		startTime = System.currentTimeMillis();
		for(int i=0; i<=100_000; i++) {
			strBuild.append(" World");
		}
		System.out.println("Time taken by Concating with StringBuilder: "+ (System.currentTimeMillis() - startTime) + "ms");
	}
}
