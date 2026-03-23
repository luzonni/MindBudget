# MindBudget

MindBudget é uma API REST para gerenciamento financeiro pessoal com foco em análise comportamental. O sistema vai além do registro de transações, buscando identificar padrões de consumo e gerar insights que apoiem decisões financeiras mais conscientes.

---

## Objetivo

Fornecer uma base sólida para controle financeiro, combinada com mecanismos de análise que permitam ao usuário compreender seus hábitos de gasto ao longo do tempo.

---

## Escopo

A aplicação contempla:

- Registro de receitas e despesas
- Organização por categorias
- Consulta por períodos e filtros
- Identificação de padrões de consumo
- Geração de indicadores e resumos financeiros

---

## Funcionalidades Planejadas

### Gestão de Dados

- Cadastro de transações financeiras
- Definição e gerenciamento de categorias
- Associação de transações a usuários

### Análise de Comportamento

- Detecção de gastos recorrentes
- Identificação de categorias com maior impacto financeiro
- Análise de variação de gastos entre períodos

### Insights e Indicadores

- Resumo mensal consolidado
- Tendência de evolução de gastos
- Alertas baseados em desvios de comportamento

---

## Arquitetura (planejada)

- API REST baseada em Java com Quarkus
- Banco de dados relacional (PostgreSQL)
- Autenticação via JWT
- Documentação com OpenAPI (Swagger)
- Containerização com Docker

---

## Requisitos Não Funcionais

- Separação de dados por usuário
- Estrutura preparada para escalabilidade
- Código organizado com foco em manutenção e testes
- Logs e tratamento consistente de erros

---

## Roadmap

- Implementação da base CRUD de transações
- Sistema de autenticação e autorização
- Módulo inicial de análise (gastos por categoria e período)
- Evolução para análise comportamental mais avançada
- Deploy em ambiente de produção

---

## Diferencial

O principal diferencial do MindBudget é a tentativa de transformar dados financeiros em informação útil, priorizando análise e interpretação ao invés de simples armazenamento.

---

## Status

Em desenvolvimento
