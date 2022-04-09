Algoritmo "emprestimo"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/04/2022
Var
// Seção de Declarações das variáveis 
      emprestimo, parcelas, total, valor_parcela: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
        Escreva("Quanto você quer emprestado? R$ ")
        Leia(emprestimo)
        Escreva("Em quantas parcelas? ")
        Leia(parcelas)
        
        total <- emprestimo + (emprestimo * 20)/100
        valor_parcela <- total/parcelas
        
        Escreva("O valor total a pagar pelo emprestimo de R$ ", emprestimo, " será de R$ ", total:7:2," dividido em ", parcelas , " parcelas, pagando R$ ", valor_parcela:7:2, " em cada parcela")
        

Fimalgoritmo