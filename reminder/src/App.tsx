import React from 'react';
import logo from './logo.svg';
import './App.css';
import Clock from './components/Clock';
import LineItem from './components/LineItem';

function App() {
  return (
    <div className="App">
      <Clock/>
      <LineItem name="Default name"/>
    </div>
  );
}

export default App;
