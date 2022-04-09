Algoritmo "somadorNumerico"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/04/2022
Var
// Seção de Declarações das variáveis 
     cont, N, S, maior: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
      cont <- 1
      S <- 0
      Enquanto (cont <= 5) faca
         Escreva("Digite o ", cont, " º valor: ")
         Leia(N)
         Se (N > maior) entao
            S <- S + N
            cont <- cont + 1
            FimSe
      FimEnquanto

      EscrevaL("A soma de todos os valores foi ", S)
      EscrevaL("A média de todos os valores é ", S/5)
      EscrevaL("O maior número é: ", maior)

Fimalgoritmo