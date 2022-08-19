drop database if exists onibus;
create database onibus charset=UTF8 collate utf8_general_ci;
use onibus;

create table motorista(
    cpf integer not null primary key auto_increment,
    nome_motorista varchar(30) not null,
);

create table telefones(
    cpf integer not null,
    telefone varchar(15) not null,
    foreign key (cpf) references motorista(cpf)
);

create table linhas(
    id_linha integer not null primary key auto_increment,
    descricao_linha varchar(20) not null
);

create table horarios(
    id_linha integer not null,
    horarios varchar(10) not null,
    foreign key (id_linha) references linhas(id_linha)
);

create table mot_linhas(
    cpf integer not null,
    id_linha integer not null,
    dia varchar(10) not null,
    foreign key (cpf) references motorista(cpf),
    foreign key (id_linha) references linhas(id_linha)
);

describe motorista;
describe telefones;
describe linhas;
describe horarios;
describe mot_linhas;
show tables;