import { useRef, useEffect, useState } from "react"

// const UseRefExample = () => {
//     const inputRef = useRef(null);

//     const handleFocus = () => {
//         inputRef.current.focus();
//     }
//     return (
//         <>
//             <h3>UseRef Example</h3>
//             <div>
//                 <input type="text" ref={inputRef} />
//                 <button type="button" onClick={handleFocus}>Focus Input</button>
//             </div>
//         </>
//     )
// }

// const UseRefExample = () => {
//     const inputRef = useRef(0);

//     useEffect(() => {
//         const interval = setInterval(() => {
//             inputRef.current = inputRef.current + 1;
//             console.log(`timer : ${inputRef.current}`) 
//             //Refs don’t cause UI updates like useState does.
//             // React doesn’t re-render when a ref (useRef) changes.

//         }, 500)
//         return () => clearInterval(interval);
//     }, []);
//     return (
//         <>
//             <h3>UseRef Example</h3> 
//         </>
//     )
// }


const UseRefExample = () => {
  const [count, setCount] = useState(0);
  const prevCount = useRef();

  useEffect(() => {
    prevCount.current = count;
  }, [count]);

  return (
    <>
      <h3><strong>UseRef Example</strong></h3>
      <div>
        <p>Current: {count}</p>
        <p>Previous: {prevCount.current}</p>
        <button onClick={() => setCount(c => c + 1)}>Increase</button>
      </div>
    </>
  );
}



export default UseRefExample