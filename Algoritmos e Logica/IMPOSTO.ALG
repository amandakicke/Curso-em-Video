Algoritmo "imposto"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/04/2022
Var
// Seção de Declarações das variáveis 
          Imposto, valor_produtos: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
           Escreva("Qual o valor total das suas compras? R$ ")
           Leia(valor_produtos)

           imposto <-(valor_produtos * 60)/100
           
           Escreva("O valor do imposto devido é R$ ", imposto:5:2)

Fimalgoritmo