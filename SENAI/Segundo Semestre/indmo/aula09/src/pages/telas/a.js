import { useState } from 'react';
import { View, Text, Button, StyleSheet, TouchableOpacity } from 'react-native';
import { RadioButton } from 'react-native-paper';
import AsyncStorage from '@react-native-async-storage/async-storage';


export default function Um({ navigation }) {
    const [checked, setChecked] = useState("first");

    const storeData = async (value) => {
        try {
            await AsyncStorage.setItem('resp', value);
        } catch (e) {
            console.log(e);
        }
    }

    return(
        <View style={style.page}>
            <View style={style.container}>
                <Text style={style.pergunta}>De que são constituídos os diamantes?</Text>
                <View style={style.a}>
                    <RadioButton value="first" status= { checked === 'first' ? 'checked' : 'unchecked' } onPress={() => setChecked('first')}/>
                    <Text>Carbono</Text>
                </View>
                <View style={style.b}>
                    <RadioButton value="second" status= { checked === 'second' ? 'checked' : 'unchecked' } onPress={() => setChecked('second')}/>
                    <Text>Grafite</Text>
                </View>
                <View style={style.c}>
                    <RadioButton value="third" status= { checked === 'third' ? 'checked' : 'unchecked' } onPress={() => setChecked('third')}/>
                    <Text>Ósmio</Text>
                </View>
                <View style={style.d}>
                    <RadioButton value="fourth" status= { checked === 'fourth' ? 'checked' : 'unchecked' } onPress={() => setChecked('fourth')}/>
                    <Text>Bóhrio</Text>
                </View>
                <View style={style.e}>
                    <Button style={style.botao} title="Proximo" onPress={() => {
                        let pontos = 0;
                        if(checked === 'first') pontos = 1;

                        storeData(checked);

                        navigation.navigate("Dois", {"score":pontos});
                    }}/>
                </View>
            </View>
        </View>
    )

}

const style = StyleSheet.create({
    page: {
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center',
    },
    container: {
        display: 'flex',
        flexDirection: 'column',
        justifyContent: 'center',
        padding: '40px',
        width: '300px',
        height: '350px',
        backgroundColor: 'white',
        borderRadius: '20px',
    },
    pergunta: {
        fontSize: '16px',
        fontWeight: 'bold'
    },
    a:{
        display: 'flex',
        flexDirection: 'row',
        alignItems: 'center',
        width: '100px',
        height: '40px'
    },
    b:{
        display: 'flex',
        flexDirection: 'row',
        alignItems: 'center',
        width: '100px',
        height: '40px'
    },
    c:{
        display: 'flex',
        flexDirection: 'row',
        alignItems: 'center',
        width: '100px',
        height: '40px'
    },
    d:{
        display: 'flex',
        flexDirection: 'row',
        alignItems: 'center',
        width: '100px',
        height: '40px'
    },
    e:{
        alignItems: 'center'
    },
    botao:{
        alignItems: 'center',
        justifyContent: 'center',
        width: '90px',
        height: '35px',
        backgroundColor: 'purple',
        borderRadius: '8px'
    }
})