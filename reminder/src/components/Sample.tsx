import React from "react";


class Sample extends React.Component<any, any> {

    constructor(props: any) {
        super(props);
    }

    render() {
        console.log("render sample");
        return (
            <div>
                Sample msg: {this.props.msg}
            </div>
        );
    }
}

export default Sample;