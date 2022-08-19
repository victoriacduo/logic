drop database if exists duplicatas;
create database duplicatas charset=UTF8 collate utf8_general_ci;
use duplicatas;

create table clientes(
    cod_cliente integer not null primary key auto_increment,
    nome varchar(30) not null,
    endereco varchar(30) not null,
    bairro varchar(10) not null,
    cidade varchar(15) not null,
    uf varchar(2) not null
);

create table telefones(
    cod_cliente integer not null,
    tipo varchar(10) not null,
    telefone varchar(20) not null,
    foreign key (cod_cliente) references clientes(cod_cliente)
);

create table duplicatas(
    num_dupli integer not null primary key auto_increment,
    cod_cliente integer not null,
    data_compra date not null,
    vencimento date not null,
    pagamento date not null,
    valor varchar(10) not null,
    diferença varchar(10) not null,
    valor_final varchar(10) not null,
    sta_tus varchar(10) not null,
    foreign key (cod_cliente) references clientes(cod_cliente)
);

describe clientes;
describe telefones;
descrobe duplicatas;
show tables;