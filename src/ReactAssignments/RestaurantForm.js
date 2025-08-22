import React, { useState, useEffect } from "react";

function RestaurantForm() {
  const [formData, setFormData] = useState({
    restaurantName: "",
    ownerName: "",
    email: "",
    contact: "",
    address: "",
    cuisineType: "",
    openingHours: ""
  });

  const [submittedData, setSubmittedData] = useState(null);

  // Handle input change
  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });
  };

  // Handle form submit
  const handleSubmit = (e) => {
    e.preventDefault();
    setSubmittedData(formData);
  };

  // Q1: Run on every render
  useEffect(() => {
    console.log("Restaurant Form rendered");
  });

  // Q2: Run only once (on mount)
  useEffect(() => {
    console.log("Restaurant Form mounted");
  }, []);

  // Q3: Run whenever form data changes
  useEffect(() => {
    console.log("Form data updated:", formData);
  }, [formData]);

  // Q4: Auto-save every 5 seconds
  useEffect(() => {
    const interval = setInterval(() => {
      console.log("Auto-saving data:", formData);
    }, 5000);
    return () => clearInterval(interval); // cleanup
  }, [formData]);

  return (
    <div style={{ margin: "20px", padding: "15px", border: "1px solid #ccc" }}>
      <h2>🍴 Restaurant Registration Form</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="restaurantName"
          placeholder="Restaurant Name"
          value={formData.restaurantName}
          onChange={handleChange}
        />
        <br />
        <input
          type="text"
          name="ownerName"
          placeholder="Owner Name"
          value={formData.ownerName}
          onChange={handleChange}
        />
        <br />
        <input
          type="email"
          name="email"
          placeholder="Email"
          value={formData.email}
          onChange={handleChange}
        />
        <br />
        <input
          type="text"
          name="contact"
          placeholder="Contact Number"
          value={formData.contact}
          onChange={handleChange}
        />
        <br />
        <input
          type="text"
          name="address"
          placeholder="Address"
          value={formData.address}
          onChange={handleChange}
        />
        <br />
        <input
          type="text"
          name="cuisineType"
          placeholder="Cuisine Type"
          value={formData.cuisineType}
          onChange={handleChange}
        />
        <br />
        <input
          type="text"
          name="openingHours"
          placeholder="Opening Hours"
          value={formData.openingHours}
          onChange={handleChange}
        />
        <br />
        <button type="submit">Register</button>
      </form>

      {submittedData && (
        <div style={{ marginTop: "20px" }}>
          <h3>📋 Submitted Data (JSON):</h3>
          <pre>{JSON.stringify(submittedData, null, 2)}</pre>
        </div>
      )}
    </div>
  );
}

export default RestaurantForm;