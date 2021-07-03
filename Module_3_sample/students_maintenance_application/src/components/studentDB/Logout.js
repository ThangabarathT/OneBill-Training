import React, { Component } from 'react';
import { Redirect } from 'react-router-dom';

export class Logout extends Component {

    render() {
        if (window.confirm('Are you sure you want to log out ?')) {
            sessionStorage.removeItem('condition');
            window.location.reload(this.props.history.push('/'));
            return null
        } else {
            return <Redirect to='/' />
        }
    }
}

export default Logout
