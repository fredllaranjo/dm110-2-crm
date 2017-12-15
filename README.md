# dm110
2º Exercício - Desenvolvimento JavaEE - DM110 - PÓS-GRADUAÇÃO EM DESENVOLVIMENTO DE APLICAÇÕES PARA DISPOSITIVOS MÓVEIS E CLOUD COMPUTING

## Detalhes da interface REST:

### Retornar clientes:

* URL: /crm/rest/client/
* Método: GET
* Resposta: JSON com a lista dos clientes encontrados ( `[ {"id": "1", "nome": "fred", "email": "fred@email.com"},{"id": "41", "nome": "mecva", "email": "mecva@email.com"} ]` ).

### Criar cliente:

* URL: /crm/rest/client/
* Método: POST
* Body: `{"nome": "fred", "email": "fred@email.com"}`
* Resposta: JSON com o cliente criado ( `{"id": "1", "nome": "fred", "email": "fred@email.com"}` ).
