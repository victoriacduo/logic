const Dep = require('../models/departamentos');
const con = require('../models/DAO');
const { json } = require('body-parser');

const criarDep = (req, res) => {
    con.query(Dep.toCreate(req.body), (err, result) => {
        if (err == null)
            if(result[1].affectedRow == 0)
                res.status(400).json(result).end();
            else
            res.status(201).json(req.body).end();
        else
            res.status(500).json(err).end();
    });
}

const excluirDep = (req, res) => {
    let string = `delete from departamentos where cod_depto = ${req.body.cod_depto}`;
    con.query(string, (err, result) => {
        if (err == null)
            if (result.affectedRows > 0)
                res.status(200).end();
            else
                res.status(404).end();
        else
            res.status(400).json(err).end();
    });
}

module.exports = {
    criarDep,
    excluirDep
}