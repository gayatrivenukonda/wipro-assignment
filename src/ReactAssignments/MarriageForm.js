import React, { Component } from "react";
import "bootstrap/dist/css/bootstrap.min.css";

class MarriageForm extends Component {
  constructor(props) {
    super(props);
    this.state = {
      brideName: "",
      groomName: "",
      date: "",
      venue: "",
      submitted: false
    };
  }

  handleChange = (e) => {
    this.setState({ [e.target.name]: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    this.setState({ submitted: true });
  };

  render() {
    return (
      <div className="container mt-4">
        <div className="card p-4">
          <h2 className="text-center">Marriage Form</h2>
          <form onSubmit={this.handleSubmit}>
            <div className="form-group mb-2">
              <label>Bride Name</label>
              <input
                type="text"
                name="brideName"
                className="form-control"
                value={this.state.brideName}
                onChange={this.handleChange}
                required
              />
            </div>

            <div className="form-group mb-2">
              <label>Groom Name</label>
              <input
                type="text"
                name="groomName"
                className="form-control"
                value={this.state.groomName}
                onChange={this.handleChange}
                required
              />
            </div>

            <div className="form-group mb-2">
              <label>Marriage Date</label>
              <input
                type="date"
                name="date"
                className="form-control"
                value={this.state.date}
                onChange={this.handleChange}
                required
              />
            </div>

            <div className="form-group mb-2">
              <label>Venue</label>
              <input
                type="text"
                name="venue"
                className="form-control"
                value={this.state.venue}
                onChange={this.handleChange}
                required
              />
            </div>

            <button type="submit" className="btn btn-primary w-100 mt-3">
              Submit
            </button>
          </form>
        </div>

        {this.state.submitted && (
          <div className="card p-4 mt-4">
            <h3>Marriage Details</h3>
            <p><b>Bride Name:</b> {this.state.brideName}</p>
            <p><b>Groom Name:</b> {this.state.groomName}</p>
            <p><b>Date:</b> {this.state.date}</p>
            <p><b>Venue:</b> {this.state.venue}</p>
          </div>
        )}
      </div>
    );
  }
}

export default MarriageForm;