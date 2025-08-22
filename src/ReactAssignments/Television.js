import React, { Component } from "react";

// Functional Component
function TelevisionList({ televisions }) {
  return (
    <div>
      <h3>Television List</h3>
      <ul>
        {televisions.map((tv, index) => (
          <li key={index}>{tv}</li>
        ))}
      </ul>
    </div>
  );
}

// Class Component
class TelevisionManager extends Component {
  constructor(props) {
    super(props);
    this.state = {
      televisions: ["Samsung", "LG", "Sony"],
      newTelevision: ""
    };
  }

  handleChange = (e) => {
    this.setState({ newTelevision: e.target.value });
  };

  addTelevision = () => {
    if (this.state.newTelevision.trim() !== "") {
      this.setState({
        televisions: [...this.state.televisions, this.state.newTelevision],
        newTelevision: ""
      });
    }
  };

  render() {
    return (
      <div>
        <h2>Television Manager</h2>
        <input
          type="text"
          value={this.state.newTelevision}
          onChange={this.handleChange}
          placeholder="Enter TV model"
        />
        <button onClick={this.addTelevision}>Add</button>

        {/* Passing televisions as props to child */}
        <TelevisionList televisions={this.state.televisions} />
      </div>
    );
  }
}

export default TelevisionManager;