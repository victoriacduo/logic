const express = require("express");
const cors = require("cors");
const mysql = require("mysql");

const app = express();
app.use(express());
app.use(cors());

const con = mysql.createConnection({
    user: 'root',
    host: 'localhost',
    database: 'lojinha'
});

app.get('/lojinha/produtos', (req, res) => {
    let query = "SELECT * FROM produtos";
    con.query(query, (err, result) => {
        if(err == null) {
            res.status(201).json(req.body).end();
        } else {
            res.status(400).json(err).end();
        }
    });
});

app.get('/lojinha/produtos', (req, res) => {
    let query = `SELECT * FROM produtos WHERE data = '${req.params.data}'`
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