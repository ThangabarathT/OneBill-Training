import React, { Component } from 'react';
import Facebook from '../facebook/Facebook';
import Google from '../google/Google';

export class Login extends Component {

    constructor(props) {
        super(props)

        this.state = {
            condition: ''
        }

    }

    changeCondition = (change) => { this.setState({ condition: change }) }

    render() {
        let display;
        // if (this.state.condition === '') {
        //     display = (
        //         <div>
        //             <Facebook change={this.changeCondition} /><br />
        //             <Google change={this.changeCondition} />
        //         </div>
        //     );
        // }
        // else if (this.state.condition === 'Facebook') {
        //     display = (
        //         <div>
        //             <Facebook />
        //         </div>
        //     );
        // }
        // else {
        //     display = (
        //         <div>
        //             <Google />
        //         </div>
        //     );
        // }
        return (
            <div>
                <Facebook /><br />
                <Google />
                {/* {display} */}
            </div>
        )
    }

}

export default Login
