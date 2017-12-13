CREATE DATABASE "dm110-2-crm"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;

\c dm110-2-crm;

CREATE TABLE client (
	id int NOT NULL,
    nome varchar(50) not null,
    email varchar(50) not null,
    CONSTRAINT pk_client PRIMARY KEY (id)
);