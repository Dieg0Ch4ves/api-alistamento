# API de Alistamento Militar
### Esta API foi desenvolvida usando o framework Spring, o JPA (Java Persistence API), o Hibernate como provedor JPA e o MySQL como banco de dados relacional. Ela fornece um sistema de alistamento militar que permite que indivíduos com idades entre 18 e 19 anos se cadastrem e salvem suas informações no banco de dados.

#### Requisitos
* Java
* Spring Boot
* MySQL
* Maven

Certifique-se de ter todas as ferramentas e dependências instaladas antes de iniciar a aplicação.

### Configuração do Banco de Dados
Crie um banco de dados MySQL chamado alistamento.

Edite o arquivo src/main/resources/application.properties para configurar as credenciais do banco de dados:

spring.datasource.url=jdbc:mysql://localhost:3306/alistamento
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha

* Substitua seu-usuario e sua-senha pelas credenciais do seu banco de dados.

### A estrutura da tabela necessária será criada automaticamente pelo Hibernate com base nas entidades da aplicação. Certifique-se de que o MySQL esteja em execução quando iniciar a aplicação.


## Contribuição
### Se você deseja contribuir para o desenvolvimento desta API, sinta-se à vontade para fazer um fork do repositório e enviar um pull request.

***
