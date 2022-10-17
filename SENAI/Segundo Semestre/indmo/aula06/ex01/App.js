import * as React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

const Stack = createNativeStackNavigator();

import TelaComp from './src/pages/Home/index.js';
// import TelaDetails from './src/pages/Detalhes/index.js';

export default function App() {
  return(
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="Compromissos" component={TelaComp}/>
        {/* <Stack.Screen name="Detalhes" component={TelaDetails}/> */}
      </Stack.Navigator>
    </NavigationContainer>
  );
}