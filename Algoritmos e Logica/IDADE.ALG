Algoritmo "idade"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/04/2022
Var
// Seção de Declarações das variáveis 
         ano_atual: inteiro
         ano_nasc: inteiro
         idade: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
           Escreval("Em que ano nós estamos?")
           Leia(ano_atual)
           Escreval("Em que ano eu nasci?")
           Leia(ano_nasc)
           idade <- ano_atual - ano_nasc
           Escreval("Minha idade é" , idade, " anos")

Fimalgoritmo