import * as React from 'react';
import { View, Text, StyleSheet, TouchableOpacity } from 'react-native';
import { RadioButton } from 'react-native-paper';

export default function Primeira({ routes, navigation }) {
        const [checked, setChecked] = React.useState('first');
    
        const options = [
            { value: 'Pinguim' },
            { value: 'Galinha' },
            { value: 'Cegonha' },
            { value: 'Peru' }
        ]
    
        return(
            <View style={style.page}>
                <View style={style.container}>
                    <Text style={style.pergunta}>Qual dessas aves não voa?</Text>
                    <View style={style.a}>
                        <RadioButton style={style.optoins} value="first" status= { checked === 'first' ? 'checked' : 'unchecked' } onPress={() => setChecked('first')}/>
                        <Text>Pinguim</Text>
                    </View>
                    <View style={style.b}>
                        <RadioButton style={style.optoins} value="second" status= { checked === 'second' ? 'checked' : 'unchecked' } onPress={() => setChecked('second')}/>
                        <Text>Galinha</Text>
                    </View>
                    <View style={style.c}>
                        <RadioButton style={style.optoins} value="third" status= { checked === 'third' ? 'checked' : 'unchecked' } onPress={() => setChecked('third')}/>
                        <Text>Cegonha</Text>
                    </View>
                    <View style={style.d}>
                        <RadioButton style={style.optoins} value="fourth" status= { checked === 'fourth' ? 'checked' : 'unchecked' } onPress={() => setChecked('fourth')}/>
                        <Text>Peru</Text>
                    </View>
                    <View style={style.e}>
                        <TouchableOpacity style={style.botao} onPress={() => {navigation.navigate("Segunda")}}>
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
        fontSize: '18px',
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