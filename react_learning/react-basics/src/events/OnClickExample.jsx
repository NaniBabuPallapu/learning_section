const OnClickExample = () => {
    const handleClick = () => {
        alert(" I am clicked! ")
    }
    return (
        <>
            <button type="button" onClick={handleClick}>Click Me</button>
        </>
    )
}

export default OnClickExample;