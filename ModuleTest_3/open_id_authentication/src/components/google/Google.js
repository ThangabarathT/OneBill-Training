import React, { Component } from 'react';
import GoogleLogin from 'react-google-login';

export class Google extends Component {
    constructor(props) {
        super(props)

        this.state = {
            auth: false,
            email: '',
            firstName: '',
            lastName: '',
            name: '',
            picture: ''
        }
    }

    successResponse = (res) => {
        // this.props.change('Google');
        console.log('Login success', res);
        this.setState({
            auth: true,
            email: res.profileObj.email,
            firstName: res.profileObj.familyName,
            lastName: res.profileObj.givenName,
            name: res.profileObj.name,
            picture: res.profileObj.imageUrl
        })
    }

    failureResponse = (res) => {
        console.log('Login failure', res);
    }

    render() {
        let clientId = "728410790910-vpj2umn0qv651ne67hbtpn7ddlo3nahp.apps.googleusercontent.com";
        let googleData;

        if (this.state.auth) {
            googleData = (
                <div
                    style={{
                        width: "500px",
                        margin: "auto",
                        background: "white",
                        padding: "20px",
                        boxShadow: "0 0 4px gray"
                    }}>

                    <img src={this.state.picture} alt={this.state.name} />
                    <h2>Welcome {this.state.name}</h2>
                    Email: {this.state.email}<br />
                    First Name: {this.state.firstName}<br />
                    Last Name: {this.state.lastName}<br />
                </div>
            );


        } else {
            googleData = (
                <div>
                    <GoogleLogin
                        clientId={clientId}
                        buttonText="Login with Google"
                        onSuccess={this.successResponse}
                        onFailure={this.failureResponse}
                        cookiePolicy={'single_host_origin'}
                    />
                </div>
            );
        }

        return (
            <div>
                {googleData}
            </div>
        )
    }
}

export default Google
