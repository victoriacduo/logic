import * as React from 'react';
import { View, Text } from 'react-native';
import { RadioButton } from 'react-native-paper';

export default function quinta({ routes, navigation }){
    const componente = () => {
        const [checked, setChecked] = React.useState('first');
    
        const options = [
            { value: 'Bobby' },
            { value: 'Daffy' },
            { value: 'Wile' },
            { value: 'Woodstock' }
        ]
    
        return(
            <View style={style.container}>
                <Text style={style.pergunta}>Como se chama o passarinho amarelo amigo de Snoopy?</Text>
                <RadioButton value="first" status= { checked === 'first' ? 'checked' : 'unchecked' } onPress={() => setChecked('first')}/>
                <RadioButton value="second" status= { checked === 'second' ? 'checked' : 'unchecked' } onPress={() => setChecked('second')}/>
                <RadioButton value="third" status= { checked === 'third' ? 'checked' : 'unchecked' } onPress={() => setChecked('third')}/>
                <RadioButton value="fourth" status= { checked === 'fourth' ? 'checked' : 'unchecked' } onPress={() => setChecked('fourth')}/>
            </View>
        )
    }
}