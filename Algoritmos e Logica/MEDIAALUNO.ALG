algoritmo "MediaAluno"
var
     n1, n2, M: real
     
inicio
          Escreva("Primeira Nota: ")
          Leia(n1)
          Escreva("Segunda Nota: ")
          Leia(n2)
          M <-(n1 + n2) / 2
          
          Escreval("A média do aluno foi ", M:4:2)
          
      Se (M >=7) entao
         Escreval("ALUNO APROVADO!!!")
      senao
          Se (M >= 5) e (M < 7 ) entao
             Escreval ("ALUNO EM RECUPERAÇÃO!")
          senao
               Escreval("ALUNO REPROVADO!")
          FimSe
      FimSe
fimalgoritmo