/*

const PropsFunctionalComponentArrow = (props) => (
    <>
    I am working as {props.technology} Full Stack Developer. I have {props.years} of experience.
    </>
);

*/
const PropsFunctionalComponentArrow = (props) => {
    const tech = props.technology;
    const experience = props.years
    return (
        <>
            I am working as {tech} Full Stack Developer. I have {experience} years of experience.
        </>
    )
};

export default PropsFunctionalComponentArrow;