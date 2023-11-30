# Ada_Projects
## Jogo da Velha
- Projeto desenvolvido em Java, utilizando alguns conceitos básicos de POO.
- O Jogo da Velha é um jogo para dois jogadores e que deve ser jogado sobre um tabuleiro de 3x3 casas. Um dos jogadores escolhe uma casa e a marca com um círculo. Em seguida o outro escolhe outra casa e a marca com um xis. Os jogadores continuam se alternando desta forma, até que uma linha com os mesmos símbolos seja formada, na vertical, horizontal ou diagonal. No caso, o jogador que completou a linha, vence o jogo. O jogo também acaba se não houver mais jogadas possíveis, o que caracteriza um empate.
Durante a execução do programa, cada jogador deve escrever sua jogada (coordenadas) na linha de comando, e o jogo deve imprimir o tabuleiro e esperar pela jogada do próximo jogador. O programa não deve permitir que o jogador tente marcar uma casa que já esteja marcada, nem que tente jogar em casas que não existam. A classe que encapsula a lógica do jogo deve conter métodos para testar se uma dada jogada é válida, que devem ser chamados antes de efetuar a jogada de fato. Ou pode-se fazer este tratamento de erro com exceções.

## Cálculo de Salário
- Projeto desenvolvido em Java, utilizando alguns conceitos básicos de POO.
- O seguinte programa recebe é responsável por receber 5 salários brutos de funcionários, sabendo-se que são descontados Imposto de Renda e INSS e calcular o salário o respectivo funcionário no referido mês.
- Ao final como saída o programa fornece as seguintes informações que foram utilizadas para calcular o salário líquido do funcionário:
<ul>
  <li><span>Salário Bruto;</span></li>
  <li><span>Porcentagem paga ao INSS;</span></li>
  <li><span>Total pago de Imposto de Renda;</span></li>
  <li><span>Salário Líquido.</span></li>
</ul>

- Os descontos e o salário líquido de cada funcionário é calculado com base nas tabelas abaixo: 

| Salário | % Desconto INSS | |-----------------------------|-----------------| | até 1.212,00 | 7,5% | | de 1212,01 até 2.427,35 | 9% | | de 2.427,36 até 3.641,03 | 12% | | de 3.641,04 até 7.087,22 | 14% |

| Salário | % Desconto Imposto de Renda | |-----------------------------|-----------------------------| | até 1.903,98 | 0% | | de 1.903,99 até 2.826,65 | 7,5% | | de 2.826,66 até 3.751,05 | 15% | | de 3.751,06 até 4.664,68 | 22,50% | | Acima de 4.664,68 | 27,50% |
