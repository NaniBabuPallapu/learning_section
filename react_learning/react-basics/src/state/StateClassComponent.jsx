import { Component } from "react";

class StateClassComponent extends Component {
    constructor() {
        super();
        this.state = { count: 0, message: '' };
    }

    increaseCount = () => {
        this.setState({ count: this.state.count + 1 });
    }
    decreaseCount = () => {
        if (this.state.count > 0) {
            this.setState({ count: this.state.count - 1 });
        } else {
            this.setState({ message: "Can not decrease the count value less than 0" })
        }
    }
    render() {
        return (
            <>
                <div>Class Component Count : <b>{this.state.count}</b></div>
                {this.state.message && <p style={{ color: 'red' }}>{this.state.message}</p>}
                <button type="button" onClick={this.increaseCount}>Increase</button>
                <button type="button" onClick={this.decreaseCount}>Decrease</button>
            </>
        )
    }
}

export default StateClassComponent;