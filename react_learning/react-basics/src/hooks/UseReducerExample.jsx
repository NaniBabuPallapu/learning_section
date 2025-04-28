import { useReducer } from "react";

// Step 1: Define initial state
const initialState = { count: 0 };

// Step 2: Define reducer function
const reducerFunction = (state, action) => {
    switch (action.type) {
        case 'INCREMENT':
            return { count: state.count + 1 };
        case 'DECREMENT':
            return { count: state.count - 1 };
        case 'RESET':
            return { count: 0 };
        default:
            return state;
    }
}

const UseReducerExample = () => {

    // Step 3: useReducer hook
    const [state, dispatch] = useReducer(reducerFunction, initialState);

    return (
        <>
            <h3> <strong>Use Reducer Example</strong> </h3>
            <h3>Count : {state.count}</h3>
            <button type="button" onClick={() => { dispatch({ type: 'INCREMENT' }) }}>+</button>
            <button type="button" onClick={() => { dispatch({ type: 'DECREMENT' }) }}>-</button>
            <button type="button" onClick={() => { dispatch({ type: 'RESET' }) }}>Reset</button>
        </>
    )
}

export default UseReducerExample;