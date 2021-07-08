programa
{
	
	funcao inicio()
	{
		real janeiro,fevereiro,marco,abril,media, total

		escreva("Informe o quanto você vendeu nesses 4 meses: \n \n")

		escreva("Venda de Janeiro: ")
		leia(janeiro)

		escreva("\n")

		escreva("Venda de Fevereiro: ")
		leia(fevereiro)

		escreva("\n")

		escreva("Venda de Março: ")
		leia(marco)

		escreva("\n")

		escreva("Venda de Abril: ")
		leia(abril)

		escreva("\n\n")

		media = (janeiro + fevereiro + marco + abril)/4
		escreva("A sua média de vendas foi: R$ " + media + "\n")

		total = janeiro + fevereiro + marco + abril
		escreva("O seu total de vendas foi: R$ " + total + "\n")

		escreva("\n\n")

		se (total >= 5000) {
			escreva(">>> Parabéns! Você receberá um abono de 10%. <<<\n")	
		} senao {
			escreva(">>> Você receberá um abono de 3%. <<<\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 351; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */