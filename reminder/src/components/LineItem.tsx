import React from "react";

interface Student {
    name: string
}

class LineItem extends React.Component<any, Student> {

    constructor(props: any) {
        super(props);
        this.state = {name: this.props.name};
        this.handleChange = this.handleChange.bind(this);
    }

    handleChange(e: any) {
        console.log(this);
        this.setState({name: e.target.value});
        this.props.onLineItemChange(e);
    }

    render() {
        return (
            <div>
                <p>Line item component: {this.state.name}</p>
                <input name="testinput" value={this.state.name} onChange={this.handleChange}/>
            </div>
        );
    }
}

export default LineItem;