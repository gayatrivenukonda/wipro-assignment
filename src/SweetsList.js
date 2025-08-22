import React from "react";
function SweetsList() {
  const sweets = ["Laddu", "Gulab Jamun", "Rasgulla", "Kaju Katli"];

  return (
    <div className="container mt-4">
      <h3 className="text-danger">Sweets List</h3>
      <ul className="list-group">
        {sweets.map((sweet, index) => (
          <li key={index} className="list-group-item list-group-item-warning">
            {sweet}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default SweetsList;