const con = require('../models/DAO.js');
const prodMod = require('../models/produtos.js');

const listaProd = (req, res) => {
    con.query(prodMod.toReadAll(), (err, result) => { // usa o dao pra fazer conexao com o banco de dados e mandar as informações informadas no toreadall
        if(err == null){
            res.status(200).json(result).end();
        } else {
            res.status(400).json(err).end();
        }
    });
}

const cadProd = (req, res) => {
    con.query(prodMod.toCreateProdutos(req.body), (err, result) => {
        if(err == null){
            res.status(201).json(req.body).end();
        } else {
            res.status(400).json(err).end();
        }
    }); 
}

const buscarProd = (req, res) => {
    con.query(prodMod.buscaProd(req.body), (err, result) => {
        if(err == null){
            res.status(200).json(result).end();
        } else {
            res.status(400).json(err).end();
        }
    }); 
}

const buscarData = (req, res) => {
    con.query(prodMod.buscaPorData(req.body), (err, result) => {
        if(err == null){
            res.status(200).json(result).end();
        } else {
            res.status(400).json(err).end();
        }
    }); 
}

module.exports = {
    listaProd,
    cadProd,
    buscarProd,
    buscarData
}