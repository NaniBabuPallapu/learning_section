import { useState } from "react";

function StateFunctionalComponent() {
    const [count, setCount] = useState(0);
    const [message, setMessage] = useState('');

    function increase() {
        setCount(count + 1);
    }

    function decrease() {
        if (count > 0) {
            setCount(count - 1);
        } else {
            setMessage("Can not decrease the count value less than 0");
        }
    }

    return (
        <>
            <div> Functional Component Count : <b>{count}</b></div>
            {message && <p style={{ color: 'red' }}>{message}</p>}
            <button type="button" onClick={increase}>Increase</button>
            <button type="button" onClick={decrease}>Decrease</button>
        </>
    )
}

export default StateFunctionalComponent;