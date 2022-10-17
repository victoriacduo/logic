const con = require('../models/DAO.js');
const depMod = require('../models/departamento.js');

const cadDep = (req, res) => {
    con.query(depMod.toCreateDep(req.body), (err, result) => {
        if(err == null){
            res.status(201).json(req.body).end();
        } else {
            res.status(400).json(err).end();
        }
    }); 
}

const delDep = (req, res) => {
    con.query(depMod.deleteDep(req.params), (err, result) => { // antes da virgula eh oq vc manda, e dps eh oq vc recebe = resultado ou erro
        if(err == null){
            res.status(200).json(req.params.id).end();
        } else {
            res.status(400).json(err).end();
        }
    })
}

module.exports = {
    cadDep,
    delDep
}