algoritmo "CalculaMediaConceito"
var
    Nome: Caractere
    N1, N2, N3, N4, media: real
    Conceito: Caractere
inicio
        EscrevaL("-------------------------")
        EscrevaL("-----ESCOLA ESTADUAL-----")
        EscrevaL("-------------------------")
        EscrevaL("Qual o nome do aluno? ")
        Leia(Nome)
        EscrevaL("Qual a nota da primeira prova? ")
        Leia(N1)
        EscrevaL("Qual a nota da segunda prova? ")
        Leia(N2)
        EscrevaL("Qual a nota da terceira prova? ")
        Leia(N3)
        EscrevaL("Qual a nota da quarta prova? ")
        Leia(N4)
        
        EscrevaL("-------------------------")
        
        media <- (N1 + N2 + N3 + N4)/4
        
        EscrevaL("SUA MÉDIA FINAL É ", media)
        EscrevaL("-------------------------")
        
        Se media > 9 entao
           Escreval("CONCEITO FINAL: A - PARABÉNS")
           Senao
           Se  (media > 8) e (media <= 9) entao
               EscrevaL("CONCEITO FINAL: B")
               Senao
                 Se  (media > 7) e (media <= 8) entao
                     EscrevaL("CONCEITO FINAL: C")
                     Senao
                    Se  (media > 6) e (media <= 7) entao
                        EscrevaL("CONCEITO FINAL: D")
                            Senao
                                 EscrevaL("CONCEITO FINAL: E - REPROVADO!")
                    FimSe
                 FimSe
           FimSe
        FimSe
        
        EscrevaL("-------------------------")

fimalgoritmo