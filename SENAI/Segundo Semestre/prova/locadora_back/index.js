const express = require("express");
const cors = require("cors");
const mysql = require("mysql");

const app = express();
app.use(express.json());
app.use(cors());

const con = mysql.createConnection({
    user: 'root',
    host: 'localhost',
    database: 'locadora'
});

app.get('/locadora/clientes', (req, res) => {
    let query = `SELECT * FROM clientes`;
    con.query(query, (err, result) => {
        if(err == null) {
            res.status(201).json(result).end();
        } else {
            res.status(400).json(err).end();
        }
    });
});

app.get('/locadora/clientes/:nome', (req, res) => {
    let query = `SELECT * FROM clientes WHERE nome = '${req.params['nome']}`;
    con.query(query, (err, result) => {
        if(err == null) {
            res.status(201).json(result).end();
        } else {
            res.status(400).json(err).end();
        }
    });
});

app.post('/locadora/clientes', (req, res) => {
    let query = `INSERT INTO clientes VALUES (DEFAULT, '${req.body.nome}', '${req.body.endereco}','${req.body.telefone}')`;
    con.query(query, (err, result) => {
        if(err == null) {
            res.status(201).json(req.body).end();
        } else {
            res.status(400).json(err).end();
        }
    });
});

app.listen(5000, () => {
    console.log("Tudo certo");
});