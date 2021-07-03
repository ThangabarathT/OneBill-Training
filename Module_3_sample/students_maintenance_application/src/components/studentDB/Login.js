import React, { Component } from 'react'
import AdminAPI from '../api/AdminAPI';
import { Link } from 'react-router-dom';

export class Login extends Component {

    constructor(props) {
        super(props)

        this.state = {
            username: '',
            password: '',
            isLoggedIn: false
        }
    }

    getUserName = (e) => {
        e.preventDefault();
        this.setState({ username: e.target.value })
    }

    getPassword = (e) => {
        e.preventDefault();
        this.setState({ password: e.target.value })
    }

    handleSubmit = (e) => {
        e.preventDefault();

        AdminAPI.post('login', {
            userName: this.state.username,
            password: this.state.password
        })
            .then(response => {
                console.log(response.data);
                if (response.data.status === 200) {
                    alert('Successfully Login');
                    sessionStorage.setItem('condition', true);
                    window.location.reload(this.props.history.push('/'));
                } else if (response.data.status === 405) {
                    alert('Please contact your Admin');
                } else {
                    alert('Invalid Username or Password.\nPlease try again');
                }
            })
    }


    render() {
        return (
            <div>
                <h2>Login</h2>
                <form onSubmit={this.handleSubmit}>
                    <input type="text" placeholder="Enter Username" onChange={this.getUserName} /><br /><br />
                    <input type="password" placeholder="Enter Password" onChange={this.getPassword} /><br /><br />
                    <button>Login</button><br /><br />
                </form>
                <h3>Not a member?<Link to='/signup'>Signup Now</Link></h3>
            </div>
        )

    }
}

export default Login
