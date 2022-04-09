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

   EscrevaL("IMC: ", imc:5:2)
   
   Se (imc < 17) entao
      EscrevaL ("Muito abaixo do peso")
   senao
      Se (imc >= 17) e (imc <= 18.5) entao
         Escreva ("Abaixo do peso")
      Senao
           Se (imc >= 18.5) e (imc < 25) entao
              Escreva("Peso ideal")
           Senao
                Se(imc >= 25) e (imc < 30) entao
                       Escreva("Sobrepeso")
                Senao
                     Se (imc >= 30) e (imc < 35) entao
                        Escreva("Obesidade")
                     Senao
                          Se (imc >= 35) e (imc < 40) entao
                             Escreva ("Obesidade Severa")
                             Senao
                                  Escreva("Obesidade Mórbida")
                          FimSe
                     FimSe
                FimSe
                 
           FimSe
      FimSe

   FimSe
Fimalgoritmo