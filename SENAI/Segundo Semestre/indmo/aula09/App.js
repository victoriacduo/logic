import * as React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

const Stack = createNativeStackNavigator();

import PrimeiraTela from './src/pages/aQuestion/index';
import SegundaTela from './src/pages/bQuestion/index';

export default function App(){
  return(
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="Primeira" component={PrimeiraTela}/>
        <Stack.Screen name="Segunda" component={SegundaTela}/>
      </Stack.Navigator>
    </NavigationContainer>
  );
}