/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View
} from 'react-native';
import RNAnotherWebView from 'RNAnotherWebViewManager'

export default class example extends Component {
  render() {
    return (
      <View style={{ flex: 1 }}>
        <RNAnotherWebView acceptThirdPartyCookies />
      </View>
    );
  }
}

AppRegistry.registerComponent('example', () => example);
