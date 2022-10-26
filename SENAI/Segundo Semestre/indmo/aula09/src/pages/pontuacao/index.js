import * as React from 'react';
import { View, Text, StyleSheet, TouchableOpacity } from 'react-native';
import { RadioButton } from 'react-native-paper';

export default function Pontuação({ navigation }) {
        return(
            <View style={style.page}>
                <View style={style.container}>
                    <Text style={style.result}>PONTOS:</Text>
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
        alignItems: 'center',
        justifyContent: 'center',
        padding: '40px',
        width: '300px',
        height: '350px',
        backgroundColor: 'white',
        borderRadius: '20px',
    },
    result: {
        fontSize: '16px',
        fontWeight: 'bold'
    },
})