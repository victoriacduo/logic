import * as React from 'react';
import { View, Text, StyleSheet, TouchableOpacity } from 'react-native';
import { RadioButton } from 'react-native-paper';

export default function Quarta({ navigation }) {
        const [checked, setChecked] = React.useState('first');
    
        const options = [
            { value: 'Eros' },
            { value: 'Apolo' },
            { value: 'Baco' },
            { value: 'Cupido' }
        ]
    
        return(
            <View style={style.page}>
                <View style={style.container}>
                    <Text style={style.pergunta}>Qual era o deus romano do amor?</Text>
                    <View style={style.a}>
                        <RadioButton value="first" status= { checked === 'first' ? 'checked' : 'unchecked' } onPress={() => setChecked('first')}/>
                        <Text>Eros</Text>
                    </View>
                    <View style={style.b}>
                        <RadioButton value="second" status= { checked === 'second' ? 'checked' : 'unchecked' } onPress={() => setChecked('second')}/>
                        <Text>Apolo</Text>
                    </View>
                    <View style={style.c}>
                        <RadioButton value="third" status= { checked === 'third' ? 'checked' : 'unchecked' } onPress={() => setChecked('third')}/>
                        <Text>Baco</Text>
                    </View>
                    <View style={style.d}>
                        <RadioButton value="fourth" status= { checked === 'fourth' ? 'checked' : 'unchecked' } onPress={() => setChecked('fourth')}/>
                        <Text>Cupido</Text>
                    </View>
                    <View style={style.e}>
                        <TouchableOpacity style={style.botao} onPress={() => {navigation.navigate("Quinta")}}>
                            <Text style={{ fontWeight: 'bold', color: 'white' }}>PRÓXIMA</Text>
                        </TouchableOpacity>
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