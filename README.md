<div align="center"> <h1>Criptografia de César – Java</h1> </div>

<br>

Este projeto implementa a clássica Cifra de César, um dos métodos de criptografia mais antigos e simples. O programa permite criptografar e descriptografar mensagens deslocando as letras do alfabeto conforme uma chave numérica definida pelo usuário.

A aplicação é executada no terminal e oferece um pequeno menu com opções de uso.
<br>
<h2>📌 O que é a Cifra de César?</h2>


A Cifra de César é um algoritmo de substituição no qual cada letra do texto é trocada por outra localizada um número fixo de posições à frente no alfabeto.
Exemplo: com chave 3

A → D

B → E

C → F

Ela é chamada assim porque foi usada por Júlio César para enviar mensagens militares secretas.

<h2>📂 Funcionalidades </h2>

O programa implementa:
<ul>
<li> Criptografar uma mensagem usando um valor de deslocamento (chave)</li>
<li> Descriptografar uma mensagem usando a mesma chave </li>
<li> Testar automaticamente todos os 25 deslocamentos para tentar descobrir a chave (opcional, se implementado)</li>
<li> Interface de menu no terminal </li>
<li> Aceita textos completos, incluindo espaços e letras minúsculas/maiúsculas </li>
</ul>


<h2>🧩 Como funciona</h2>

<h3>O sistema solicita ao usuário:</h3>

Digite o texto

**Escolha uma opção:**

1 → Criptografar

2 → Descriptografar

3 → Testar todas as chaves (brute force), se implementado

Caso criptografe ou descriptografe, o usuário deve informar a chave (1 a 25)

**A saída exibirá:**

Texto original

Texto criptografado ou descriptografado

Chave utilizada

Resultado final no terminal

<h2>🛠️ Tecnologias utilizadas</h2>

Java 8+

Scanner para entrada de dados

Lógica de deslocamento no alfabeto (ASCII / tabela Unicode)
