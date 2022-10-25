const express = require('express');
const cors = require('cors');

const produtos = require('./src/routes/rotaProd.js'); 
const departamentos = require('./src/routes/rotaDep.js'); 
const solicitacoes = require('./src/routes/rotaSoli.js'); 

const app = express();
app.use(express.json());
app.use(cors());
app.use(produtos);
app.use(departamentos);
app.use(solicitacoes);

app.listen(3000, () => {
    console.log("oi");
});