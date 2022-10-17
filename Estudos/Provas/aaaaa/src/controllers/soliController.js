const con = require('../models/DAO.js');
const soliMod = require('../models/solicitacoes.js');

const criarSoli = (req, res) => {
    console.log(req.body)
    con.query(soliMod.criaSoli(req.body), (err, result) => {
        if(err == null){
            res.status(201).json(req.body).end();
        } else {
            res.status(400).json(err).end();
        }
    })
}

const listaSoli = (req, res) => {
    con.query(soliMod.toReadAll(), (err, result) => { 
        if(err == null){
            res.status(200).json(result).end();
        } else {
            res.status(400).json(err).end();
        }
    });
}

const listaSoliFunc = (req, res) => {
    con.query(soliMod.soliFunc(), (err, result) => { 
        if(err == null){
            res.status(200).json(result).end();
        } else {
            res.status(400).json(err).end();
        }
    });
}

module.exports = {
    criarSoli,
    listaSoli,
    listaSoliFunc
}