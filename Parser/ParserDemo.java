public class ParserDemo {
	
	// private static String file1 = "C:\\Users\\cscharff\\Desktop\\TESTSCANNERPARSER2010\\GIVEN\\PARSER\\prog2.jay";​
	private static String file1 = "/Users/Nick/jay/test1.jay";
	
	
	public static void main(String[] args) {
		TokenStream tStream = new TokenStream(file1);
		System.out.println("test1");
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		System.out.println("test2");
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");
	}

}
