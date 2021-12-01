# TP1_ENG_SOFT
## Projeto do TP1 de Engenharia de Software

## Equipe

- Guilherme Barboza Mendonça (2019006655): Full stack
- Túlio Dias Altíssimo (2017014375): Full stack
- Hilário Corrêa da Silva Neto (2019006701): Full stack

## Objetivo

Simular um simples e-commerce capaz de realizar transações de produtos entre clientes consumidores e usuários fornecedores

## Tecnologias

- Frontend: Vue.js
- Backend: Java (SpringBoot)
- BD: PostgreSQL

## Principais atores do Sistema

- Usuário Fornecedor
- Usuário Consumidor (cliente)

## Backlog do Produto

- 1) Como fornecedor, gostaria de poder fazer login no sistema como usuário fornecedor de produtos

- 2) Como fornecedor, gostaria de gerenciar, inserir, remover, editar e alterar o estoque dos produtos que forneço

- 3) Como cliente, gostaria de poder fazer login no sistema como usuário consumidor

- 4) * Como cliente, gostaria de visualizar uma lista principal de produtos recomendados

- 5) * Como cliente, gostaria de pesquisar produtos e filtrar por categoria, marca, preço, tipo de produto, etc

- 6) * Como cliente, gostaria de poder gerenciar um carrinho de compras, inserindo, removendo e alterando qtdes de produtos

- 7) Como cliente, gostaria de finalizar um pedido com os produtos que estão atualmente no carrinho

- 8) Como cliente, gostaria de acessar um histório de todos os pedidos já solicitados, visualizando detalhes como os produtos solicitados, os fornecedores envolvidos e a situação da compra

- 9) Como fornecedor, gostaria de verificar e gerenciar todas as solicitações de pedidos de compra, visualizando detalhes como o cliente desse pedido e os produtos solicitados

## Backlog da Sprint

4) Atribuição: Guilherme Barboza

- a) Construir uma tela principal que contenha uma listagem simples dos produtos recomendados pelo sistema
- b) Construir funcionalidade no Backend para computar e retornar os produtos mais indicados para o cliente atualmente logado com base no seu histórico de compras

5) Atribuição: Hilário Correa

- a) Construir componente ou tela dedicada para filtragem de produtos.
- b) Permitir que os clientes possam dinamicamente preencher quais e quantos campos relacionados aos produtos forem necessários.
- c) Configurar as tabelas de Produto, Categoria, Tipo, Seção, entre outras, para permitir que a filtragem dinâmica seja realizada.
- d) Construir funcionalidade de filtragem dinâmica de Produto no Backend.

6) Atribuição: Túlio Dias Altíssimo

- a) Para todos os produtos listados, permitir que os clientes possam clicar em um botão para adicionar um produto no carrinho.
- b) Construir tela de gerenciamento do carrinho de compras de tal forma que os clientes possam visualizar os produtos atualmente no Carrinho, remover produtos ou alterar a quantidade solicitada.
- c) Criar uma tabala no BD que guarde as informações desse carrinho até que a compra seja finalizada ou cancelada.
- d) No backend, construir funcionalidade para receber e salvar as informações do carrinho na tabela descrita no item c).