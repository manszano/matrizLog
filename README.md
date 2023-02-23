# Login em Java com armazenamento de registro em matrizes

Este é um projeto de login em Java com armazenamento de registro em matrizes. O projeto foi desenvolvido com o objetivo de demonstrar como implementar um sistema de login básico em Java usando matrizes para armazenar informações de registro de usuários e comparações para evitar que usuários com o mesmo nome sejam adcionados.
(Projeto realizado como PI do primeiro semestre da faculdade e foi inteiramente desenvolvido por mim.)

## Requisitos

Para executar este projeto, você precisará ter instalado em seu computador:

- Java Development Kit (JDK) 8 ou superior
- Eclipse IDE (ou qualquer outra IDE de sua escolha)
- Swing (para a interface do usuário)

## Como executar o projeto

1. Clone este repositório em sua máquina local ou faça o download do arquivo .zip e extraia-o em uma pasta de sua escolha.
2. Abra o Eclipse IDE e importe o projeto clicando em `File` > `Import` > `General` > `Existing Projects into Workspace`. Selecione a pasta onde você extraiu o projeto e clique em `Finish`.
3. Abra o arquivo `screen.java` localizado na pasta `src` > `projetojava`  do projeto.
4. Execute o arquivo `screen.java` clicando com o botão direito do mouse no arquivo e selecionando `Run As` > `Java Application`.
5. O programa abrirá a tela de login onde você poderá inserir suas informações de registro. As informações de registro são armazenadas em matrizes e validadas no login.

## Como usar o programa

1. Na tela de registro, insira suas informações de registro nos campos de texto.
2. Clique no botão "Registrar" para validar suas informações.
3. Se as informações forem válidas, o programa abrirá uma tela de sucesso. Caso contrário, uma mensagem de erro será exibida.
4. Depois é só fazer o login clicando na opção login e adcionando as informações de registro

## Interface do usuário

Este projeto utiliza a biblioteca Swing para criar a interface do usuário. A interface é simples e consiste em três telas: uma tela de login e uma tela principal e uma de registro.

## Armazenamento de registro de usuários em matrizes

As informações de registro de usuários são armazenadas em matrizes na classe `banc.java`. Cada usuário é representado por uma linha na matriz e as informações de registro são armazenadas em cada coluna. O armazenamento em matrizes é uma forma simples e eficiente de armazenar as informações de registro, mas pode ser substituído por um banco de dados ou outra forma de armazenamento, dependendo das necessidades do projeto.
