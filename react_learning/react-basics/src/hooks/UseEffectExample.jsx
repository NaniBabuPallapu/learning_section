// import { useState, useEffect } from "react"
// const dummyUsers = [
//     { id: 1, name: 'Nani Babu', role: 'Developer' },
//     { id: 2, name: 'Teja Reddy', role: 'Tester' },
//     { id: 3, name: 'Kiran Kumar', role: 'Manager' },
//     { id: 4, name: 'Deepika Sharma', role: 'Designer' },
//     { id: 5, name: 'Arjun Das', role: 'DevOps' }
// ];


// const UseEffectExample = () => {

//     const [users, setUsers] = useState([]);
//     const [loading, setLoading] = useState(true);
//     const [error, setError] = useState(null);
//     const [searchedUser, setSearchUser] = useState('');

//     useEffect(() => {
//         // Cleaner useEffect now, just sets the data
//         const timer = setTimeout(() => {
//             try {
//                 setUsers(dummyUsers);
//                 setLoading(false)
//             } catch (error) {
//                 setError("Something Went Wrong !")
//                 setLoading(false)
//             }
//         }, 1500);
//         return () => {
//             clearTimeout(timer);
//         }

//     }, []);

//     const handleOnChange = (event) => {
//         setSearchUser(event.target.value);
//     }

//     const filteredUsers = users.filter(user =>
//         user.name.includes(searchedUser)
//     );

//     return (
//         <>
//             <div style={{ padding: '20px' }}>
//                 <h2>👤 Filter Users by Name</h2>
//                 <input type="text"
//                     placeholder="search user"
//                     value={searchedUser}
//                     onChange={handleOnChange}
//                     style={{ padding: '10px', width: '60%', marginBottom: '15px' }}
//                 />
//                 {loading && <p>Loading Users ...... </p>}
//                 {error && <p style={({ color: 'red' })}>{error}</p>}
//                 {!loading && filteredUsers.length === 0 && <p>No users found.</p>}

//                 <ul style={{ listStyleType: 'none', paddingLeft: '0', textAlign: 'center' }}>
//                     {filteredUsers.map(user => (
//                         <li key={user.id} >
//                             {user.id} . <strong>{user.name}</strong> - {user.role}
//                         </li>
//                     ))}
//                 </ul>
//             </div>

//         </>
//     )
// }

// export default UseEffectExample;
// above is big example
/**
 * Flow Of Below Program
 * Step | Description
1️⃣ | React runs the component and initializes useState
2️⃣ | JSX is returned and UI is rendered
3️⃣ | useEffect runs after render, if dependencies changed
 */
import React, { useState, useEffect } from 'react';

const UseEffectExample = () => {
    const [count, setCount] = useState(0);

    // 🔄 useEffect runs after every render
    useEffect(() => {
        console.log('useEffect called! :' + count);
        // document.title = `Clicked ${count} times`; // it displays the title on the  table titile
    }, [count]); // ✅ Runs ONLY when `count` changes

    /**
     * Dependency | When useEffect runs
    * [] (empty)  | Only once — after first render (mount)
    * [count]     | On initial render and every time count changes
    * No array    | On every render (not recommended unless necessary)

     */

    return (
        <>
            <div style={{ padding: '20px' }}>
                <h3><strong>Use Effect Example : </strong></h3>
                <h3> Count: {count}</h3>
                <button onClick={() => setCount(count + 1)}>➕ Increase</button>
            </div>
        </>
    );
}

export default UseEffectExample;
