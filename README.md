**Hello World Example - detalhamento do processo de integração contínua (CI)**

Fluxo de Trabalho:

1. Cada vez que um push develop -> main for feito, o pipeline será disparado automaticamente
2. O pipeline irá clonar a versão mais recente do código, para ter certeza de que está trabalhando com a versão mais atual
3. Após, o ambiente será preparado considerando as dependências configuradas
4. O código-fonte será então compilado usando o Maven (por meio de mvn clean install), a fim de verificar que não haja erros de compilação/sintaxe
5. Por meio do Checkstyle, será verificada a existência de violação de estilo no código - havendo problemas, erros serão reportados. Exemplo de reports:

_[INFO] --- checkstyle:3.0.0:check (default-cli) @ hello-world-example ---
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS_

6. Testes unitários serão executados, com o posterior fornecimento (por meio do Surefire plugin) de relatório detalhado dos resultados: https://github.com/rfanti/hello-world-example/actions/runs/11392978665/job/31700269084
7. Tendo sucesso em todos os tests, o pipeline é marcado como bem-sucedido; havendo erro, exibe como falha e notifica o usuário a fim de que possa ser feita a correção para posterior integração à produção.

Diagrama: https://lucid.app/lucidchart/cdd8f304-9db7-4daf-af25-7d22f1d293ea/edit?viewport_loc=-94%2C-261%2C2048%2C1047%2C0_0&invitationId=inv_c9066486-a728-41ff-b6c2-a3f5e9c74d43

