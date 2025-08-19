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
- [Persistência de Dados](#persistência-de-dados)
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
   git clone https://github.com/lucas-yago/ForumHub-api.git
   cd ForumHub
   ```
2. Configure o banco de dados em `application.properties` (usuário, senha e URL).  
3. Execute o projeto:  
   ```bash
   mvn spring-boot:run
   ```
4. A aplicação estará disponível em: **http://localhost:8080** 

---

## Persistência de Dados

A persistência dos dados é gerenciada pelo Spring Data JPA, que utiliza as interfaces RepositorioLivros e RepositorioAutores. As classes Livro e Autor são mapeadas como entidades (@Entity) e as tabelas correspondentes são criadas no banco de dados PostgreSQL.
- A classe Livro possui um relacionamento @OneToMany com Autor.
- A classe Autor possui um relacionamento @ManyToOne com Livro.
A aplicação utiliza as anotações do Spring para autoinjetar os repositórios (@Autowired), facilitando o acesso e a manipulação dos dados no banco de dados.

---

## Conclusão

Em resumo, o projeto é um excelente exemplo de como combinar diferentes tecnologias para resolver um problema real, praticando conceitos como consumo de API, persistência de dados, mapeamento de objetos e interação com o usuário em um ambiente de desenvolvimento Java e Spring.
