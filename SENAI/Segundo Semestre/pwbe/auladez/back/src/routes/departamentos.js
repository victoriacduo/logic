const express = require('express');
const router = express.Router();

const dep = require("../controllers/depController");

router.post("/departamentos/umdep", dep.criarDep);
router.delete("/departamentos/", dep.delDep);

module.exports = router;