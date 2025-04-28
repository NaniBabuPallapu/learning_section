import { useForm } from "react-hook-form"; // Import useForm hook from react-hook-form

const UseFormExample = () => {

    // Destructure functions and objects from useForm hook
    const {
        register,                     // Used to register input fields and validation rules
        handleSubmit,                 // Handles form submission and validation
        formState: { errors },        // Holds any validation errors
        reset                         // Resets the form fields
    } = useForm();

    // Function called on successful form submission
    const submitUserInfo = (data) => {
        console.log("user info has been submitted :", data); // Log form data to console
        reset(); // Reset form fields after submission
    }

    return (
        <>
            <h3><strong>UseForm Example</strong></h3> {/* Heading */}

            {/* Form with handleSubmit wrapped around submit function */}
            <form className="form-container" onSubmit={handleSubmit(submitUserInfo)}>
                
                {/* Input for username with required validation */}
                <input
                    type="text"
                    placeholder="enter your name"
                    {...register("username", { required: true })} // register input with validation
                />
                {/* Error message if username is empty */}
                {errors.username && <p style={{ color: 'red' }}>Name is required</p>}

                {/* Input for email with required and pattern validation */}
                <input
                    type="email"
                    placeholder="enter your email"
                    {...register("email", {
                        required: "email is required",                      // Custom required message
                        pattern: {                                          // Pattern validation
                            value: /^\S+@\S+$/i,                            // Regex for valid email
                            message: "invalid email address"               // Custom error message
                        }
                    })}
                />
                {/* Error message if email is invalid */}
                {errors.email && <p style={{ color: 'red' }}>{errors.email.message}</p>}

                {/* Submit button */}
                <button type="submit">Submit</button>
            </form>
        </>
    );
}

export default UseFormExample; // Export the component
