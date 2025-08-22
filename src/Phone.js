import React from "react";
function Phone({ brand, model, price }) {
  return (
    <div>
      <h2>Phone Details</h2>
      <p>Brand: {brand}</p>
      <p>Model: {model}</p>
      <p>Price: ₹{price}</p>
    </div>
  );
}

export default Phone;