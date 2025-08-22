import React, { Component } from "react";

// Functional Component
function FruitList({ fruits }) {
  return (
    <div>
      <h3>Fruit List</h3>
      <ul>
        {fruits.map((fruit, index) => (
          <li key={index}>{fruit}</li>
        ))}
      </ul>
    </div>
  );
}

// Class Component
class Fruits extends Component {
  constructor(props) {
    super(props);
    this.state = {
      fruits: ["Apple", "Banana", "Orange"],
      newFruit: ""
    };
  }

  handleChange = (e) => {
    this.setState({ newFruit: e.target.value });
  };

  addFruit = () => {
    if (this.state.newFruit.trim() !== "") {
      this.setState({
        fruits: [...this.state.fruits, this.state.newFruit],
        newFruit: ""
      });
    }
  };

  render() {
    return (
      <div>
        <h2>Fruits</h2>
        <input
          type="text"
          value={this.state.newFruit}
          onChange={this.handleChange}
          placeholder="Enter fruit"
        />
        <button onClick={this.addFruit}>Add</button>

        {/* Passing fruits as props to child */}
        <FruitList fruits={this.state.fruits} />
      </div>
    );
  }
}

export default Fruits;