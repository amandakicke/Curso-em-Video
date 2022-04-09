Algoritmo "Dependentes"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/04/2022
Var
// Seção de Declarações das variáveis 
   Nome: Caractere
   Sal, NSal : Real
   Dep: Inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
         EscrevaL ("Qual o nome do Funcionário? ")
         Leia(Nome)
         EscrevaL ("Qual o salário do Funcionário? R4 ")
         Leia (Sal)
         EscrevaL ("Qual é a quantidade de dependentes? ")
         Leia (Dep)
         
         Escolha   Dep
                   Caso 0
                        NSal <- Sal + (Sal*5/100)
                   Caso 1, 2, 3
                        NSal <- Sal + (Sal*10/100)
                   Caso 4, 5, 6
                        NSal <- Sal + (Sal*15/100)
                   OutroCaso
                        NSal <- Sal + (Sal*18/100)
         FimEscolha
         
         EscrevaL ("O novo salário será de R$ ", NSal:8:2)
Fimalgoritmo