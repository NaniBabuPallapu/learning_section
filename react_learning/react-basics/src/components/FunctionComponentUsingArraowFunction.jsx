const FunctionComponentUsingArrowFunction = () => (
    <>
        <h3>This Is FunctionalComponent Example Using Arraow Function </h3>
    </>
);

export default FunctionComponentUsingArrowFunction;


/*


### ✅ **1. Implicit Return – No Logic Allowed**

```jsx
const FunctionComponentUsingArrowFunction = () => (
  <>
    <h3>This Is FunctionalComponent Example Using Arrow Function</h3>
  </>
);
```

#### 🔍 Notes:
- No curly braces `{}` → So you can't write logic like variable declarations, conditions, etc.
- Best for **pure return of JSX**.

---

### ✅ **2. Explicit Return – Logic Allowed**

```jsx
const FunctionComponentUsingArrowFunction = () => {
  const name = "Nani";
  const currentYear = new Date().getFullYear();
  const age = 2025 - 1998;

  return (
    <>
      <h3>Hello {name} 👋</h3>
      <p>The current year is {currentYear}</p>
      <p>Your calculated age is: {age}</p>
    </>
  );
};
```

#### 🔍 Notes:
- Logic like `const`, `if`, or even loops can be added before `return`.
- Use **explicit return** when the component needs to do **calculations or conditional rendering**.

---

### ⚖️ Summary Table

| Feature                           | **Implicit Return**                              | **Explicit Return**                                       |
|-----------------------------------|--------------------------------------------------|-----------------------------------------------------------|
| JSX directly returned             | ✅ Yes                                           | ✅ Yes                                                    |
| Uses parentheses `()`             | ✅ Yes                                           | ❌ No (uses `{}`)                                         |
| Can define variables              | ❌ No                                            | ✅ Yes                                                    |
| Can include conditions/logic      | ❌ No                                            | ✅ Yes                                                    |
| Suitable for                     | Simple UI blocks                                | Components with logic, conditions, variables              |

---

Let me know if you want examples of using `if/else`, ternary, or `map()` inside JSX!


*/