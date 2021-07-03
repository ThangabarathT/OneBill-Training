import React, { Component } from 'react'
import StudentAPI from '../api/StudentAPI'

export class Students extends Component {

    constructor(props) {
        super(props)

        this.state = {
            students: []
        }
    }

    componentDidMount() {
        StudentAPI.get('getAll')
            .then(response => {
                console.log(response.data.students);
                this.setState({ students: response.data.students })
            })
    }


    render() {
        return (
            <div>
                <ul>
                    {this.state.students.map(student =>
                        <li key={student.userid}>{student.name}</li>)}
                </ul>
            </div>
        )
    }
}

export default Students
