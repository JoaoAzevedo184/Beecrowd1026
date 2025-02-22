# **Documentação: Carrega ou não Carrega?**

Este desafio descreve um problema relacionado à implementação de um somador de 32 bits em um contexto de Eletrônica Digital, onde o personagem Mofiz comete um erro específico ao projetar o circuito. Vou ajudar a documentar o texto de forma clara e organizada, destacando os pontos principais e a lógica por trás do problema.


---
## **Tecnologias**
+ Java

## **Contexto**
O desafio narra a história de Mofiz, um estudante de Eletrônica Digital, que enfrenta dificuldades ao implementar um somador de 32 bits como parte de um exame de laboratório. Ele comete um erro no projeto, resultando em um comportamento inesperado na soma de números binários. Após identificar o erro, ele recebe uma segunda chance para corrigir o problema, mas dessa vez, deve implementar um programa que simule o comportamento do circuito defeituoso.

---

### **Problema Encontrado**
Mofiz projetou um somador de 32 bits, mas o circuito apresentou um erro: o **carry (carregador de bit)** sempre retornava zero. Isso significa que, ao somar dois números binários, o "vai um" (carry) não era considerado, resultando em uma soma incorreta. O exemplo abaixo ilustra o problema:

- **Entrada (decimal):** 4 + 6
- **Representação binária:**
    - 4 = `00000000 00000000 00000000 00000100`
    - 6 = `00000000 00000000 00000000 00000110`
- **Soma esperada (decimal):** 10
- **Soma obtida (devido ao erro):** 2 = `00000000 00000000 00000000 00000010`

O erro ocorre porque o circuito não considera o carregador de bit (carry), resultando em uma soma bit a bit sem o "vai um".

---

### **Solução Proposta**
O instrutor de Mofiz oferece uma segunda chance, solicitando que ele implemente um programa que simule o comportamento do circuito defeituoso. O programa deve:

1. **Entrada:** Receber dois números decimais de 32 bits sem sinal, separados por um espaço.
2. **Processamento:** Realizar a soma bit a bit, sem considerar o carry (ou seja, simular o erro do circuito).
3. **Saída:** Retornar o resultado da soma no modo "Mofiz".

---

#### **Exemplos de Entrada e Saída**
A tabela abaixo ilustra exemplos de entradas e saídas esperadas:

| Entrada | Saída |
|---------|-------|
| 4 6     | 2     |
| 6 9     | 15    |

**Explicação:**
- **4 + 6:**
    - Soma binária sem carry: `0100 + 0110 = 0010` (2 em decimal).
- **6 + 9:**
    - Soma binária sem carry: `0110 + 1001 = 1111` (15 em decimal).

---

#### **Implementação do Programa**
O programa deve seguir as seguintes etapas:

1. Ler dois números inteiros de 32 bits sem sinal.
2. Realizar a operação de soma bit a bit, ignorando o carry.
3. Exibir o resultado.

Em linguagens de programação, isso pode ser implementado usando a operação **XOR** (ou exclusivo), que realiza a soma bit a bit sem considerar o carry.