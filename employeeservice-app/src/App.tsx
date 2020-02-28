import React from 'react';
import './App.css';
import { Provider } from 'react-redux';
import { store } from './Store';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import { RegisterComponent } from './components/register-component/RegisterComponent';
import { LoginComponent } from './components/login-components/LoginComponent';

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
