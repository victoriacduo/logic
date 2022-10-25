const mysql = require('mysql'); // chama a dependência relacionada ao mysql

const con = mysql.createConnection({ // cria conexão com o banco de dados
    user: 'root',
    host: 'localhost',
    database: 'solicitacoes'
});

module.exports = con; // permite chamar o con em outros lugares que for importado