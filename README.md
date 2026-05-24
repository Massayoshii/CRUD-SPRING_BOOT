# CRUD API - Spring Boot

## 📌 Sobre o Projeto

Este projeto é uma API REST CRUD desenvolvida utilizando Spring Boot e PostgreSQL com o objetivo de praticar conceitos fundamentais do desenvolvimento backend em Java.

A aplicação permite realizar operações de:

- Criar produtos
- Listar produtos
- Buscar produtos por ID
- Atualizar produtos
- Deletar produtos

---

# 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- Lombok

---

# 📂 Estrutura do Projeto

```text
src
 └── main
      ├── java
      │     └── com.example.crud
      │            ├── controller
      │            ├── entity
      │            ├── repository
      │            ├── service
      │            └── CrudApplication.java
      │
      └── resources
            └── application.properties
```

---

# ⚙️ Configuração do Banco de Dados

Configure o arquivo:

```properties
src/main/resources/application.properties
```

Com as informações do seu PostgreSQL:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/crud
spring.datasource.username=postgres
spring.datasource.password=123456

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# ▶️ Como Executar o Projeto

## 1. Clone o repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

---

## 2. Abra o projeto na IDE

Recomendado:

- IntelliJ IDEA
- VS Code

---

## 3. Crie o banco de dados

No PostgreSQL crie um banco chamado:

```sql
CREATE DATABASE crud;
```

---

## 4. Execute a aplicação

Rode a classe:

```text
CrudApplication.java
```

---

# 🧪 Endpoints da API

## 🔹 Criar Produto

### POST `/produtos`

```json
{
  "nome": "Mouse Gamer",
  "preco": 250.0
}
```

---

## 🔹 Listar Produtos

### GET `/produtos`

---

## 🔹 Buscar Produto por ID

### GET `/produtos/{id}`

Exemplo:

```http
GET /produtos/1
```

---

## 🔹 Atualizar Produto

### PUT `/produtos/{id}`

```json
{
  "nome": "Teclado Mecânico",
  "preco": 350.0
}
```

---

## 🔹 Deletar Produto

### DELETE `/produtos/{id}`

---

# 🛠️ Funcionalidades Implementadas

- API REST
- CRUD completo
- Integração com PostgreSQL
- Persistência com JPA/Hibernate
- Arquitetura em camadas
- Injeção de Dependência
- Mapeamento de entidades

---

# 📚 Conceitos Praticados

Durante o desenvolvimento deste projeto foram praticados conceitos como:

- Spring Boot
- REST API
- JPA
- Hibernate
- Banco de Dados Relacional
- Repository Pattern
- Service Layer
- JSON
- HTTP Methods

---

# 🔮 Melhorias Futuras

- DTOs
- Validações
- Tratamento global de exceções
- Swagger/OpenAPI
- Spring Security
- JWT
- Docker
- Testes automatizados
- Deploy em nuvem

---

# 👨‍💻 Autor
- Massayoshi Bando Fogaca e Silva
- Projeto desenvolvido para estudos de backend Java utilizando Spring Boot.