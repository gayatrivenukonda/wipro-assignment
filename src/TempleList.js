import React from "react";
export default function TempleList() {
  const temples = [
    { id: 1, name: "Meenakshi Amman Temple", location: "Madurai, Tamil Nadu", deities: ["Meenakshi", "Sundareswarar"] },
    { id: 2, name: "Sri Venkateswara Temple", location: "Tirupati, Andhra Pradesh", deities: ["Venkateswara", "Lakshmi"] },
    { id: 3, name: "Jagannath Temple", location: "Puri, Odisha", deities: ["Jagannath", "Balabhadra", "Subhadra"] },
  ];
  return (
    <div>
      <h2>Famous Temples in India</h2>
      <table border="1">
        <thead>
          <tr>
            <th>ID</th>
            <th>Temple Name</th>
            <th>Location</th>
            <th>Deities</th>
          </tr>
        </thead>
        <tbody>
          {temples.map((t) => (
            <tr key={t.id}>
              <td>{t.id}</td>
              <td>{t.name}</td>
              <td>{t.location}</td>
              <td>{t.deities.map((d, i) => <div key={i}>{d}</div>)}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}