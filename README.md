API Rest para o app TradeMapClone destinado a Mentoria da Digital Inovation One
API para simular funcionalidades do TradeMap com integração ao Kafka para mostrar em tempo real valores das ações da B3.

Tecnologias utilizadas na API:

Spring Boot 2
Spring Data
Spring for Kafka
PostgreSQL
Aplicações envolvidas:

API Rest: escrita em Java e Spring Boot com endpoints para simular funcionalidades do TradeMap
API para coletar ações da B3: escrita em Python com Flask utilizando a lib do Yahoo Finances (https://finance.yahoo.com/)
Docker:
Arquivo do docker compose para subir o broker Kafka
Arquivo do docker compose para subir o Postgres
Arquivo do docker compose para subir a API em Flask
