import React from "react";
import'bootstrap/dist/css/bootstrap.min.css';
const Juice = ({ id, name, price }) => (
  <tr>
    <td>{id}</td>
    <td>{name}</td>
    <td>₹{price}</td>
  </tr>
);

export default function JuiceList() {
  const juices = [
    { id: 1, name: "Orange Juice", price: 80 },
    { id: 2, name: "Apple Juice", price: 100 },
    { id: 3, name: "Mango Juice", price: 120 },
  ];
  return (
    <div>
      <h2>Juice Menu</h2>
      <table border="1">
        <thead>
          <tr>
            <th>ID</th>
            <th>Juice Name</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {juices.map((j) => (
            <Juice key={j.id} {...j} />
          ))}
        </tbody>
      </table>
    </div>
  );
}