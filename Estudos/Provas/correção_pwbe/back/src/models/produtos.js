const toReadAll = () => {
    return `SELECT * FROM Produtos`;
}
//precisa de um parametro pra preencher o template string (insert
const toCreateProdutos = (body) => {
    return `INSERT INTO Produtos values (${body.id}, '${body.nome}')`
}

const buscaProd = (body) => {
    return `SELECT * FROM vw_depart WHERE Nome_produto='${body.nome}'`;
}

const buscaPorData = (body) => {
    return `SELECT * FROM vw_geral WHERE Data_sol like '%${body.data}%'`
}

module.exports = {
    toReadAll,
    toCreateProdutos,
    buscaProd,
    buscaPorData
}