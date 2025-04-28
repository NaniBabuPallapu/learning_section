const OnMouseOverExample = () => {

    const handleMouseOver = () => {
        alert("Mouse is over me !");
    }
    return (
        <>
            <h3 style={({ border: '1px solid black', marginLeft: '40%', marginRight: '40%', padding: '20px', fontWeight: 'bold', fontSize: '20px' })} onMouseOver={handleMouseOver}>Hover over this text.</h3>
        </>
    )
}

export default OnMouseOverExample;