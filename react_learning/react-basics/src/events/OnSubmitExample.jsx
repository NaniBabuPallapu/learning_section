import { useState } from "react";

const OnSubmitExample = () => {
    const [email, setEmail] = useState('');

    const handleEmail = (event) => {
        setEmail(event.target.value);
    }

    const handleSubmit = (event) => {
        event.preventDefault(); // Make The page does not reload and You’ll not lose all entered data and state
        alert(`Submitted Email : ${email}`);
    }

    return (
        <>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>Enter Email : </label>
                    <input type="email" value={email} placeholder="enter email address" onChange={handleEmail} />

                    {/* using anonymous function inline for simple one liners */}
                    {/* <input type="email" value={email} placeholder="enter email address" onChange={(e) => { setEmail(e.target.value) }} /> */}
                </div>
                <button className="btn btn-primary" type="submit">Submit</button>
            </form>
        </>
    )
}

export default OnSubmitExample;