# dm110
2� Exerc�cio - Desenvolvimento JavaEE - DM110 - P�S-GRADUA��O EM DESENVOLVIMENTO DE APLICA��ES PARA DISPOSITIVOS M�VEIS E CLOUD COMPUTING

## Detalhes da interface REST:

### Retornar clientes:

* URL: /crm/rest/client/
* M�todo: GET
* Resposta: JSON com a lista dos clientes encontrados ( `[ {"id": "1", "nome": "fred", "email": "fred@email.com"},{"id": "41", "nome": "mecva", "email": "mecva@email.com"} ]` ).

### Criar cliente:

* URL: /crm/rest/client/
* M�todo: POST
* Body: `{"nome": "fred", "email": "fred@email.com"}`
* Resposta: JSON com o cliente criado ( `{"id": "1", "nome": "fred", "email": "fred@email.com"}` ).
