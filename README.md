**Hello World Example - detalhamento do processo de integração contínua (CI)**

Fluxo de Trabalho:

**Disparadores de Pipeline**

* A cada PULL REQUEST na branch main, o pipeline será disparado automaticamente. A execução é manual via workflow_dispatch

**Job: Build**

* O pipeline irá clonar a versão mais recente do código, para ter certeza de que está trabalhando com a versão mais atual
* JDK 17 será configurado
* Após, serão armazenadas em cache as dependências do Maven
* O código-fonte será então compilado usando o Maven (por meio de mvn clean install), a fim de verificar que não haja erros de compilação/sintaxe

**Job: Test**
* Repositório é clonado
* JDK 17 será configurado
* Checkstyle é executado (mvn checkstyle:check). Exemplo de reports:

_[INFO] --- checkstyle:3.0.0:check (default-cli) @ hello-world-example ---
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS_
* São executados os testes unitários (mvn clean test) e gerado relatório dos testes: https://github.com/rfanti/hello-world-example/actions/workflows/ci.yml
* São gerados os relatórios de testes (mvn surefire-report:report): tendo sucesso em todos os tests, o pipeline é marcado como bem-sucedido; havendo erro, exibe como falha e notifica o usuário a fim de que possa ser feita a correção para posterior integração à produção.
* Resultados dos testes são armazenados, sendo possível gerar relatório de cobertura de código (mvn jacoco:report)
* Ao final, o código é analisado pelo SonarCloud, recebendo uma "etiqueta" (badge) conforme a classificação do resultado:

<img width="952" alt="Screenshot 2024-10-21 at 20 44 10" src="https://github.com/user-attachments/assets/dbdc81b3-59b6-4db8-b6cc-faa7887661b7">

**Job: Package**

* Repositório é clonado
* JDK 17 será configurado
* O projeto será empacotado utilizado Maven (mvn package)
* Artefato JAR será armazenado

**Job: Deploy**

* Deploy para o ambiente de Staging (se a branch for develop)
* Deploy para o ambiente de Produção (se a branch for main)




Diagrama: https://lucid.app/lucidchart/cdd8f304-9db7-4daf-af25-7d22f1d293ea/edit?viewport_loc=-94%2C-261%2C2048%2C1047%2C0_0&invitationId=inv_c9066486-a728-41ff-b6c2-a3f5e9c74d43
 
