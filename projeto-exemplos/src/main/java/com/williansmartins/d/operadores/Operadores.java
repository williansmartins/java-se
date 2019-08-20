package com.williansmartins.d.operadores;

public class Operadores {

//	Tipo de Operador	Lista de Operadores
//	Sufixais	expr++ expr--
//	Prefixais	++expr --expr +expr -expr ~ !
//	Multiplicativos	* / %
//	Aditivos	+ -
//	Shift Binário	<< >> >>>
//	Comparativos	< > <= >= instanceof
//	igualdade	== !=
//	Bit-aBit E	&
//	Bit-aBit XOU OR	^
//	Bit-aBit OU OR	|
//	Lógico E	&&
//	Lógico OU	||
//	Ternário	? :
//	Atribuição	= += -= *= /= %= &= ^= |= <<= >>= >>>=

	public static void main(String[] args) {
		// sufixais (precedência: 13)
		int numero = 5; // A variável número é inicializada com 5.
		System.out.println(numero++); // É exibido 5, o valor original, e então a variável é atualizada para 6.
		System.out.println(numero); // É exibido 6, valor incrementado na instrução anterior.

		// prefixais (precedência: 12)
		int numeroB = 5; // numero contém 5
		boolean ligado = false; // ligado contém "falso"
		++numeroB; // numero agora vale 6
		--numeroB; // numero passa a valer 5
		numeroB = +numeroB; // numero continua valendo 5
		numeroB = -numeroB; // numero passa a valer -5
		numeroB = ~numeroB; // numero passa a valer 6
		ligado = !ligado; // ligado passa a representar o valor "true"

		// multiplicativos (precedência: 11)
		int numeroC = 5; // numero passa a valer 5
		numeroC = numeroC * 4; // numero assume o valor 20
		numeroC = 200 / numeroC; // numero assume o valor 10
		numeroC = 5 % 12; // numero assume o valor 5

		// aditivos (precedência: 10)
		int numeroD = 5; // numero passa a valer 5
		numeroD = numeroD + 8; // numero passa a valer 13
		numeroD = numeroD - numeroD; // numero passa a valer zero
		String x = "Alo"; // x é inicializado com a string "Alo"
		String y = "Mundo!"; // y é inicializado com a string "Mundo!"
		x = x + ", " + y; // x passa a valer "Alo, Mundo!"

		// shift (precedência: 9)
		int numeroE = -3; // numero vale -3
		numeroE = numeroE >> 1; // numero vale -2
		numeroE = numeroE << 1; // numero vale -4
		numeroE = numeroE >>> 1; // numero vale 2147483646

		// comparativos (precedência: 8)
		boolean variavel;
		variavel = (4 < 4); // variavel recebe "falso"
		variavel = (4 <= 4); // variavel recebe "verdadeiro"
		variavel = (-1 > -3); // variavel recebe "verdadeiro"
		variavel = (-4 >= 0); // variavel recebe "falso"

		// igualdade (precedência: 7)
		boolean variavelB;
		variavelB = (-5 == 5); // variavel recebe "falso"
		variavelB = (2 != 45674); // variavel recebe "verdadeiro"

		// bit (precedência: 4, 5 e 6)
		int numeroF;
		numeroF = 34 & 435; // numero passa a valer 34
		numeroF = 34 ^ 46; // numero passa a valer 12
		numeroF = 436 | 547; // numero passa a valer 951

		// and / or (precedência: 2 e 3)
		boolean variavelC;
		variavelC = (2 < 45) && (45 < 2); // variavel passa a valer "falso"
		variavelC = (2 < 45) || (45 < 2); // variavel passa a valer "verdadeiro"

		// ternarios (precedência: 1)
		int numeroG = 245;
		int numeroH = 123;
		numeroG = (numeroG > numeroH) ? numeroG
				: numeroH; /*
							 * Faz com que a variavel numero 1 receba sempreo maior valor entre ela mesma e
							 * a numero2. Neste caso, ela receberá o seu prório valor por ele ser maior
							 */

		// atribuições (precedência: 0)
		int numeroI = 3; // numero recebe o valor 3
		numeroI += 7; // numero recebe 3+7. Ou seja, 10.
		numeroI -= 32; // numero recebe o seu valor menos 32. Ou seja, -22.
		numeroI %= -3; // numero recebe o resto da divisão entre seu valor e -3. Ou seja, -1.
		numeroI *= 6; // numero recebe o seu valor vezes 6. Ou seja, -6.
		numeroI /= 2; // numero recebe o seu valor dividido por 2. Ou seja, -3.

	}

}