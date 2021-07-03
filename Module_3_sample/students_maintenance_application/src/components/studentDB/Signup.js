import React, { Component } from 'react'
import AdminAPI from '../api/AdminAPI';
import { Link } from 'react-router-dom';

export class Signup extends Component {

    constructor(props) {
        super(props)

        this.state = {
            username: '',
            password: '',
            email: ''
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

    getEmail = (e) => {
        e.preventDefault();
        this.setState({ email: e.target.value })
    }

    handleSubmit = (e) => {
        e.preventDefault();
        AdminAPI.post('signup', {
            userName: this.state.username,
            password: this.state.password,
            email: this.state.email
        })
            .then(response => {
                console.log(response.data);
                if (response.data.status === 200) {
                    alert('Account create successfully\nPlease Login');
                    this.props.history.push('/login');
                } else if (response.data.status === 405) {
                    alert('Username or Email already exists.\nPlease try again ');
                } else {
                    alert('Something went wrong');
                }
            })
    }


    render() {
        return (
            <div>
                <h2>Signup</h2>
                <form onSubmit={this.handleSubmit}>
                    <input type="text" placeholder="Enter Username" onChange={this.getUserName} /><br /><br />
                    <input type="text" placeholder="Enter Email" onChange={this.getEmail} /><br /><br />
                    <input type="password" placeholder="Enter Password" onChange={this.getPassword} /><br /><br />
                    <button>Sign up</button><br /><br />
                </form>
                <h3>Already have an account?<Link to='/login'>Login</Link></h3>
            </div>
        )


    }
}

export default Signup
