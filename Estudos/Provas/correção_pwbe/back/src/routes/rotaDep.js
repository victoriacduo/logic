const express = require('express');
const rotasDeps = express.Router(); 

const controller = require('../controllers/depController.js');

rotasDeps.post('/solicitacoes/criarDep', controller.cadDep);
rotasDeps.delete('/solicitacoes/delDep/:id', controller.delDep); // : indica q o id é um parametro

module.exports = rotasDeps;