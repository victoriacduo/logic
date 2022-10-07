const express = require('express');
const router = express.Router();

const Prod = require("../controllers/ProdController");

router.get("/produtos/todas", Prod.listarProd);
router.post("/produtos/umitem", Prod.criarProd);

module.exports = router;