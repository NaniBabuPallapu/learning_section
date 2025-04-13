const OnKeyDownExample = () => {
    const handleKeyDown = (event) => {
        // whatever you press key from keyboard, the key will be logged on console.
        console.log(`key pressed : ${event.key}`)
        if (event.key === "Enter") {
            alert("You Pressed Enter Button From Keyboard!");
        }
    }
    return (
        <>
            <input type="text" onKeyDown={handleKeyDown} placeholder="press keys here..." />
        </>
    )
}

export default OnKeyDownExample;