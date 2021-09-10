import Dashboard from 'components/pages/Dashboard';
import Home from 'components/pages/Home';
import {BrowserRouter,Route} from 'react-router-dom';

const Routes = () =>{
    return (
        <BrowserRouter>
            <switch>
                <Route path="/" exact>
                    <Home/>
                </Route>
                <Route path="/dashboard">
                    <Dashboard/>
                </Route>
            </switch>
        </BrowserRouter>
    );
  }
  
  export default Routes;
  