package principal;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import excecoes.ExcecaoSemantica;
import parser.taskLangLexer;
import parser.taskLangParser;

public class App {
	public static void main(String[] args) throws Exception {
        try {
        	taskLangLexer lexer;
        	taskLangParser parser;
        	
        	lexer = new taskLangLexer(CharStreams.fromFileName("Input.task"));
        	
        	CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        	
        	parser = new taskLangParser(tokenStream);
        	
        	parser.prog();
        	System.out.println("Compilado com sucesso!");
        }
        catch(ExcecaoSemantica t) {
        	System.err.println("Erro semantico " + t.getMessage());
        }
        catch(Exception ex) {
        	System.err.println("ERROR " + ex.getMessage());
        }
    }
}
