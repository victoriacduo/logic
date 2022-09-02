const clientes = (lista) => {
    lista.forEach(e => {
        e.telefones = [];
        let tel = {};
        tel.tipo = e.tipo;
        tel.numero = e.telefone;
        e.telefones.push(tel);
        delete e.tipo;
        delete e.telefone;
    });

    //cria uma nova lista sem os dados duplicados (comparando o proximo item com o anterior)
    let aux = []; //lista auxiliar
    let lip = 0; //ultimo indice auxiliar
    aux.push(lista[lip]); // acrescenta o primeiro item da lista na aux
    for(i = 1; i < lista.length; i++) {
        if(lista[i].cod_cli == lista[i-1].cod_cli) { // se o proximo for igual ao anterior
            let tel = {}; // novo objeto telefone
            tel.tipo = lista[i].telefones[0].tipo;
            tel.numero = lista[i].telefones[0].numero;
            aux[lip].telefones.push(tel); // acrescenta somente o novo objeto telefone
        } else { // senao acrescenta o novo item na lista e incrementa o indice
            aux.push(lista[i]);
            lip++;
        }
    }
    return aux; // retornamos a nova lista sem os duplicados e com os objetos telefones
}

module.exports = {
    clientes
}