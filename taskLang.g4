grammar taskLang;

@header{
	import estruturas.taskSimbolo;
	import estruturas.taskTabelaSimbolo;
	import estruturas.taskVariavel;
	import excecoes.ExcecaoSemantica;
	import java.util.ArrayList;
}

@members{
	private int _tipo;
	private String _varName;
	private String _varValue;
	private taskTabelaSimbolo tabelaSimbolo = new taskTabelaSimbolo();
	private taskSimbolo simbolo;
	
	public void verificaID(String id){
		if (!tabelaSimbolo.exists(id)){
			throw new ExcecaoSemantica("Simbolo " + id + " nao declarado");
		}
	}
}

prog    : 'STARTPROG' decl bloco  'ENDPROG'
        ;

decl	: (declaravar)+
		;
		
declaravar : tipo ID {
				_varName = _input.LT(-1).getText();
				_varValue = null;
				simbolo = new taskVariavel(_varName, _tipo, _varValue);
				
					if (!tabelaSimbolo.exists(_varName)){
						tabelaSimbolo.add(simbolo);
					}else{
						throw new ExcecaoSemantica("Simbolo " + _varName + " ja foi declarado");
					}
				
				}
				
			 ( VIR 
			   ID  {
				_varName = _input.LT(-1).getText();
				_varValue = null;
				simbolo = new taskVariavel(_varName, _tipo, _varValue);
				
					if (!tabelaSimbolo.exists(_varName)){
						tabelaSimbolo.add(simbolo);
					}else{
						throw new ExcecaoSemantica("Simbolo " + _varName + " ja foi declarado");
					}
				
				}
				
			 )* PV
		   ;
		   
tipo	: 'Number' {_tipo = taskVariavel.NUMBER; }
		| 'Text'	{_tipo = taskVariavel.TEXT; }
		;

bloco   : (cmd)+
        ;

cmd     : cmdleitura 
		| cmdescrita 
		| cmdattrib 
        ;

cmdleitura  : 'Read' AP 
					 ID { verificaID(_input.LT(-1).getText());}
					 FP 
					 PV
        ;

cmdescrita  : 'Write' AP 
						ID { verificaID(_input.LT(-1).getText());}
						FP 
						PV
        ;

cmdattrib   : ID { verificaID(_input.LT(-1).getText());}
			  ATTR 
			  expr 
			  PV
        ;

expr    : termo (OP termo)*
        ;

termo : ID { verificaID(_input.LT(-1).getText());}
	  | NUMBER
        ;

AP  : '('
    ;

FP  : ')'
    ;

PV  : ';'
    ;

OP  : '+' | '-' | '*' | '/'
    ;

ATTR    : '='
    ;
    
VIR	: ','
	;

ID  : [a-z] ([a-z] | ([A-Z]) | [0-9])*
    ;

NUMBER  : [0-9]+ ('.' [0-9]+)?
    ;
    
WS : (' ' | '\t' | '\n' | '\r') -> skip;