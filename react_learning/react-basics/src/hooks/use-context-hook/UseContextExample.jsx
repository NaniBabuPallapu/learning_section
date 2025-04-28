// UseContextExample.jsx
import ThemeProvider from "./ThemeProvider";
import ThemeButton from "./ThemeButton";
import ThemeContext from "./ThemeContext";
import { useContext } from "react";

const ThemedApp = () => {
    const { theme } = useContext(ThemeContext);

    const appStyles = {
        backgroundColor: theme === "light" ? "#ffffff" : "#333333",
        color: theme === "light" ? "#000000" : "#ffffff",
        display: "flex",
        flexDirection: "column",
        alignItems: "center",
        justifyContent: "center",
        transition: "all 0.3s ease",
        innerWidth: "50%",
        outerWidth: "50%",
    };

    return (
        <div style={{ ...appStyles }}>
            <h3 style={{ color: 'darkgreen', fontWeight: 'bold', fontSize: '16px' }}>Switcher App</h3>
            <ThemeButton />
        </div>
    );
};

const UseContextExample = () => {
    return (
        <ThemeProvider>
            <ThemedApp />
        </ThemeProvider>
    );
};

export default UseContextExample;
