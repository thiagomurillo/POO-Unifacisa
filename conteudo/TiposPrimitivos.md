# Tipos Primitivos em Java

**Decimais**
Perceba que um bit é sempre usado para determinar se o número será negativo ou positivo.
Lembre que um byte tem 8 bits.

| Tipo  | Tamanho | Intervalo | Intuição |
| ------------------- | ------------------- | ------------------- | ------------------- |
| byte |  1 byte | -127 à 127 | Se um bit delimita se é positivo ou negativo, então nos resta 2^7 |
| short |  2 bytes | −32768 à 32767 | Se um bit delimita se é positivo ou negativo, então nos resta 2^15 |
| int |  4 bytes | 8.589.934.592 à 8.589.934.591 | Se um bit delimita se é positivo ou negativo, então nos resta 2^33 |
| long |  8 bytes| 9.223.372.036.854.775.808 à 9.223.372.036.854.775.807 | Se um bit delimita se é positivo ou negativo, então nos resta 2^63 |

</br>

Intuição geral para **ponto flutuante**: eles não têm uma acurácia perfeita como decimais, por essa razão eles conseguem representar um intervalo maior.

| Tipo  | Tamanho | Intervalo |
| ------------------- | ------------------- | ------------------- |
| float |  4 bytes | 2^(-149) à (2-2^(-23))·2^127 | 
| double |  8 bytes | 2^(-1074) à (2-2^(-52))·2^1023|

</br>

Se você precisar armazenar um caracter, como 'a', 'b', ..., 'z', você pode usar o tipo **char**. Ele é armazenado em 2 bytes.

</br>

Para valores lógicos booleanos, podemos usar a primitiva **boolean**. Apenas 1 bit é usado para um boolean.


