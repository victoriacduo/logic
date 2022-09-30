import { useState } from 'react'
import { ScrollView, View, Text, TouchableOpacity, Image, TextInput } from 'react-native';

import style from './style';

export default function Home() {
    const [searchWord, setSearchWord] = useState('')

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

            <View style={style.chamados}>
                {chamados.filter((val) => {
                    if(searchWord == ""){
                        return val
                    } else if(val.chamados.titulo.toLowerCase().includes(searchWord.toLowerCase())){
                        return val 
                    }
                }).map((item, index) => (
                    <Text style={style.title} key={index}>{item.chamados.titulo}</Text>
                ))}
            </View>
        </View>
    )
}