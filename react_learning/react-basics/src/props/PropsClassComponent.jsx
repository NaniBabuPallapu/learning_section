import { Component } from "react";

class PropsClassComponent extends Component {
    render() {
        return (
            <>
                <h3>I am currently working in {this.props.companyName}. My current salary is {this.props.salary}</h3>
            </>
        )
    }
}
export default PropsClassComponent;