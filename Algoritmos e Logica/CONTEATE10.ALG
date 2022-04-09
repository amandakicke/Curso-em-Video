algoritmo "conteAte10"
var
     contador, contador2, valor, quanto: inteiro
inicio
      EscrevaL("Contagem crescente:")

      contador <- 0
      Escreva("Quer contar até quanto? ")
      Leia(valor)
      Escreva("Quer contar de quanto em quanto? ")
      Leia(quanto)
      Enquanto (contador <= valor) faca
               EscrevaL(contador)
               contador <- contador + quanto
      FimEnquanto
      
      EscrevaL("Contagem decrescente:")
      
      contador2 <- valor
      Enquanto (contador >= 0) faca
               EscrevaL(contador)
               contador <- contador - quanto
      FimEnquanto
fimalgoritmo