
<h1 align="center">DSCommerce API</h1>

<a href="()"></a>
[ACESSAR  PROJETO](https://github.com/luizzlcs/dscommerce)


## 📃Descrição
A DSCommerce API (caso de estudo) é o núcleo que suporta toda a operação do sistema, atendendo tanto administradores quanto clientes. Desenvolvida com o framework Springboot, ela integra uma série de tecnologias para oferecer recursos avançados, como:

- Autenticação e segurança: Utilizando OAuth2 
- Resource Server, JWT e BCrypt, garantindo um ambiente seguro para todos os usuários.
- Gerenciamento de usuários: Perfis personalizados para clientes e administradores.
- Gestão de produtos e categorias: Permite organizar e atualizar o catálogo de produtos de forma eficiente.
- Processamento de ordens de compra: Facilita a geração e consulta de pedidos.
- Bancos de dados confiáveis: Integração com MySQL e H2 Database, gerenciados pelo Spring Data JPA.


</p>

## 🎮Funcionalidades
 🟢 Autenticação de usuário;

 🟢 Perfis de cliente e administrador associados ao usuário;

 🟢 Cadastramento de produtos e categoria pertencente, por usuário com perfil de administrador;

 🟢 Listagem de produtos;

 🟢 Consulta de um produto especifico;

 🟢 Atualização de informações de produtos, por usuário com perfil de administrador;

 🟢 Deleção de um produto especifico, por usuário com perfil de administrador;

 🟢 Listagem de todas as categorias
 Gerar ordem de compra, por usuário com 
 perfil de cliente;

 🟢 Consulta de ordem de compra especifica, por usuário com perfis cliente e administrador.

## Futures
    🚀 Autenticação de usuário utilizando OAuth2, chave RSA e JWT Token;

    🚀 Exibição de informações do próprio usuário em sessão ativa;

    🚀 Status para as ordens: AGUARDANDO PAGAMENTO, PAGO, ENVIADO, ENTREGUE, CANCELADO

    🚀 Adicionando mapeamento de CORS

    🚀 Modelo de domínio complexo

    🚀 Projeção com SQL nativo

    🚀 Ambientes diferentes de desenvolvimento: TEST,


## 💻 Tecnologias
- Java
- Spring
- Spring Web
- Spring Boot DevTools
- Spring Data JPA
- OAuth2 Resource Server
- RSA
- JWT
- BCrypt
- H2 Database


## 📍Endpoints da API

| Método | Endpoint          | Resumo                                                                                                     | Autenticação | Role                        |
|--------|--------------------|-----------------------------------------------------------------------------------------------------------|--------------|-----------------------------|
| POST   | `/oauth2/token`    | Autentica o usuário e gera o Bearer Token JWT. Utiliza Basic Auth e corpo de requisição `x-www-form-urlencoded` com as chaves: `username`, `password`, e `grant_type`. | Sim          | *                           |
| GET    | `/users/me`        | Lista as informações do usuário que está na sessão.                                                       | Sim          | ROLE_ADMIN, ROLE_CLIENT     |
| GET    | `/products`        | Lista todos os produtos.                                                                                  | Não          | *                           |
| GET    | `/products/:id`    | Exibe informações de um produto específico por seu ID.                                                    | Não          | *                           |
| POST   | `/products`        | Cadastra um novo produto.                                                                                 | Sim          | ROLE_ADMIN                  |
| PUT    | `/products/:id`    | Atualiza um produto específico, informando o ID no Path e as informações no corpo da requisição.          | Sim          | ROLE_ADMIN                  |
| DELETE | `/products/:id`    | Deleta um produto específico, informando o ID no Path.                                                    | Sim          | ROLE_ADMIN                  |
| GET    | `/categories`      | Lista todas as categorias.                                                                                | Não          | *                           |
| POST   | `/orders`          | Gera uma ordem de compra.                                                                                 | Sim          | ROLE_CLIENT                 |
| GET    | `/orders/:id`      | Lista os produtos de uma ordem de compra específica e seu status, informando o ID.                        | Sim          | ROLE_ADMIN, ROLE_CLIENT     |
| GET    | `/h2-console`      | Permite acesso ao H2 Database.                                                                            | Sim          | *                           |

## 👩🏽‍💻Instalação
  ```# Clone este repositório:
  $ git clone https://github.com/CleilsonAndrade/dscommerce-api.git
  $ cd ./dscommerce-api

  # Instalar as dependências:
  $ mvn clean install

  # Executar:
  $ mvn spring-boot:run
  ```
---
### Autor
Sou desenvolvedor fullstack com foco em entregar soluções completas e eficientes, combinando tecnologias modernas como Dart e Flutter para front-end e Java para back-end. Desde 2022, atuo na Ponto Care, onde desenvolvo aplicativos para Android e Web, sempre priorizando inovação, qualidade e a melhor experiência para o usuário.

<img alt="Luiz Carlos" title="Luiz Carlos" src="https://avatars.githubusercontent.com/u/29442285?s=96&v=4" height="100" width="100" />

[![LinkedIn Badge](https://img.shields.io/badge/-LUIZ_CARLOS-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/luizzlcs/)](https://www.linkedin.com/in/luizzlcs/)