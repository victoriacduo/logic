const toCreate = (model) => {
    return `INSERT INTO departamentos VALUES (${model.cod_depto},'${model.nome_produto}')`;
}

const toDelete = (model) => {
    return `DELETE * FROM departamentos WHERE cod_depto= ${model.cod_depto}`;
}

module.exports = {
    toCreate,
    toDelete
}