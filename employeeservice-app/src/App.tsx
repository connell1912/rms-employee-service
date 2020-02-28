import { Menu, MenuItem } from '@material-ui/core';
import Button from '@material-ui/core/Button';
import React from 'react';
import { Provider } from 'react-redux';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import './App.css';
import LoginComponent from './components/login-components/LoginContainer';
import { RegisterComponent } from './components/register-component/RegisterComponent';
import { store } from './Store';

const App: React.FC = () => {
  return (
    <div>
      <Provider store={store}>
        <Router>
          <Switch>
            <Route path="/login" component={LoginComponent} />
            <Route path="/register" component={RegisterComponent} />
          </Switch>
        </Router>
      </Provider>
    </div>
  )
}

export default App;
