import { useState } from 'react'
import { View, Image, TextInput } from 'react-native';
import BotaoLogin from '../../components/buttonLogin/compBotao';

import style from './style';

export default function Login ({ navigation }) {
    const [email, setEmail] = useState('')
    const [senha, setSenha] = useState('')

    const users = [
        {
            "id": 1,
            "email": "user01@empresa.com",
            "senha": "teste1234",
        },
        {
            "id": 2,
            "email": "user02@empresa.com",
            "senha": "1234teste",
        }
    ]

    const irHome = () => {
        let valid = false
        users.forEach(item => {
            if(email == item.email && senha == item.senha){
                valid = true
            }
        })

        if(valid){
            navigation.navigate('Home')
        }
    }

    return(
        <View style={style.container}>
            <Image style={style.icone} source={{uri: 'https://github.com/wellifabio/senai2022/blob/master/2des/indmo/aula06/assets/logo.png?raw=true'}}/>
            <View style={style.viewInputs}>
                <TextInput style={style.inputs} onChangeText={(val) => setEmail(val)} placeholder="E-Mail"/>
                <TextInput style={style.inputs} onChangeText={(val) => setSenha(val)} placeholder="Senha"/>
                <BotaoLogin value="Login" onPress={irHome}/>
            </View>
        </View>
    )
}