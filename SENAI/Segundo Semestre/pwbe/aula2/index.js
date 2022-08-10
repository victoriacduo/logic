const express = require('express');
const mysql = require('mysql');
const app = express();

const conexao = mysql.createConnection({
    user : 'root',
    host : 'localhost',
    database : 'pedidos'
});

app.use(express.json());

app.get('/projeto',(req, res)=>{
    let priNome = req.query.priNome;
    let sobrenome = req.query.sobrenome;
    let endereco = req.query.endereco;
    let telefone = req.query.telefone;
    let celular = req.query.celular;

    let string = `insert into clientes value(null, '${priNome}', '${sobrenome}', '${endereco}')`;
    let string2 = `insert into telefones value(null, '${telefone}', '${celular})`;
    conexao.query(string, string2, (err, result)=>{
        if(err == null) {
            res.json("Dados recebidos com sucesso e enviados para o nosso banco de dados");
        } else {
            res.json("Dados recebidos com sucesso, porém não conseguimos enviar para o banco de dados");
        }
    });
});

app.listen(3000, ()=>{
    console.log("Tudo certo!");
});