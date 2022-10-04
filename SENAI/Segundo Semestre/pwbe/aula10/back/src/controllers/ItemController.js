const Item = require('../models/Item');
const con = require('../models/patrimonioDAO');

const criarItens = (req, res)=> {
    con.query(Item.toCreate(re.body), (err, result) => {
        if(err == null)
            res.status(201).end();
        else
            if (err.sqlState == 23000)
                res.status(406).json(err).end();
            else
                res.status(500).json(err).end();
    });  
} 

const listarItens = (req, res)=> {
    con.query(Item.toReadAll(), (err, result) => {
        if(err == null)
            res.json(result).end();
        else
            res.status(500).end();
    });
}

const listarItem = (req, res) => {
    con.query(Item.toRead(req.params), (err, result) => {
        if(err == null)
            if(result.length > 0)
                res.json(result).end();
            else
                res.status(404).end();
        else
            res.status(500).end();
    });
}

const alterarItem = (req, res) => {
    con.query(Item.toUpdate(req.body), (err, result) => {
        if(err == null)
            if(result.affectedRows > 0)
                res.status(200).end();
            else
                res.status(404).end();
        else
        res.status(500).json(err).end();
    });
}

const excluirItem = (req, res)=> {
    con.query(Item.toDelete(req.params), (err, result) => {
        if (err == null)
            if (result.affectedRows > 0)
                res.status(204).end();
            else
                res.status(404).end();
        else
            res.status(400).json(err).end();
    });
} 

module.exports = {
    criarItens,
    listarItens,
    listarItem,
    alterarItem,
    excluirItem
}