import React, { Component } from "react";
import "bootstrap/dist/css/bootstrap.min.css";

class AccessoriesForm extends Component {
  constructor(props) {
    super(props);
    this.state = {
      name: "",
      description: "",
      category: "Electronics",
      brand: "Sony",
      inStock: false,
      warranty: "",
      submitted: false
    };
  }

  handleChange = (e) => {
    const { name, value, type, checked } = e.target;
    this.setState({
      [name]: type === "checkbox" ? checked : value
    });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    this.setState({ submitted: true });
  };

  render() {
    return (
      <div className="container mt-4">
        <div className="card p-4">
          <h2 className="text-center">Accessories Form</h2>
          <form onSubmit={this.handleSubmit}>
            <div className="form-group mb-2">
              <label>Accessory Name</label>
              <input
                type="text"
                name="name"
                className="form-control"
                value={this.state.name}
                onChange={this.handleChange}
                required
              />
            </div>

            <div className="form-group mb-2">
              <label>Description</label>
              <textarea
                name="description"
                className="form-control"
                value={this.state.description}
                onChange={this.handleChange}
                required
              ></textarea>
            </div>

            <div className="form-group mb-2">
              <label>Category</label>
              <select
                name="category"
                className="form-control"
                value={this.state.category}
                onChange={this.handleChange}
              >
                <option>Electronics</option>
                <option>Clothing</option>
                <option>Sports</option>
              </select>
            </div>

            <div className="form-group mb-2">
              <label>Brand</label><br />
              <input
                type="radio"
                name="brand"
                value="Sony"
                checked={this.state.brand === "Sony"}
                onChange={this.handleChange}
              /> Sony
              <input
                type="radio"
                name="brand"
                value="Samsung"
                checked={this.state.brand === "Samsung"}
                onChange={this.handleChange}
                className="ms-3"
              /> Samsung
              <input
                type="radio"
                name="brand"
                value="LG"
                checked={this.state.brand === "LG"}
                onChange={this.handleChange}
                className="ms-3"
              /> LG
            </div>

            <div className="form-group mb-2">
              <label>
                <input
                  type="checkbox"
                  name="inStock"
                  checked={this.state.inStock}
                  onChange={this.handleChange}
                /> Available in stock
              </label>
            </div>

            <div className="form-group mb-2">
              <label>Warranty (years)</label>
              <input
                type="number"
                name="warranty"
                className="form-control"
                value={this.state.warranty}
                onChange={this.handleChange}
                required
              />
            </div>

            <button type="submit" className="btn btn-success w-100 mt-3">
              Submit
            </button>
          </form>
        </div>

        {this.state.submitted && (
          <div className="card p-4 mt-4">
            <h3>Accessory Details</h3>
            <table className="table table-bordered">
              <tbody>
                <tr>
                  <th>Name</th>
                  <td>{this.state.name}</td>
                </tr>
                <tr>
                  <th>Description</th>
                  <td>{this.state.description}</td>
                </tr>
                <tr>
                  <th>Category</th>
                  <td>{this.state.category}</td>
                </tr>
                <tr>
                  <th>Brand</th>
                  <td>{this.state.brand}</td>
                </tr>
                <tr>
                  <th>Available</th>
                  <td>{this.state.inStock ? "Yes" : "No"}</td>
                </tr>
                <tr>
                  <th>Warranty</th>
                  <td>{this.state.warranty} years</td>
                </tr>
              </tbody>
            </table>
          </div>
        )}
      </div>
    );
  }
}

export default AccessoriesForm;