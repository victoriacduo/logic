const toReadAll = () => {
    return "SELECT * FROM itens";
}

const toRead = () => {
    return `SELECT * FROM itens WHERE ni=${model.ni}`;
}

const toCreate = (model) => {
    return `INSERT INTO itens VALUES (${model.ni}, '${model.aquisicao}', ${model.denominacao}, ${model.valor}, '${model.img}')`;
}

const toDelete = () => {
    return `DELETE FROM itens WHERE ni=${model.ni}`;
}

module.exports = {
    toReadAll,
    toRead,
    toCreate,
    toDelete
}