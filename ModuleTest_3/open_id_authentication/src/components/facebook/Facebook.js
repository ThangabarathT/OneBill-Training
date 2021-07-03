import React, { Component } from 'react';
import FacebookLogin from 'react-facebook-login';
import { Redirect } from 'react-router-dom';

export class Facebook extends Component {
    constructor(props) {
        super(props)

        this.state = {
            auth: false,
            email: '',
            name: '',
            picture: ''
        }
        this.responseFacebook = this.responseFacebook.bind(this);
    }

    componentClicked = () => {
        console.log('Clicked');

    }

    responseFacebook = (data) => {
        // this.props.change('Facebook');
        console.log(data);
        this.setState({
            auth: true,
            userID: data.userID,
            name: data.name,
            email: data.email,
            picture: data.picture.data.url
        });
    }

    render() {
        let facebookdata;
        if (this.state.auth) {
            facebookdata = (
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
                    Email: {this.state.email}
                </div>
            );
        }
        else {
            facebookdata = (
                <FacebookLogin
                    appId="3904602039636949"
                    fields="name,email,picture"
                    onClick={this.componentClicked}
                    callback={this.responseFacebook} />
            );
        }

        return (
            <div>
                {facebookdata}
            </div>
        )
    }
}

export default Facebook
