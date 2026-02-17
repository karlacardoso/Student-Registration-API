# 🎓 Student Registration API — Spring Boot

API REST desenvolvida com **Spring Boot** para cadastro e listagem de estudantes.

O projeto implementa uma arquitetura em camadas utilizando **Controller → Service → Repository → Entity**, com persistência em banco de dados em memória **H2**.

---

## 🚀 Tecnologias utilizadas

* Java 17
* Spring Boot 3.2.5
* Spring Web
* Spring Data JPA
* Hibernate
* H2 Database
* Maven

---

## 📂 Estrutura do Projeto

```
src/main/java/com/example/Spring_Boot_Rest_API
│
├── MyController.java                # Endpoints REST
├── Student.java                    # Entidade (Model)
├── StudentRepo.java                # Repositório JPA
├── StudentService.java             # Regras de negócio
└── SpringBootRestApiApplication    # Classe principal
```

### 📖 Camadas explicadas

* **Controller**

  * Recebe requisições HTTP
  * Retorna ResponseEntity

* **Service**

  * Contém regras de negócio
  * Intermedia Controller ↔ Repository

* **Repository**

  * Interface que herda de JpaRepository
  * CRUD automático

* **Entity**

  * Representa a tabela no banco

---

## 🗄️ Modelo da Entidade

### Student

| Campo    | Tipo   | Regra            |
| -------- | ------ | ---------------- |
| id       | Long   | PK / Auto gerado |
| fullname | String | —                |
| email    | String | Único            |
| password | String | —                |
| address  | String | —                |

---

## ▶️ Como executar o projeto

### 1️⃣ Clonar repositório

```bash
git clone https://github.com/SEU-USUARIO/Spring_Boot_Rest_API.git
```

### 2️⃣ Entrar na pasta

```bash
cd Spring_Boot_Rest_API
```

### 3️⃣ Rodar aplicação

Via Maven Wrapper:

```bash
./mvnw spring-boot:run
```

Ou rodando a classe:

```
SpringBootRestApiApplication.java
```

---

## 🌐 Base URL

```
http://localhost:8080
```

---

## 📡 Endpoints disponíveis

### 🔹 Teste da API

```
GET /
```

**Resposta**

```
Tested OK
```

Status: `202 ACCEPTED`

---

### 🔹 Registrar estudante

```
POST /register
```

**Body JSON**

```json
{
  "fullname": "Maria Silva",
  "email": "maria@email.com",
  "password": "123456",
  "address": "São Paulo"
}
```

**Resposta sucesso**

```
Registration Sucessfully Completed
```

Status: `202 ACCEPTED`

**Resposta erro**

```
Fail
```

Status: `400 BAD REQUEST`

---

## 🗄️ Banco de Dados — H2

Banco em memória usado para testes.

Console disponível em:

```
http://localhost:8080/h2-console
```

Configurações padrão (caso use):

```
JDBC URL: jdbc:h2:mem:testdb
User: sa
Password: (vazio)
```

---

## 🔄 Fluxo da Requisição

```
Client → Controller → Service → Repository → Database (H2)
```

1. Cliente envia JSON
2. Controller recebe
3. Service processa
4. Repository salva
5. Hibernate persiste no H2

---

## 🧪 Testando a API

Ferramentas recomendadas:

* Postman
* Insomnia
* Thunder Client

Exemplo via curl:

```bash
curl -X GET http://localhost:8080/
```

---

## 📌 Dependências principais (pom.xml)

* spring-boot-starter-web
* spring-boot-starter-data-jpa
* h2
* spring-boot-devtools
* spring-boot-starter-test

---

## 👩‍💻 Autor

Desenvolvido por **KARLA CARDOSO**



---

## 📄 Licença

Projeto para fins de estudo e portfólio.
