package conteudo;

public class Operadores {
	
	public static void main(String[] args) {
		
		System.out.println("********************************");
		System.out.println("**** Operadores aritméticos ****");
		System.out.println("********************************\n");
		
		int a = 1 + 1;      //o valor de a será 2
		System.out.println("int a = 1 + 1; ==> a = "+a);
		
		a = a - 1;          //o valor de a será 1
		System.out.println("int a = a - 1; ==> a = "+a);
		
		a = a * 10;         //o valor de a será 10
		System.out.println("int a = a * 10; ==> a = "+a);
		
		a = a / 2;          //o valor de a será 5
		System.out.println("int a = a / 2; ==> a = "+a);
		
		a = a / 2;          //o valor de a será 2 (o inteiro armazena apenas a parte inteira, desprezando a decimal
		System.out.println("int a = a / 2; ==> a = "+a);

		int resto = 10 % 3; //o valor de resto será 1
		System.out.println("int resto = 10 % 3; ==> resto = "+resto);
		
		System.out.println("\n\n********************************");
		System.out.println("****** Operadores unários ******");
		System.out.println("********************************\n");
		
		a = 10;  
		System.out.println("a = 10;");

		//primeiro examinemos os pós-fixados
		int b = a++;          //a é atribuído para b (10), e depois a é incrementado (11)
		System.out.println("int b = a++;");
		System.out.println("b = "+b+"; a = "+a);
		
		int c = a--;          //a é atribuído para c (11), e depois a é dencrementado (10)
		System.out.println("int c = a--;");
		System.out.println("c = "+c+"; a = "+a);

		//depois examinemos os pré-fixados
		int d = ++a;          //a é incrementado (11), e depois a é atribuído para d (11)
		System.out.println("int d = ++a;");
		System.out.println("d = "+d+"; a = "+a);
		
		int e = --a;          //a é decrementado (10), e depois a é atribuído para d (10)
		System.out.println("int e = --a;");
		System.out.println("e = "+e+"; a = "+a);

		//booleano
		boolean f = true;
		System.out.println("\nboolean f = true;");
		
		f = !f;               //inverti o valor de f para false
		System.out.println("f = !f; ==> f = "+f);
		
		f = !true;            //mantive o valor de f em false
		System.out.println("f = !true; ==> f = "+f);
		
		f = !false;           //alterei o valor de f para true
		System.out.println("f = !false; ==> f = "+f);
		
		System.out.println("\n\n********************************");
		System.out.println("*** Operadores de Comparação ***");
		System.out.println("********************************\n");
		
		a = 10;
		b = 15;
		c = 5;
		d = 10;
		
		System.out.println("int a = 10, b = 15, c = 5, d = 10;");

		boolean res1 = a > b;     //res1 é false
		System.out.println("boolean res1 = a > b; ==> res1 = "+res1);
		
		res1 = a >= b;            //res1 é false
		System.out.println("boolean res1 = a >= b; ==> res1 = "+res1);
		
		res1 = a < b;             //res1 é true
		System.out.println("boolean res1 = a < b; ==> res1 = "+res1);
		
		res1 = a <= b;            //res1 é true
		System.out.println("boolean res1 = a <= b; ==> res1 = "+res1);

		boolean res2 = a > c;     //res2 é true
		System.out.println("boolean res2 = a > c; ==> res2 = "+res2);
		
		res2 = a >= c;            //res2 é true
		System.out.println("boolean res2 = a >= c; ==> res2 = "+res2);
		
		res2 = a < c;             //res2 é false
		System.out.println("boolean res2 = a < c; ==> res2 = "+res2);
		
		res2 = a <= c;            //res2 é false
		System.out.println("boolean res2 = a <= c; ==> res2 = "+res2);

		boolean res3 = a > d;     //res3 é false
		System.out.println("boolean res3 = a > d; ==> res3 = "+res3);
		
		res3 = a >= d;            //res3 é true
		System.out.println("boolean res3 = a >= d; ==> res3 = "+res3);
		
		res3 = a < d;             //res3 é false
		System.out.println("boolean res3 = a < d; ==> res3 = "+res3);
		
		res3 = a <= d;            //res3 é true
		System.out.println("boolean res3 = a <= d; ==> res3 = "+res3);
		
		System.out.println("\n\n********************************");
		System.out.println("*** Operadores de Igualdade ***");
		System.out.println("********************************\n");
		
		boolean res4 = a==5;      //res4 é false
		System.out.println("boolean res4 = a==5; ==> res4 = "+res4);
		
		res4 = a==10;             //res4 é true
		System.out.println("res4 = a==10; ==> res4 = "+res4);

	}

}
