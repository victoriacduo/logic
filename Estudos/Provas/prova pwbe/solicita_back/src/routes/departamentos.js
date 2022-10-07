const express = require('express');
const router = express.Router();

const Dep = require("../controllers/DepController");

router.post("/departamentos/criarum", Dep.criarDep);
router.delete("/departamentos/deletar", Dep.excluirDep);

module.exports = router;