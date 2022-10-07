const toCreate = (model) => {
    return `CALL solicita_um_dep (${model.cod_dep}, '${model.nome_dep}')`;
}

const toDelete = () => {
    return `DELETE FROM vw_solicitacoes WHERE Cod_Depto=${model.cod_dep}`;
}

module.exports = {
    toCreate,
    toDelete
}