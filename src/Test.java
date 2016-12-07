import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test {
	public static void main(String[] args) throws Exception    { 
		MiniCLexer lexer = new MiniCLexer( new ANTLRFileStream("test.txt")); 
		CommonTokenStream tokens = new CommonTokenStream( lexer ); 
		MiniCParser parser  = new MiniCParser( tokens );
		ParseTree tree  = parser.program();
		System.out.println();
		ParseTreeWalker walker = new ParseTreeWalker(); 
		walker.walk(new MiniCPrintListener(), tree);
	}
}