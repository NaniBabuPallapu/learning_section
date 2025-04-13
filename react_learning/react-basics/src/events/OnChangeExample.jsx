import { useState } from "react";

const OnChangeExample = () => {
    const [name, setName] = useState('');

    const handleNameUsingOnChange = (event) => {
        setName(event.target.value);
    }

    return (
        <>
            <h3>
                <label>Enter Name : </label>
                <input type="text" placeholder="enter your name" onChange={handleNameUsingOnChange} />
            </h3>
            <h3>
                <label>Entered Name : </label>
                {name}
            </h3>
        </>
    )
}

export default OnChangeExample;