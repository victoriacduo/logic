const toCreateDep = (body) => {
    return `INSERT INTO Departamentos values (${body.id}, '${body.nome}')`;
}

const deleteDep = (params) => {
    return `DELETE FROM Departamentos WHERE Cod_Depto=${params.id}`;
}

module.exports = {
    toCreateDep,
    deleteDep
}