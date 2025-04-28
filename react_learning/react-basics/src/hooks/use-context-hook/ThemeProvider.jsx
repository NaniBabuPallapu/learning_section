import { useState } from "react";
import ThemeContext from "./ThemeContext";

// step - 2. Define Provider Component
const ThemeProvider = ({ children }) => {
    const [theme, setTheme] = useState("light");

    const toggleTheme = () => {
        setTheme(
            (previouseTheme) => (previouseTheme === "light" ? "dark" : "light")
        );
    }
    return (
        <>
            <ThemeContext.Provider value={{ theme, toggleTheme }}>
                {children}
            </ThemeContext.Provider>
        </>
    )
}

export default ThemeProvider;