import React, { useCallback, useState } from "react";

const Child = React.memo(({ onClick }) => {
    console.log("Child Component Renderd...");
    return (
        <>
            <button type="button" onClick={onClick}>Increase(+)</button>
        </>
    );
});

const UseCallBackExample = () => {
    const [count, setCount] = useState(0);


    const increament = useCallback(() => {
        // ✅ We are using useCallback to prevent the Child component from re-rendering unnecessarily.
        // 🔄 If you remove useCallback, the Child component will re-render on every parent render because a new function reference is created each time.
        setCount((prev) => prev + 1);
    }, []);
    
    return (
        <>
            <h3><strong>UseCallBack Example</strong> </h3>
            <h3>Count : {count}</h3>
            <Child onClick={increament} />
        </>
    )
}

export default UseCallBackExample;