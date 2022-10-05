const Soli = require('../models/solicitacoes');
const con = require('../models/solicitacaoDAO');
const { json } = require('body-parser');

const criarSoli = (req, res) => {
    con.query(Soli.toCreate(req.body), (err, result) => {
        if (err == null)
            if(result[1].affectedRow == 0)
                res.status(400).json(result).end();
            else
            res.status(201).json(req.body).end();
        else
            res.status(500).json(err).end();
    });
}

const listarSoli = (req, res) => {
    con.query(Soli.toReadAll(), (err, result) => {
        if (err == null)
            res.json(result).end();
        else
            res.status(500).end();
    });
}

module.exports = {
    criarSoli,
    listarSoli
}