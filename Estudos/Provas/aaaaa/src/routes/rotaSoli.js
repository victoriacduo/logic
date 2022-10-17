const express = require('express');
const rotasSoli = express.Router(); 

const controller = require('../controllers/soliController.js');

rotasSoli.get('/solicitacoes/listarSolis', controller.listaSoli);
rotasSoli.get('/solicitacoes/listarFuncios', controller.listaSoliFunc);
rotasSoli.post('/solicitacoes/criaSoli', controller.criarSoli);

module.exports = rotasSoli;
