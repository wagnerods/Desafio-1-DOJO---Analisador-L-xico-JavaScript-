package analisadorlexico.compiler.main;

import analisadorlexico.compiler.exceptions.IsiLexicalException;
import analisadorlexico.compiler.exceptions.IsiSyntaxException;
import analisadorlexico.compiler.lexico.IsiScanner;
import analisadorlexico.compiler.parser.IsiParser;

public class MainClass {

	public static void main(String[] args) {
		try {
			IsiScanner sc = new IsiScanner("input.isi");
			IsiParser pa = new IsiParser(sc);

			pa.E();

			System.out.println("Compilation Successful!");
		} catch (IsiLexicalException ex) {
			System.out.println("Lexical Error " + ex.getMessage());
		} catch (IsiSyntaxException ex) {
			System.out.println("Syntax Error " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Generic Error!!");
			System.out.println(ex.getClass().getName());
		}
	}
}
