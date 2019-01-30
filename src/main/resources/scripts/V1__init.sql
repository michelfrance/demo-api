CREATE database demodb;

\c demodb

CREATE TABLE demo (
  id serial NOT NULL,
  cnpj varchar(255) NOT NULL,
  data_atualizacao timestamp NOT NULL default current_timestamp,
  data_criacao timestamp NOT NULL default current_timestamp,
  razao_social varchar(255) NOT NULL
);

