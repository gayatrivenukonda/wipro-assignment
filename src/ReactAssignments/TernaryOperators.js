import React, { useState, useEffect } from "react";

// Loading Component
const LoadingComponent = () => <p>Loading product details...</p>;

// Error Component
const ErrorComponent = () => <p>⚠ Error fetching product details.</p>;

// Product Component
const ProductComponent = ({ product }) => {
  return (
    <div>
      <h2>Electronic Product Details</h2>
      <p>
        <b>Name:</b> {product.name}
      </p>
      <p>
        <b>Brand:</b> {product.brand}
      </p>
      <p>
        <b>Price:</b> ₹{product.price}
      </p>
      <p>
        <b>Category:</b> {product.category}
      </p>
      <p>
        <b>Type:</b>{" "}
        {product.price > 50000 ? "Premium Product" : "Budget Product"}
      </p>
      <p>
        <b>Warranty:</b>{" "}
        {product.warranty > 0
          ? '${product.warranty} years'
          : "No Warranty"}
      </p>
      <p>
        <b>Availability:</b>{" "}
        {product.availability ? "✅ In Stock" : "❌ Out of Stock"}
      </p>
      <p>
        {product.category === "Laptop" ? "🎒 Free Laptop Bag Offer" : ""}
      </p>
    </div>
  );
};

// Main App Component
const App = () => {
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(false);
  const [product, setProduct] = useState(null);

  // Simulate API call
  useEffect(() => {
    setTimeout(() => {
      // Randomize for testing error/success
      const success = Math.random() > 0.3;

      if (success) {
        setProduct({
          name: "Sony Bravia TV",
          brand: "Sony",
          price: 65000,
          category: "TV",
          warranty: 2,
          availability: true,
        });
        setError(false);
      } else {
        setError(true);
      }

      setLoading(false);
    }, 2000);
  }, []);

  // Conditional Rendering using Ternary Operator
  return loading ? (
    <LoadingComponent />
  ) : error ? (
    <ErrorComponent />
  ) : (
    <ProductComponent product={product} />
  );
};

export default App;