import React from "react";
import LineItem from "./LineItem";
import Sample from "./Sample";

interface Time{
    date: Date;
    message: string;
}

class Clock extends React.Component<Object, Time> {
    constructor(props: any) {
        console.log("clock constructor called");
        super(props);
        this.state = { date: new Date() , message: ''};
        this.handleLineItemChange = this.handleLineItemChange.bind(this);
    }


    componentDidMount() {
        setInterval(
            () => this.tick(),
            1000
        );
    }

    tick() {
        this.setState({
            date: new Date()
        });
    }

    handleLineItemChange(e: any) {
        console.log(this);
        console.log('changeMsg called');
        this.setState({message: e.target.value});
    }

    render() {
        console.log("render clock");
        return (
            <div>
                <h1>Hello, world!</h1>
                <h2>It is {this.state.date.toLocaleTimeString()}.</h2>
                <div>
                    <h2>Clock surround Line item</h2>
                    message <input name="message" value={this.state.message}></input>
                    <LineItem onLineItemChange={this.handleLineItemChange} name={this.state.message} />
                    <Sample msg={this.state.message}/>
                </div>
            </div>
        );
    }
}

export default Clock;