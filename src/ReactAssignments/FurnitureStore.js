import React, { useState } from "react";

// Individual furniture components
const Chair = () => (
  <div>
    <h3>🪑 Chair</h3>
    <p>Name: Office Chair</p>
    <p>Price: ₹2500</p>
    <p>Material: Plastic</p>
    <p>Brand: Nilkamal</p>
  </div>
);

const Table = () => (
  <div>
    <h3>🛋 Table</h3>
    <p>Name: Dining Table</p>
    <p>Price: ₹7000</p>
    <p>Material: Wood</p>
    <p>Brand: Godrej</p>
  </div>
);

const Sofa = () => (
  <div>
    <h3>🛋 Sofa</h3>
    <p>Name: Recliner Sofa</p>
    <p>Price: ₹15000</p>
    <p>Material: Leather</p>
    <p>Brand: Urban Ladder</p>
  </div>
);

const Bed = () => (
  <div>
    <h3>🛏 Bed</h3>
    <p>Name: King Size Bed</p>
    <p>Price: ₹20000</p>
    <p>Material: Teak Wood</p>
    <p>Brand: Durian</p>
  </div>
);

// Main App
const FurnitureStore = () => {
  const [selectedFurniture, setSelectedFurniture] = useState("chair");

  const renderFurniture = () => {
    switch (selectedFurniture) {
      case "chair":
        return <Chair />;
      case "table":
        return <Table />;
      case "sofa":
        return <Sofa />;
      case "bed":
        return <Bed />;
      default:
        return <p>Please select a furniture item.</p>;
    }
  };

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h2>Furniture Store</h2>
      <select
        value={selectedFurniture}
        onChange={(e) => setSelectedFurniture(e.target.value)}
      >
        <option value="chair">Chair</option>
        <option value="table">Table</option>
        <option value="sofa">Sofa</option>
        <option value="bed">Bed</option>
      </select>

      <div style={{ marginTop: "20px", border: "1px solid #ccc", padding: "10px" }}>
        {renderFurniture()}
      </div>
    </div>
  );
};

export default FurnitureStore;