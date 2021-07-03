import './App.css';
import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Link, Switch } from 'react-router-dom';
import Home from './components/studentDB/Home';
import Login from './components/studentDB/Login';
import Signup from './components/studentDB/Signup';
import Students from './components/studentDB/Students';
import AddStudent from './components/studentDB/AddStudent';
import RemoveStudent from './components/studentDB/RemoveStudent';
import Update from './components/studentDB/Update';
import Logout from './components/studentDB/Logout';


export class App extends Component {
  constructor(props) {
    super(props)

    this.state = {
      condition: sessionStorage.getItem('condition')
    }
  }

  render() {
    if (this.state.condition === null) {
      return (
        <Router>
          <div>
            <ul>
              <li><Link to="/">Home</Link></li>
              <li><Link to="/login">Login</Link></li>
            </ul>
          </div>

          <Switch>
            <Route exact path="/" component={Home} />
            {/* <Route path="/login" component={() => <Login callbackFromParents={this.changeCondition} />} /> */}
            <Route path="/signup" component={Signup} />
            <Route path="/login" component={Login} />
          </Switch>
        </Router>
      )
    }
    else if (this.state.condition === "true") {
      return (
        <Router>
          <div>
            <ul>
              <li><Link to="/">Home</Link></li>
              <li>
                <Link to="#">Actions</Link>
                <div>
                  <Link to="/list">All Students</Link>
                  <Link to="/add">Add Student</Link>
                  <Link to="/update">Update Student</Link>
                  <Link to="/remove">Remove Student</Link>
                </div>
              </li>
              <li><Link to="/logout">Logout</Link></li>
            </ul>
          </div>
          <Switch>
            <Route exact path="/" component={Home} />
            <Route path="/list" component={Students} />
            <Route path="/add" component={AddStudent} />
            <Route path="/update" component={Update} />
            <Route path="/remove" component={RemoveStudent} />
            <Route path="/logout" component={Logout} />
          </Switch>
        </Router>
      )
    }
    // return (
    //   <div className="App">
    //     <GetStudents />
    //   </div>
    // )
  }
}

export default App
