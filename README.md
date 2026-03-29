# Aplicação do SOLID no Projeto Olimpíada

## S - Single Responsibility (Responsabilidade Única)

- Extrai a responsabilidade do armazenamento de dados para classes específicas, garantindo que a classe `App.java` não gerencie o salvamento e a busca dos dados.


## D - Dependency Inversion (Inversão de Dependência)

- Cria interfaces abstratas para os repositorios `Participante`, `Prova`, `Questao` e `Tentativa`.
- Altera a classe App para depender apenas das interfaces, desacoplando-a da implementacao concreta.