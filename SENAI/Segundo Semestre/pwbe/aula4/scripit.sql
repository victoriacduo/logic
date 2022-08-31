DROP DATABASE IF EXISTS lojinha;
CREATE DATABASE lojinha charset=UTF8 collate utf8_general_ci;
USE lojinha;

CREATE TABLE produtos (
    id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    cod VARCHAR(10) NOT NULL,
    nome VARCHAR(50) NOT NULL,
    quantidade INTEGER NOT NULL,
    preco float(5,2) NOT NULL
);

INSERT INTO produtos VALUES (DEFAULT, 'CJ1234', 'Calça Jeans Super Confortável', 10, 90.00);
INSERT INTO produtos VALUES (DEFAULT, 'MO214', 'Moletom Super Descolado', 5, 120.00);
