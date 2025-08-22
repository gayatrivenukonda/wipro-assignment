import React from "react";

function Car({ brand, color }) {
  return (
    <div>
      <h2>Car Details</h2>
      <p>Brand: {brand}</p>
      <p>Color: {color}</p>
    </div>
  );
}

export default Car;