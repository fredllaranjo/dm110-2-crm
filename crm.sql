CREATE DATABASE "dm110-2-crm"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;

CREATE SEQUENCE seq_id_client;
CREATE TABLE client (
	id int NOT NULL nextval('seq_id_client'),
    nome varchar(50) not null,
    email varchar(50) not null,
    CONSTRAINT pk_client PRIMARY KEY (id)
);