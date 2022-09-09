DROP DATABASE IF EXISTS locadora;
CREATE DATABASE locadora charset=UTF8 COLLATE utf8_general_ci;
USE locadora;

CREATE TABLE clientes(
    cod_clientes INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    endereco VARCHAR(100) NOT NULL,
    telefone VARCHAR(15) NOT NULL
);

CREATE TABLE filmes(
    cod_filmes INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    genero VARCHAR(30) NOT NULL
);

CREATE TABLE locacoes(
    id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    cod_clientes INTEGER NOT NULL,
    cod_filmes INTEGER NOT NULL,
    data_locacao varchar(10) NOT NULL,
    data_devolucao varchar(10),
    FOREIGN KEY (cod_clientes) REFERENCES clientes(cod_clientes),
    FOREIGN KEY (cod_filmes) REFERENCES filmes (cod_filmes)
);

DESCRIBE CLIENTES;
DESCRIBE FILMES;
DESCRIBE LOCACOES;

SHOW TABLES;

LOAD DATA INFILE 'C:/Users/Desenvolvimento/Desktop/prova/locadora_back/docs/clientes.csv'
INTO TABLE clientes
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/Desenvolvimento/Desktop/prova/locadora_back/docs/filmes.csv'
INTO TABLE filmes
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/Desenvolvimento/Desktop/prova/locadora_back/docs/locacoes.csv'
INTO TABLE locacoes
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

SELECT * FROM clientes;