import { ScrollView, View, Text, TouchableOpacity, Image } from 'react-native';

import style from './style';

export default function Home({ navigation }) {
    const data = [
        {
            "id":1,
            "tipo":2,
            "nome":"Escola",
            "horario":"07:30 - 11:30"
        },
        {
            "id":2,
            "tipo":1,
            "nome":"Consulta Médica",
            "horario":"13:00 - 13:40"
        },
        {
            "id":3,
            "tipo":3,
            "nome":"Ir ao mercado",
            "horario":"16:30 - 17:00"
        },
        {
            "id":4,
            "tipo":4,
            "info": {

            }
        }
    ]

    return(
        <ScrollView style={style.container}>
            {
                data.map((item, index) => {
                    return(
                        <TouchableOpacity key={index} onPress={() => navigation.navigate("Detalhes", {item})}>
                            
                        </TouchableOpacity>
                    )
                })
            }            
        </ScrollView>
    )
}