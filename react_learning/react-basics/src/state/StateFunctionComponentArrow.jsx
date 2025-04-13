import { useState } from "react"

export const StateFunctionComponentArrow = () => {
    const [message, setMessage] = useState('');
    const [count, setCount] = useState(0);

    const increaseCount = () => {
        setCount(count + 1);
    }
    const decreaseCount = () => {
        if (count > 0) {
            setCount(count - 1);
        } else {
            setMessage("Can not decrease the count value less than 0");
        }
    }
    return (
        <>
            <div>Arrow Functional Component Count : <b>{count}</b></div>
            {message && <p style={{ color: 'red' }}>{message}</p>}
            <button type="button" onClick={increaseCount}>Increase</button>
            <button type="button" onClick={decreaseCount}>Decrease</button>
        </>
    )
}

