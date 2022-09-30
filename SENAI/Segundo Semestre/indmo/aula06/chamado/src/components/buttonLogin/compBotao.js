import {TouchableOpacity, Text} from 'react-native';

import style from './styleBotao';

export default function BotaoLogin(props) {
    const { value, onPress } = props;

    return(
        <TouchableOpacity style={style.botao} onPress={()=>{onPress()}}>
            <Text style={{ fontWeight: 'bold', color: 'white' }}>{value}</Text>
        </TouchableOpacity>
    )
}