import React, { Component } from 'react'
import StudentAPI from '../api/StudentAPI'

export class RemoveStudent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            sid: 0
        }
    }

    getSid = (e) => { this.setState({ sid: e.target.value }) }

    handleSubmit = (e) => {
        e.preventDefault();
        if (this.state.sid > 0) {
            const message = window.confirm(`Student id : ${this.state.sid}\nAre you sure you want to delete?`);
            if (message) {
                StudentAPI.delete(`remove/${this.state.sid}`)
                    .then(response => {
                        console.log(response.data);
                        if (response.data.status === 200) {
                            alert(`Student id : ${this.state.sid}\nStudent Details deleted successfully`);
                            this.props.history.push('/list');
                        }
                        else if (response.data.status === 404) {
                            alert('Student Data not found.\nPlease try again');
                        }
                    })
            }

        }
        else {
            alert('Please enter valid student id');
        }
    }

    render() {
        return (
            <div>
                <form onSubmit={this.handleSubmit}>
                    <input type="number" name="id" placeholder="Enter student id" onChange={this.getSid} /><br /><br />
                    <button>Delete</button>
                </form>
            </div>
        )
    }
}

export default RemoveStudent
