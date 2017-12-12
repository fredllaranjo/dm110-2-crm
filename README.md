# dm110
2º Exercício - Desenvolvimento JavaEE - DM110 - PÓS-GRADUAÇÃO EM DESENVOLVIMENTO DE APLICAÇÕES PARA DISPOSITIVOS MÓVEIS E CLOUD COMPUTING

## Detalhes da interface REST:

### Retornar clientes:

* URL: /crm/rest/client/
* Método: GET
* Parâmetros:
  * `name` (parâmetro de query) (opcional)
  * `email` (parâmetro de query) (opcional)
  * `id` (parâmetro de query) (opcional)
* Resposta: JSON com a lista dos clientes encontrados ( `[ {"id": "1", "name": "fred", "email": "fred@email.com"},{"id": "41", "name": "mecva", "email": "mecva@email.com"} ]` ).

### Criar cliente:

* URL: /crm/rest/client/
* Método: POST
* Body: `{"name": "fred", "email": "fred@email.com"}`
* Resposta: JSON com o cliente criado ( `{"id": "1", "name": "fred", "email": "fred@email.com"}` ).
