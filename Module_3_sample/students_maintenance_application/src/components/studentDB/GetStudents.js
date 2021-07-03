import React, { Component } from 'react';
import Axios from 'axios';
import AdminAPI from '../api/AdminAPI';

export class GetStudents extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id: 0,
            getdata: []
        }
    }

    getId = (e) => {
        this.setState({
            id: e.target.value
        })
    }

    getStudent = (e) => {
        e.preventDefault();
        AdminAPI.get('get')
            .then(res => {
                console.log(res.data);
                this.setState({
                    getdata: res.data
                })
            })
    }

    render() {

        return (
            <div>
                <form onSubmit={this.getStudent}>
                    <input type='number' placeholder='Student ID' onChange={this.getId} />
                    <button>Submit</button>
                </form>
            </div>
        )
    }
}

export default GetStudents
