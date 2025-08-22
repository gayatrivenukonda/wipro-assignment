import React, { useState } from "react";
import 'bootstrap/dist/css/bootstrap.min.css';

export default function BakingItemsForm() {
  const [formData, setFormData] = useState({
    itemName: "",
    quantity: "",
    ingredients: "",
    bakingTime: "",
    category: "Cake",
  });

  const [bakingItems, setBakingItems] = useState([]);

  // Handle input change (for all fields)
  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });
  };

  // Handle form submission
  const handleSubmit = (e) => {
    e.preventDefault();
    setBakingItems([...bakingItems, formData]); // Add to list
    setFormData({ itemName: "", quantity: "", ingredients: "", bakingTime: "", category: "Cake" }); // Reset form
  };

  return (
    <div className="container mt-4">
      <div className="card p-4 shadow-lg">
        <h3 className="mb-3">🧁 Baking Items Form</h3>
        <form onSubmit={handleSubmit}>
          <div className="mb-3">
            <label className="form-label">Item Name</label>
            <input
              type="text"
              name="itemName"
              className="form-control"
              value={formData.itemName}
              onChange={handleChange}
              required
            />
          </div>

          <div className="mb-3">
            <label className="form-label">Quantity</label>
            <input
              type="number"
              name="quantity"
              className="form-control"
              value={formData.quantity}
              onChange={handleChange}
              required
            />
          </div>

          <div className="mb-3">
            <label className="form-label">Ingredients</label>
            <input
              type="text"
              name="ingredients"
              className="form-control"
              value={formData.ingredients}
              onChange={handleChange}
              required
            />
          </div>

          <div className="mb-3">
            <label className="form-label">Baking Time (minutes)</label>
            <input
              type="number"
              name="bakingTime"
              className="form-control"
              value={formData.bakingTime}
              onChange={handleChange}
              required
            />
          </div>

          <div className="mb-3">
            <label className="form-label">Category</label>
            <select
              name="category"
              className="form-control"
              value={formData.category}
              onChange={handleChange}
            >
              <option value="Cake">Cake</option>
              <option value="Bread">Bread</option>
              <option value="Pastry">Pastry</option>
            </select>
          </div>

          <button type="submit" className="btn btn-success">
            Add Baking Item
          </button>
        </form>
      </div>

      {/* Table Section */}
      <div className="mt-4">
        <h4>Baking Items List</h4>
        <table className="table table-bordered table-striped mt-2">
          <thead className="table-dark">
            <tr>
              <th>#</th>
              <th>Item Name</th>
              <th>Quantity</th>
              <th>Ingredients</th>
              <th>Baking Time</th>
              <th>Category</th>
            </tr>
          </thead>
          <tbody>
            {bakingItems.map((item, index) => (
              <tr key={index}>
                <td>{index + 1}</td>
                <td>{item.itemName}</td>
                <td>{item.quantity}</td>
                <td>{item.ingredients}</td>
                <td>{item.bakingTime} mins</td>
                <td>{item.category}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}