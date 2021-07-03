import React, { Component } from 'react'
import StudentAPI from '../api/StudentAPI'

export class Update extends Component {

    constructor(props) {
        super(props)

        this.state = {
            sid: 0,
            name: '',
            email: '',
            isFound: false
        }
    }

    handleChange = (e) => {
        this.setState({ sid: e.target.value })
    }

    handleSearch = (e) => {
        e.preventDefault();
        if (this.state.sid > 0) {
            StudentAPI.get(`search/${this.state.sid}`)
                .then(response => {
                    console.log(response.data);
                    if (response.data.status === 200) {
                        this.setState({ isFound: true });
                        this.setState({ name: response.data.student.name })
                        this.setState({ email: response.data.student.email })
                    } else if (response.data.status === 404) {
                        alert('Student Data not found.\nPlease try again');
                    }
                })
        } else {
            alert('Please enter valid student id');
        }
    }
    getName = (e) => { this.setState({ name: e.target.value }) }
    getEmail = (e) => { this.setState({ email: e.target.value }) }

    handleSubmit = (e) => {
        e.preventDefault();
        StudentAPI.put('update', {
            userid: this.state.sid,
            email: this.state.email,
            name: this.state.name
        })
            .then(res => {
                console.log(res.data);
                if (res.data.status === 200) {
                    alert(`Student id : ${this.state.sid}\nStudent details updated successfully`);
                    this.props.history.push('/list');
                }
                else if (res.data.status === 404) {
                    alert('Student Data not found.\nPlease try again');
                }
                else {
                    alert('Please enter valid student name and email');
                }
            })
    }

    render() {

        return (
            <div>
                <h3>Update Student</h3>
                <form onSubmit={this.handleSubmit}>
                    <input type="number" name="id" placeholder="Enter Student id" onChange={this.handleChange} /><br /><br />
                    <button onClick={this.handleSearch}>Search</button>
                    {this.state.isFound ? <div>
                        <label>Student Name</label>
                        <input type="text" name="name" value={this.state.name} onChange={this.getName} /><br /><br />
                        <label>Student Email</label>
                        <input type="text" name="email" value={this.state.email} onChange={this.getEmail} /><br /><br />
                        <button type="submit" style={{ display: "block" }}>Update</button>
                    </div> : null}
                </form>
            </div>
        )
    }
}

export default Update
