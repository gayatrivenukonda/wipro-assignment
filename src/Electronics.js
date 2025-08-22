import React, { useState } from "react";
export default function Electronics() {
  const [name] = useState("Laptop");
  const [brand, setBrand] = useState("Dell");
  const [price, setPrice] = useState(55000);

  return (
    <div>
      <h2>Electronic Item Details</h2>
      <p>Name: {name}</p>
      <p>Brand: {brand}</p>
      <p>Price: ₹{price}</p>
      <button onClick={() => setBrand("HP")}>Change Brand</button>
      <button onClick={() => setPrice(price + 1000)}>Increase Price</button>
    </div>
  );
}