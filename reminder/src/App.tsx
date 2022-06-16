import React from 'react';
import logo from './logo.svg';
import './App.css';
import TodoTable from './components/TodoTable';
import SearchBar from './components/SearchBar';
import Pagination from './components/Pagination';

function App() {
  return (
    <div className="App">
      <h1>TO DO</h1>
      <SearchBar/>
      <TodoTable/>
      <Pagination/>
    </div>
  );
}

export default App;
