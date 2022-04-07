Algoritmo "triangulos"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/04/2022
Var
// Seção de Declarações das variáveis 
        l1, l2, l3: Real
        EQ, ES, TRI: Logico //equilátero, escaleno

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
        Escreva("Digite o primeiro lado: ")
        Leia(l1)
        Escreva("Digite o segundo lado: ")
        Leia(l2)
        Escreva("Digite o terceiro lado: ")
        Leia(l3)
        
        TRI <- (l1 < l2 + l3) e (l2 < l1 + l3) e (l3 < l1 + l2)
        EQ <- (l1 = l2) e (l2 = l3)
        ES <- (l1 <> l2) e (l2 <> l3) e (l1 <> l3)
        
        Escreval("Pode formar um triângulo? ", TRI)
        Escreval("O triângulo é EQUILÁTERO? ", EQ)
        Escreval("O triângulo é ESCALENO? ", ES)

Fimalgoritmo