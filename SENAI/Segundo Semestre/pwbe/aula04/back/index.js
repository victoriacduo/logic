const express = require('express');
const cors = require('cors');
const mysql = require('mysql');

const con = mysql.createConnection({
    user: 'root',
    host: 'localhost',
    database: 'lojinha'
});

const app = express();
app.use(express.json());
app.use(cors());

app.get("/produtos", (req, res) => {
    let query = "SELECT * FROM produtos";

    con.query(query, (err, result) => {
        if(err == null) {
            res.json(result).status(200).end();
        } else {
            res.json(err).status(402).end();
        }
    });
});

app.get("/produtos/:cod", (req, res) => {
    let query = `SELECT * FROM produtos WHERE cod='${req.params.cod}';`

    con.query(query, (err, result) => {
        if(err == null) {
            res.status(201).json(result).end();
        } else {
            res.status(400).json(err).end();
        }
    });
})

app.post("/produtos", (req, res) => {
    let query = `INSERT INTO produtos VALUES(DEFAULT, '${req.body.cod}', '${req.body.nome}', '${req.body.qntd}', '${req.body.preco}')`;

    con.query(query, (err, result) => {
        if(err == null) {
            res.status(201).json(req.body).end();
        } else {
            res.status(400).json(err).end();
        }
    });
});

app.listen(3000, () => {
    console.log("Tudo certo!")
});