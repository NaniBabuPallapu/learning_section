import { useState } from "react"

const UseStateExample = () => {
    const [count, setCount] = useState(0);

    const increament = () => {
        setCount(count + 1);
    }
    const decrease = () => {
        setCount(count - 1);
    }
    return (
        <>
        <h3><strong>Use State Example </strong> </h3>
            <div>Count : {count}</div>
            <button type="button" onClick={increament}>Increase Count (+)</button>
            <button type="button" onClick={decrease}>Decrease Count (-)</button>
        </>
    )
}

export default UseStateExample;