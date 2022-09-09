const express = require("express");
const cors = require("cors");
const mysql = require("mysql");

const app = express();
app.use(express.json());
app.use(cors());

const con = mysql.createConnection({
    user: 'root',
    host: 'localhost',
    database: 'lojinha'
});

app.get('/lojinha/produtos', (req, res) => {
    let query = 'SELECT * FROM produtos';
    con.query(query, (err, result) => {
        if(err == null) {
            res.status(201).json(result).end();
        } else {
            res.status(400).json(err).end();
        }
    });
});

app.get('/lojinha/produtos/:dia', (req, res) => {
    let query = `SELECT * FROM produtos WHERE dia = '${req.params['dia']}'`;
    con.query(query, (err, result) => {
        if(err == null) {
            res.status(201).json(result).end();
        } else {
            res.status(400).json(err).end();
        }
    });
});

app.post('/lojinha/produtos', (req, res) => {
    let query = `INSERT INTO produtos VALUES (DEFAULT, '${req.body.dia}', '${req.body.descricao}', ${req.body.valor}, '${req.body.tipo}')`;
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