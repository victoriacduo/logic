const criaSoli = (body) => {
    return `CALL solicita_um_item (${body.n_sol}, ${body.depto}, ${body.func}, ${body.prod}, ${body.qtd}, ${body.total})`
}

const toReadAll = () => {
    return `SELECT * FROM vw_geral`;
}

const soliFunc = () => {
    return `SELECT * FROM vw_func_solic`;
}

module.exports = {
    criaSoli,
    toReadAll,
    soliFunc
}