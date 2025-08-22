import React from "react";

const CanteenItem = ({ name, price, category, available }) => (
  <div>
    {name} - Price: ₹{price} - Category: {category} -{" "}
    {available ? "Available" : "Not Available"}
  </div>
);

export default function CanteenMenu() {
  const items = [
    { name: "Idli", price: 30, category: "Breakfast", available: true },
    { name: "Dosa", price: 50, category: "Breakfast", available: true },
    { name: "Vada", price: 20, category: "Snack", available: false },
  ];

  return (
    <div>
      <h2>Canteen Name: Campus Food Court</h2>
      <p>Location: Block A, Ground Floor</p>
      <p>Open Hours: 8 AM - 8 PM</p>
      <h3>Canteen Menu</h3>
      {items.map((item, i) => (
        <CanteenItem key={i} {...item} />
      ))}
    </div>
  );
}