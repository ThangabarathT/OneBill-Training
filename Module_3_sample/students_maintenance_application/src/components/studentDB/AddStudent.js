import React, { Component } from 'react';
import StudentAPI from '../api/StudentAPI';


export class AddStudent extends Component {

    constructor(props) {
        super(props)

        this.state = {
            sid: 0,
            name: '',
            email: '',
            totalMark: 0,
            q1: 0,
            q2: 0,
            q3: 0,
            q4: 0,
            tmark: false,
            qmark: false

        }
    }

    getSid = (e) => { this.setState({ sid: e.target.value }) }
    getName = (e) => { this.setState({ name: e.target.value }) }
    getEmail = (e) => { this.setState({ email: e.target.value }) }
    getTMark = (e) => { this.setState({ totalMark: e.target.value }) }
    getQ1 = (e) => { this.setState({ q1: e.target.value }) }
    getQ2 = (e) => { this.setState({ q2: e.target.value }) }
    getQ3 = (e) => { this.setState({ q3: e.target.value }) }
    getQ4 = (e) => { this.setState({ q4: e.target.value }) }


    getMarkType = (e) => {
        if (e.target.value === 'tmark') {
            this.setState({ tmark: true })
            this.setState({ qmark: false })
        } else {
            this.setState({ tmark: false })
            this.setState({ qmark: true })
        }
    }

    handleSubmit = (e) => {
        e.preventDefault();
        if ((this.state.sid !== 0) && (this.state.name !== '') && (this.state.email !== '')) {
            if (this.state.qmark) {
                StudentAPI.post('insert', {
                    userid: this.state.sid,
                    email: this.state.email,
                    name: this.state.name,
                    allmarks: {
                        q1: this.state.q1,
                        q2: this.state.q2,
                        q3: this.state.q3,
                        q4: this.state.q4
                    }
                })
                    .then(response => {
                        console.log(response.data);
                        if (response.data.status === 200) {
                            alert('Student Details Added Successfully');
                            this.props.history.push('/list');
                        }
                        else if (response.data.status === 404) {
                            alert('Could not Add.\nStudent id Already exists.\nPlease try again');
                        }
                        else {
                            alert('Could not Add.\nQuarterly Marks accept only between 0 - 10.\nPlease try again');
                        }
                    })
            }
            if (this.state.tmark) {
                StudentAPI.post('insert', {
                    userid: this.state.sid,
                    email: this.state.email,
                    marks: this.state.totalMark,
                    name: this.state.name
                })
                    .then(response => {
                        console.log(response.data);
                        if (response.data.status === 200) {
                            alert('Student Details Added Successfully');
                            this.props.history.push('/list');
                        }
                        else if (response.data.status === 404) {
                            alert('Could not Add.\nStudent id Already exists.\nPlease try again');
                        }
                        else {
                            alert('Could not Add.\nTotal Mark accept only between 0 - 10.\nPlease try again');
                        }
                    })
            }

        } else {
            alert('Please fill all details');
        }

    }

    render() {
        return (
            <div>
                <form onSubmit={this.handleSubmit}>
                    <input type="number" name="id" placeholder="Enter Student id" onChange={this.getSid} /><br /><br />
                    <input type="text" name="name" placeholder="Enter Student Name" onChange={this.getName} /><br /><br />
                    <input type="text" name="email" placeholder="Enter Student Email" onChange={this.getEmail} /><br /><br />

                    <input type="radio" name="mark" value="tmark" onChange={this.getMarkType} />Total Mark
                    <input type="radio" name="mark" value="qmark" onChange={this.getMarkType} />Quarterly Marks


                    {
                        this.state.tmark ?
                            <div>
                                <h3>Enter Total Mark</h3><br />
                                <input type="number" name="total" placeholder="Enter Average mark" onChange={this.getTMark} /><br /><br />
                                <button>Submit</button>
                            </div>
                            :
                            null
                    }

                    {this.state.qmark ?
                        <div>
                            <h3>Enter Quarterly Marks</h3><br />
                            <input type="number" name="q1" placeholder="First quarter mark" onChange={this.getQ1} /><br /><br />
                            <input type="number" name="q2" placeholder="Second quarter mark" onChange={this.getQ2} /><br /><br />
                            <input type="number" name="q3" placeholder="Third quarter mark" onChange={this.getQ3} /><br /><br />
                            <input type="number" name="q4" placeholder="Fourth quarter mark" onChange={this.getQ4} /><br /><br />
                            <button>Submit</button>
                        </div> : null
                    }
                </form>
            </div>
        )
    }
}

export default AddStudent
