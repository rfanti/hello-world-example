**Hello World Example - detalhamento do processo de integração contínua (CI)**

Fluxo de Trabalho:

1. Cada vez que um commit e push for feito em qualquer branch, o pipeline será disparado automaticamente
2. O pipeline irá clonar a versão mais recente do código, para ter certeza de que está trabalhando com a versão mais atual
3. Após, o ambiente será preparado considerando as dependências configuradas
4. O código-fonte será então compilado usando o Maven (por meio de mvn clean install), a fim de verificar que não haja erros de compilação/sintaxe
5. Testes unitários serão executados, com o posterior fornecimento (por meio do Surefire plugin) de relatório detalhado dos resultados
6. Tendo sucesso em todos os tests, o pipeline é marcado como bem-sucedido; havendo erro, exibe como falha e notifica o usuário a fim de que possa ser feita a correção para posterior integração à produção.


