const Prod = require('../models/produtos');
const con = require('../models/DAO');
const { json } = require('body-parser');

const listarProd = (req, res) => {
    con.query(Prod.toReadAll(), (err, result) => {
        if (err == null)
            res.json(result).end();
        else
            res.status(500).end();
    });
}

const criarProd = (req, res) => {
    con.query(Prod.toCreate(req.body), (err, result) => {
        if (err == null)
            if(result[1].affectedRow == 0)
                res.status(400).json(result).end();
            else
            res.status(201).json(req.body).end();
        else
            res.status(500).json(err).end();
    });
}

module.exports = {
    criarProd,
    listarProd
}