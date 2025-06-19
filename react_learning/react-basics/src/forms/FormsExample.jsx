import { useState } from "react";

const FormsExample = () => {
  const [formData, setFormData] = useState({
    name: "",
    age: "",
    email: "",
    gender: "",
    state: "",
    subjects: [],
  });

  const subjects = [
    "Java",
    "Python",
    "React",
    "Angular",
    "SpringBoot",
    "MySQL",
  ];

  // For text, number, radio, and select
  const handleChange = (e) => {
    const { name, value } = e.target; // Destructuring to get name and value from the event target
    console.log("field name:", name, "   ","field value:", value);
    // setFormData is a function that updates the state of formData.
    setFormData((prev) => ({
      ...prev, //...prev keeps all existing key-value pairs in formData.
      [name]: value, //[name]: value sets or overwrites the specific field that changed.
    }));
  };

  // For checkboxes
  const handleCheckboxChange = (e) => {
    const { value, checked } = e.target;
    setFormData((prev) => ({
      ...prev,
      subjects: checked
        ? [...prev.subjects, value]
        : prev.subjects.filter((subj) => subj !== value),
    }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log("Submitted Form Data:", formData);
  };

  return (
    <form onSubmit={handleSubmit}>
      <h4>Forms In React</h4>
      Name:{" "}
      <input
        type="text"
        name="name"
        value={formData.name}
        onChange={handleChange}
      />
      <br />
      <br />
      Age:{" "}
      <input
        type="number"
        name="age"
        value={formData.age}
        onChange={handleChange}
      />
      <br />
      <br />
      Email:{" "}
      <input
        type="email"
        name="email"
        value={formData.email}
        onChange={handleChange}
      />
      <br />
      <br />
      Gender:
      <input
        type="radio"
        name="gender"
        value="Male"
        checked={formData.gender === "Male"}
        onChange={handleChange}
      />{" "}
      Male
      <input
        type="radio"
        name="gender"
        value="Female"
        checked={formData.gender === "Female"}
        onChange={handleChange}
      />{" "}
      Female
      <br />
      <br />
      State:
      <select name="state" value={formData.state} onChange={handleChange}>
        <option value="" disabled>
          Select State
        </option>
        <option value="ap">Andhra Pradesh</option>
        <option value="ts">Telangana</option>
        <option value="bihar">Bihar</option>
        <option value="mh">Maharashtra</option>
      </select>
      <br />
      <br />
      <h4>Select Subject:</h4>
      {subjects.map((subject) => (
        <div key={subject}>
          <input
            type="checkbox"
            value={subject}
            checked={formData.subjects.includes(subject)}
            onChange={handleCheckboxChange}
          />
          <label> : {subject}</label>
        </div>
      ))}
      <br />
      <br />
      <button
        type="submit"
        style={{
          color: "darkblue",
          fontWeight: "bold",
          padding: "5px 20px",
        }}
      >
        Submit
      </button>
    </form>
  );
};

export default FormsExample;
