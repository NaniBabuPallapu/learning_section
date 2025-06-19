// DataTypesDemo.jsx
import React from "react";

const DataTypesDemo = () => {
  const name = "Nani";                     // String
  const age = 28;                          // Number
  const isLoggedIn = true;                // Boolean
  const user = { firstName: "Nani", lastName: "Babu" }; // Object
  const hobbies = ["Reading", "Coding"];   // Array
  const greet = () => "Hello from function!"; // Function
  const nullValue = null;
  const undefinedValue = undefined;
  const employees = [
    { id: 1, name: "Alice", age: 30 },
    { id: 2, name: "Bob", age: 25 },
    { id: 3, name: "Charlie", age: 28 }
  ]

  return (
    <div>
      <h2>Data Types in JSX</h2>

      {/* String */}
      <p>Name: {name}</p>

      {/* Number */}
      <p>Age: {age}</p>

      {/* Boolean (conditionally rendered text) */}
      <p>Status: {isLoggedIn ? "Logged In" : "Guest"}</p>

      {/* Object */}
      <p>Full Name: {user.firstName} {user.lastName}</p>

      {/* Array */}
      <p>Hobbies:</p>
      <ul>
        {hobbies.map((hobby, index) => (
          <li key={index}>{hobby}</li>
        ))}
      </ul>

      <p>{/* List of employees (objects) */}</p>
      <ul>
        {employees.map((employee) => (
          <li key={employee.id}>
            ID : {employee.id}
            Name : {employee.name}
            Age : {employee.age}
          </li>
        ))}
      </ul>
      <ul>
        {employees.map((employee) => (
          <li key={employee.id}>
            ID: {employee.id}, Name: {employee.name}, Age: {employee.age}
          </li>
        ))}
      </ul>

      {/* Function */}
      <p>Greeting: {greet()}</p>

      {/* null */}
      <p>Null Value: {nullValue}</p>

      {/* undefined */}
      <p>Undefined Value: {String(undefinedValue)}</p>
    </div>
  );
};

export default DataTypesDemo;
