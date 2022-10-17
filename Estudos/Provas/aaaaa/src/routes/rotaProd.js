const express = require('express');
const rotasProds = express.Router(); 

const controller = require('../controllers/prodController.js');

rotasProds.get('/solicitacoes/listaItens', controller.listaProd);
rotasProds.get('/solicitacoes/buscaProd', controller.buscarProd);
rotasProds.get('/solicitacoes/buscaProdData', controller.buscarData);
rotasProds.post('/solicitacoes/criarItem', controller.cadProd);

module.exports = rotasProds;