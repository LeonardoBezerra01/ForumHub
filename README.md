<h1 align="center">Fórum Hub - API</h1>
<h2 align="center">Challenge da Formação ONE Oracle/Alura</h2>

<p align="center">
  <img src="" alt="Badge do Challenge">
</p>

## Índice

- [Descrição](#descrição)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Funcionalidades da Aplicação](#funcionalidades-da-aplicação)
- [Como Executar o Projeto](#como-executar-o-projeto)
- [Endpoints](#endpoints)
- [Conclusão](#conclusão)

## Descrição

O **Fórum Hub** é uma API REST desenvolvida com o objetivo de criar o back-end de um fórum de discussão, permitindo que os usuários criem, leiam, atualizem e deletem tópicos, com um sistema de autenticação seguro para proteger as rotas.

Este projeto foi desenvolvido como parte do programa de formação da Oracle em parceria com a Alura, proporcionando aprendizado prático e a oportunidade de aplicar conceitos essenciais do desenvolvimento back-end com Java e Spring Boot, incluindo a criação de uma API REST, validações, segurança com autenticação stateless via Tokens JWT e persistência de dados, além de aplicar conceitos avançados como criação de endpoints, implementação de camadas de segurança, entre outros.

---

## Tecnologias Utilizadas

- **Java 17**  
- **Spring Boot 3**  
- **Spring Security**  
- **JPA / Hibernate**  
- **Maven**  
- **Lombok**  
- **MySQL**  
- **JWT** 

---

## Funcionalidades da Aplicação

- **Autenticação e Autorização** com **JWT**.  
- **CRUD de Tópicos**: criação, listagem, atualização e exclusão.  
- **Validações de Regras de Negócio**, como prevenção de tópicos duplicados.  
- **Persistência de Dados** com Spring Data JPA e Hibernate. 

---

## Como Executar o Projeto

### Pré-requisitos
- Java 17+  
- Maven 4.0+  
- Git  
- Cliente de API (Postman ou Insomnia)  

### Passos
1. Clone o repositório:  
   ```bash
   git clone https://github.com/LeonardoBezerra01/ForumHub.git
   cd ForumHub
   ```
2. Configure o banco de dados em `application.properties` (usuário, senha e URL).  
3. Execute o projeto:  
   ```bash
   mvn spring-boot:run
   ```
4. A aplicação estará disponível em: **http://localhost:8080** 

---

## Endpoints

A tabela abaixo apresenta os endpoints disponíveis na API.

| Método HTTP | Endpoint        | Descrição                              | Necessita Autenticação? | Corpo da Requisição (JSON)                                |
| :---------- | :-------------- | :------------------------------------- | :---------------------- | :-------------------------------------------------------- |
| `POST`      | `/login`        | Autentica um usuário e retorna um token JWT. | **Não** | `{ "email": "seu-email", "senha": "sua-senha" }`           |
| `POST`      | `/topicos`      | Cadastra um novo tópico.               | **Sim** | `{ "id": "...", "titulo": "...", "mensagem": "...", "idAutor": "...", "idCurso": "..." }` |
| `GET`       | `/topicos`      | Lista todos os tópicos cadastrados.          | **Sim** | N/A                                                       |
| `GET`       | `/topicos/{id}` | Busca um tópico específico pelo seu ID.      | **Sim** | N/A                                                       |
| `PUT`       | `/topicos/{id}` | Atualiza um tópico existente.          | **Sim** | `{ "id": "...", "titulo": "...", "mensagem": "..." }` |
| `DELETE`    | `/topicos/{id}` | Exclui um tópico logicamente.          | **Sim** | N/A                                                       |


---

## Conclusão

O projeto Fórum Hub demonstra o domínio das tecnologias e conceitos essenciais para o desenvolvimento de uma API REST robusta e segura. A implementação de funcionalidades como CRUD de tópicos, autenticação com JWT e validações de regras de negócio não apenas atende aos requisitos do desafio, mas também valida a aplicação de boas práticas de desenvolvimento backend.

A utilização de ferramentas como Spring Boot, Spring Security e JPA/Hibernate permitiu a criação de um sistema eficiente e com manutenção simplificada. Este projeto serve como um sólido ponto de partida para a criação de sistemas mais complexos, provando a capacidade de construir soluções escaláveis e seguras.
