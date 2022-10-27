import * as React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

const Stack = createNativeStackNavigator();

import Primeira from './src/pages/telas/a';
import Segunda from './src/pages/telas/b';

export default function App(){
  return(
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="Um" component={Primeira}/>
        <Stack.Screen name="Dois" component={Segunda}/>
      </Stack.Navigator>
    </NavigationContainer>
  );
}