
# Java maven
-----------
links úteis:<br>
https://www.baeldung.com/maven-compiler-plugin <br>
https://mkyong.com/maven/how-to-run-unit-test-with-maven/ <br>
http://tutorials.jenkov.com/maven/maven-commands.html <br>


Maven é uma ferramenta de gerenciamento de construção de software para projetos baseados em Java. Ele fornece um meio fácil de definir, gerenciar e construir projetos, bem como gerenciar suas dependências. Com o Maven, você pode gerenciar automaticamente os artefatos do seu projeto (bibliotecas, frameworks, etc.), além de gerar documentação, compilar, testar, empacotar e implantar seu software em diferentes ambientes.
O Maven usa um arquivo de configuração chamado "pom.xml" (Project Object Model) para descrever as características do projeto, suas dependências e como o software deve ser construído. Ele usa convenções padronizadas para gerenciar o ciclo de vida do projeto e simplificar a construção de software. O Maven é amplamente utilizado na comunidade Java e é uma ferramenta essencial para desenvolvedores Java.

## Principais comandos de terminal
### Como iniciar um projeto maven pelo terminal:
Para criar um novo projeto Maven usando o terminal, você pode seguir os seguintes passos:

1. Certifique-se de que o Maven esteja instalado no seu sistema e o comando "mvn" esteja disponível no terminal. Você pode verificar isso executando o comando "mvn -version" no terminal.

2. Navegue até o diretório onde deseja criar o projeto e execute o seguinte comando para criar um novo projeto Maven:
```
mvn archetype:generate -DgroupId=com.example -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
3. Depois que o comando for executado, você verá o Maven baixando os artefatos necessários e criando a estrutura básica do projeto. Isso pode levar alguns minutos, dependendo da velocidade da sua conexão com a Internet.

4. Depois que o projeto for criado com sucesso, você pode navegar até o diretório do projeto e verificar se os arquivos e pastas foram criados.

5. Com o projeto criado, temos esses principais códigos que usaremos bastante:

| Comando mvn |                Função               |
|-------------|:-----------------------------------:|
| mvn compile | Cria os .class do projeto (compila) |
| mvn test    | Executa todos os test encontrados   |
| mvn package | Cria o .jar da aplicação            |

> Dependendo da IDE que esteja usando, estes comando não precisam ser executados pelo terminal, a grande maioria já tem atalhos e botões prontos.
