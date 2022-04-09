Algoritmo "CalculoIMC"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/04/2022
Var
// Seção de Declarações das variáveis 

       P, H, imc: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
         Escreva("Qual o seu peso em quilos? ")
         Leia(P)
         Escreva("Qual a sua altura em metros? ")
         Leia(H)
         
         imc <-  P/H^2
         
         Se (imc >= 18)e (imc <= 25) entao
            Escreva("Seu IMC é ", imc:5:2, ", e você está no seu peso ideal!")
            senao se
            Escreva("Seu IMC é ", imc:5:2, ", você não está no seu peso ideal!")
            FimSe


Fimalgoritmo