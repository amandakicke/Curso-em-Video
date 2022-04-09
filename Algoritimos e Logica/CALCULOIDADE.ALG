Algoritmo "CalculoIdade"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/04/2022
Var
// Seção de Declarações das variáveis 
      ano, ano_nasc, idade: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
       Escreva("Que ano você quer calcular? ")
         Leia(ano)
       Escreva("Em que ano você nasceu? ")
         Leia(ano_nasc)
         
         idade <- ano - ano_nasc
         
       Escreval("Em ", ano, " você terá ", idade, " anos")
         
         Se (idade >=18) então
            Escreval("E já terá atingido a maioridade")
         Senao
              Escreva("Mas ainda será menor de idade")
         FimSe

Fimalgoritmo