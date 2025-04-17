# 🛒 Easy Order API


Este projeto é uma API RESTful desenvolvida em Java com Spring Boot, que simula um sistema de compras de produtos. Ele possui um CRUD completo para usuários e pedidos, além de endpoints para consulta de produtos disponíveis. A API foi pensada para fins educacionais e demonstra conceitos importantes de desenvolvimento backend, como arquitetura em camadas, boas práticas REST, integração com banco de dados relacional e uso de ferramentas como Postman para testes.

O sistema é composto por três entidades principais: Usuários, Produtos e Pedidos, com relacionamentos entre elas. Cada usuário pode realizar diversos pedidos, e cada pedido pode conter um ou mais produtos.
## Tabela de conteúdos

- [Tecnologias](#tecnologias)  
- [Funcionalidades](#funcionalidades)  
- [Instância de Domínio](#instância-de-domínio)
- [Camadas Lógicas](#camadas-lógicas)
- [Como rodar este projeto na sua máquina](#como-rodar-este-projeto-na-sua-máquina)  
- [Clonando o repositório](#clonando-o-repositório)  
- [Configurando o banco de dados](#configurando-o-banco-de-dados)  
- [Rodando o projeto](#rodando-o-projeto)  
- [Testando a API](#testando-a-api)  

## Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Postman (para testes dos endpoints)
- Maven  

## Funcionalidades

- Usuários

  - Criar novo usuário

  - Listar todos os usuários
  
  - Buscar usuário por ID
  
  - Atualizar dados de um usuário
  
  - Deletar usuário por ID

- Produtos

  - Listar todos os produtos disponíveis
  
  - Buscar produto por ID
  
  - (Opcional: adicionar, editar ou remover produtos — caso tenha implementado)

- Pedidos

  - Criar pedido vinculado a um usuário
  
  - Listar todos os pedidos de um usuário
  
  - Atualizar dados de um pedido
  
  - Deletar pedido por ID

## Instância de Domínio


<img src="https://github.com/wescaetano/first-springboot-project/blob/main/assets/domain_instance.png" alt="First page" height="50%">

## Camadas Lógicas

<img src="https://github.com/wescaetano/first-springboot-project/blob/main/assets/logical_layers.png" alt="First page" height="50%">

## Como rodar este projeto na sua máquina
Pré-requisitos
- Git

- Java 17+

- Maven (caso não esteja usando o wrapper)

- PostgreSQL

- Postman (opcional, para testar os endpoints)

## Clonando o repositório
```bash
git clone https://github.com/wescaetano/first-springboot-project.git
cd seu-repo
```

 

## Configurando o banco de dados
Crie um banco de dados PostgreSQL com o nome usado no seu application.properties (ou application.yml).

Exemplo:

```sql
CREATE DATABASE nome_do_banco
```
No diretório src/main/resources, edite o arquivo application.properties com as credenciais corretas do seu banco:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```







Você pode também usar um arquivo .env e configurar para rodar com variáveis de ambiente se preferir.

## Rodando o projeto
Se você usa o wrapper do Maven:
```bash
./mvnw spring-boot:run
```
Ou com Maven instalado:

```bash
mvn spring-boot:run
```

## Testando a API
Com o projeto rodando, acesse os endpoints pelo Postman ou navegador:

Exemplo:

```bash
GET http://localhost:8080/users/{1}
POST http://localhost:8080/users
PUT http://localhost:8080/users/{1}
DELETE http://localhost:8080/users/{1}
```
A porta pode variar conforme você definiu.
