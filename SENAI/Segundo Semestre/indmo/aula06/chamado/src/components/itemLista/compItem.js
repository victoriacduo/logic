import { View, Text } from 'react-native';

import style from './styleItem';

export default function itensCad(props){
    const { value1, value2 } = props;

    return(
        <View style={style.container}>
            <Text>{value1}</Text>
            <Text>{value2}</Text>
        </View>
    )
}