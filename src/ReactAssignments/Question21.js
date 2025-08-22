import React, { useState } from "react";

function App() {
  const [fruits, setFruits] = useState(["Apple", "Mango"]);
  const [selectedFruit, setSelectedFruit] = useState("");

  // Child B adds Orange
  const addFruitFromChild = () => {
    setFruits([...fruits, "Orange"]);
  };

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h2>🍎 React – Parent / Child / Sibling Communication</h2>

      {/* Child A: Display list and allow selection */}
      <ChildA fruits={fruits} onSelect={setSelectedFruit} />

      {/* Child B: Add fruit */}
      <ChildB onAddFruit={addFruitFromChild} />

      {/* Child C: Show selected fruit */}
      <ChildC selectedFruit={selectedFruit} />
    </div>
  );
}

/* ------------ Child A ------------ */
function ChildA({ fruits, onSelect }) {
  return (
    <div style={{ margin: "10px", padding: "10px", border: "1px solid gray" }}>
      <h3>Child A – Fruit List</h3>
      <ul>
        {fruits.map((fruit, idx) => (
          <li key={idx} onClick={() => onSelect(fruit)} style={{ cursor: "pointer" }}>
            {fruit}
          </li>
        ))}
      </ul>
      <p>👉 Click a fruit to select it</p>
    </div>
  );
}

/* ------------ Child B ------------ */
function ChildB({ onAddFruit }) {
  return (
    <div style={{ margin: "10px", padding: "10px", border: "1px solid gray" }}>
      <h3>Child B – Add Fruit</h3>
      <button onClick={onAddFruit}>Send Fruit (Add Orange)</button>
    </div>
  );
}

/* ------------ Child C ------------ */
function ChildC({ selectedFruit }) {
  return (
    <div style={{ margin: "10px", padding: "10px", border: "1px solid gray" }}>
      <h3>Child C – Selected Fruit</h3>
      {selectedFruit ? (
        <p>🍊 Selected Fruit: <b>{selectedFruit}</b></p>
      ) : (
        <p>No fruit selected yet.</p>
      )}
    </div>
  );
}

export default App;