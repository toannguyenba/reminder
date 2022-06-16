import React from "react";
import axios from "axios";

interface Task {
    taskNo: string,
    dateReminder: string,
    deleteFlag: number,
    description: string,
    status: number,
    title: string
}

var TaskModel = {
    taskNo: '',
    dateReminder: '',
    deleteFlag: 0,
    description: '',
    status: 0,
    title: ''
}

class TodoTable extends React.Component<any, {tasks: any}> {

    constructor(props : any) {
        super(props);
        // this.state = {tasks: new Array<Task>()};
        console.log('constructor');
    }

    componentDidMount() {
        axios.get('/tasks', {
            baseURL : 'http://localhost:8080/',
        }).then( response => {
            console.log(response.data);
            this.setState({tasks: response.data});
            console.log(this.state.tasks)
            console.log(this.state.tasks[0].title);
        }).catch(function(error : any) {
            console.log(error);
        });
        console.log(1);
    }

    render() {

        return (
            <div>
                <table className="table">
                    <thead>
                        <tr>
                            <th scope="col"><input type="checkbox"/></th>
                            <th scope="col">No</th>
                            <th scope="col">Tile</th>
                            <th scope="col">Description</th>
                            <th scope="col">Date Reminder</th>
                            <th scope="col">Status</th>
                        </tr>
                    </thead>
                    <tbody>
                        {this.state && this.state.tasks && this.state.tasks.length > 0 ? (
                            <tr>
                                <th scope="row"><input type="checkbox"/></th>
                                <td>1</td>
                                <td>{this.state.tasks[0].title}</td>
                                <td>{this.state.tasks[0].description}</td>
                                <td>{this.state.tasks[0].dateReminder}</td>
                                <td>
                                    <select value={this.state.tasks[0].status}>
                                        <option value="1">Not yet</option>
                                        <option value="2">Doing</option>
                                        <option value="3">Done</option>
                                    </select>
                                </td>
                            </tr>
                        ) : (<></>)}
                        <tr>
                            <th scope="row"><input type="checkbox"/></th>
                            <td>2</td>
                            <td>To do 2</td>
                            <td>Lorem Ipsum is ...</td>
                            <td>2022/07/05  10:00 AM</td>
                            <td>
                                <select>
                                    <option>Not yet</option>
                                    <option>Doing</option>
                                    <option>Done</option>
                                </select>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        );
    }
}

export default TodoTable;