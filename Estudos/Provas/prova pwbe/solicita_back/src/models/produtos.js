const toCreate = (model) => {
    return `INSERT INTO produtos VALUES (${model.cod_produto}, '${model.nome_produto}')`;
}

const toReadAll = () => {
    return "SELECT * FROM produtos";
}

module.exports = {
    toCreate,
    toReadAll
}