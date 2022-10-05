const express = require('express');
const router = express.Router();

const Soli = require("../controllers/SoliController");

router.get("/solicitacoes/todas", Soli.listarSoli);
router.post("/solicitacoes/umitem", Soli.criarSoli);

module.exports = router;