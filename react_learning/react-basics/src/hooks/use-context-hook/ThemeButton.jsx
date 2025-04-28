import { useContext } from "react";
import ThemeContext from "./ThemeContext";

// step - 3. Use Context in a Component
const ThemeButton = () => {
    const { theme, toggleTheme } = useContext(ThemeContext);
    return (
        <>
            <h3>Current Theme : {theme}</h3>
            <button type="button" onClick={toggleTheme}>Change Theme</button>
        </>
    )
}
export default ThemeButton;