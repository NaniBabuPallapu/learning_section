import React, { useState, useMemo } from "react";

const UseMemoExample = () => {
    const [count, setCount] = useState(0);
    const [dark, setDark] = useState(false);

    //  Simulating an expensive calculation
    const slowFunction = (num) => {
        console.log("Calling slow function...");
        for (let i = 0; i < 1000000000; i++) { } // simulate delay
        return num * 2;
    };

    //  Only recalculate when count changes
    const doubleNumber = useMemo(() => {
        return slowFunction(count);
    }, [count]);

    const themeStyles = {
        backgroundColor: dark ? "#333" : "#FFF",
        color: dark ? "#FFF" : "#000",
        padding: "10px",
        marginTop: "20px",
    };

    return (
        <>
            <h3> <strong>Use Memo Example</strong> </h3>
            <h3>
                <input
                    type="number"
                    value={count}
                    onChange={(e) => setCount(e.target.value && parseInt(e.target.value))}
                />
                <button onClick={() => setDark((prevDark) => !prevDark)}>
                    Toggle Theme
                </button>

                <div style={themeStyles}>
                    <h3>Double of {count} is {doubleNumber}</h3>
                </div>
            </h3>

        </>
    );
};

export default UseMemoExample;
