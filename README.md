# Aplicação do SOLID no Projeto Olimpíada

## S - Single Responsibility (Responsabilidade Única)
- Extrai a responsabilidade do armazenamento de dados para classes específicas, garantindo que a classe `App.java` não gerencie o salvamento e a busca dos dados.

## L - Liskov Substitution Principle (Substituição de Liskov)
- Classe `Questao` agora é abstrata e contem apenas o que é comum a todas.
- Subclasses `QuestaoObjetiva` e `QuestaoXadrez` criadas para adição de lógicas específicas.

# I - Interface Segregation Principle (Segregação de Interfaces)
- Atributo `fenInicial` estava dentro da classe `Questao`, obrigando a carga de dados e comportamento de xadrez que nem todas as questões utilizam. Atributo movido para nova classe `QuestaoXadrez`, assim a classe não depende de métodos que não irá utilizar


## D - Dependency Inversion (Inversão de Dependência)
- Cria interfaces abstratas para os repositorios `Participante`, `Prova`, `Questao` e `Tentativa`.
- Altera a classe App para depender apenas das interfaces, desacoplando-a da implementacao concreta.