import { useState } from 'react'
import { View, TextInput } from 'react-native';
import itensCad from '../../components/itemLista/compItem';

import style from './style';

export default function Home({ routes }) {
    const [searchWord, setSearchWord] = useState('')
    const id = routes;

    const chamados = [
        {
            "user_id": 1,
            "chamados": [
                {
                    "titulo":"Manutenção de Roteador",
                    "descricao":"Cliente reclamou que está sem internet, possível troca"
                },
                {
                    "titulo":"Mudança de Endereço",
                    "descricao":"Fazer a instalação na nova instalação"
                },
                {
                    "titulo":"Recolher equipamento",
                    "descricao":"Assinatura Cancelada, recolher os equipamentos da instalação"
                }
            ]
        },
        {
            "user_id": 2,
            "chamados": [
                {
                    "titulo":"Recolher equipamento",
                    "descricao":"Assinatura Cancelada, recolher os equipamentos da instalação"
                },
                {
                    "titulo":"Mudança de Endereço",
                    "descricao":"Fazer a instalação na nova instalação"
                },
                {
                    "titulo":"Manutenção de Roteador",
                    "descricao":"Cliente reclamou que está sem internet, possível troca"
                }
            ]
        }
    ]

    return(
        <View style={style.container}>
            <TextInput 
            placeholder="Teste..." 
            style={style.search}
            onChangeText={setSearchWord}
            />

            {   
            chamados[id].chamados.map((item, index) => {
                return(
                    <itensCad value1={item.titulo}
                    value2={item.descricao}/>
                )
            })
        }
        </View>
    )
}