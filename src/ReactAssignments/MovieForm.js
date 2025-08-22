import React, { Component } from "react";
import "bootstrap/dist/css/bootstrap.min.css";

class MovieForm extends Component {
  constructor(props) {
    super(props);
    console.log("constructor executed");
    this.state = {
      title: "",
      director: "",
      year: "",
      genre: "Action",
      rating: "1",
      description: "",
      platforms: {
        netflix: false,
        prime: false,
        disney: false,
        others: false,
      },
      movies: [],
      showForm: true, // for demonstrating componentWillUnmount
    };
  }

  static getDerivedStateFromProps(nextProps, prevState) {
    console.log("getDerivedStateFromProps executed");
    return null;
  }

  componentDidMount() {
    console.log("componentDidMount executed");
  }

  shouldComponentUpdate(nextProps, nextState) {
    console.log("shouldComponentUpdate executed");
    return true;
  }

  getSnapshotBeforeUpdate(prevProps, prevState) {
    console.log("getSnapshotBeforeUpdate executed");
    return null;
  }

  componentDidUpdate(prevProps, prevState, snapshot) {
    console.log("componentDidUpdate executed");
  }

  componentWillUnmount() {
    console.log("componentWillUnmount executed");
  }

  handleChange = (e) => {
    const { name, value, type, checked } = e.target;
    if (type === "checkbox") {
      this.setState((prev) => ({
        platforms: { ...prev.platforms, [name]: checked },
      }));
    } else {
      this.setState({ [name]: value });
    }
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const { title, director, year, genre, rating, description, platforms } =
      this.state;

    const newMovie = {
      title,
      director,
      year,
      genre,
      rating,
      description,
      platforms: Object.keys(platforms)
        .filter((key) => platforms[key])
        .join(", "),
    };

    this.setState((prev) => ({
      movies: [...prev.movies, newMovie],
      title: "",
      director: "",
      year: "",
      genre: "Action",
      rating: "1",
      description: "",
      platforms: { netflix: false, prime: false, disney: false, others: false },
    }));
  };

  toggleForm = () => {
    this.setState({ showForm: !this.state.showForm });
  };

  render() {
    console.log("render executed");
    if (!this.state.showForm) {
      return (
        <div className="container mt-3">
          <button className="btn btn-secondary" onClick={this.toggleForm}>
            Show Form
          </button>
          <h4 className="mt-3">Form is Unmounted</h4>
        </div>
      );
    }

    return (
      <div className="container mt-4">
        <button className="btn btn-warning mb-3" onClick={this.toggleForm}>
          Toggle Form
        </button>

        <div className="card p-3 shadow">
          <h3>Add Movie</h3>
          <form onSubmit={this.handleSubmit}>
            <div className="mb-2">
              <label>Movie Title</label>
              <input
                type="text"
                className="form-control"
                name="title"
                value={this.state.title}
                onChange={this.handleChange}
                required
              />
            </div>
            <div className="mb-2">
              <label>Director</label>
              <input
                type="text"
                className="form-control"
                name="director"
                value={this.state.director}
                onChange={this.handleChange}
                required
              />
            </div>
            <div className="mb-2">
              <label>Release Year</label>
              <input
                type="number"
                className="form-control"
                name="year"
                value={this.state.year}
                onChange={this.handleChange}
                required
              />
            </div>
            <div className="mb-2">
              <label>Genre</label>
              <select
                className="form-control"
                name="genre"
                value={this.state.genre}
                onChange={this.handleChange}
              >
                <option>Action</option>
                <option>Comedy</option>
                <option>Drama</option>
                <option>Sci-Fi</option>
                <option>Horror</option>
              </select>
            </div>
            <div className="mb-2">
              <label>Rating</label>
              <div>
                {[1, 2, 3, 4, 5].map((num) => (
                  <label key={num} className="me-2">
                    <input
                      type="radio"
                      name="rating"
                      value={num}
                      checked={this.state.rating === String(num)}
                      onChange={this.handleChange}
                    />{" "}
                    {num}
                  </label>
                ))}
              </div>
            </div>
            <div className="mb-2">
              <label>Description</label>
              <textarea
                className="form-control"
                name="description"
                value={this.state.description}
                onChange={this.handleChange}
              ></textarea>
            </div>
            <div className="mb-2">
              <label>Available on Streaming Platforms</label>
              <div>
                <label className="me-2">
                  <input
                    type="checkbox"
                    name="netflix"
                    checked={this.state.platforms.netflix}
                    onChange={this.handleChange}
                  />{" "}
                  Netflix
                </label>
                <label className="me-2">
                  <input
                    type="checkbox"
                    name="prime"
                    checked={this.state.platforms.prime}
                    onChange={this.handleChange}
                  />{" "}
                  Amazon Prime
                </label>
                <label className="me-2">
                  <input
                    type="checkbox"
                    name="disney"
                    checked={this.state.platforms.disney}
                    onChange={this.handleChange}
                  />{" "}
                  Disney+
                </label>
                <label>
                  <input
                    type="checkbox"
                    name="others"
                    checked={this.state.platforms.others}
                    onChange={this.handleChange}
                  />{" "}
                  Others
                </label>
              </div>
            </div>
            <button className="btn btn-primary">Add Movie</button>
          </form>
        </div>

        {this.state.movies.length > 0 && (
          <table className="table table-bordered mt-3">
            <thead>
              <tr>
                <th>Title</th>
                <th>Director</th>
                <th>Year</th>
                <th>Genre</th>
                <th>Rating</th>
                <th>Description</th>
                <th>Platforms</th>
              </tr>
            </thead>
            <tbody>
              {this.state.movies.map((m, index) => (
                <tr key={index}>
                  <td>{m.title}</td>
                  <td>{m.director}</td>
                  <td>{m.year}</td>
                  <td>{m.genre}</td>
                  <td>{m.rating}</td>
                  <td>{m.description}</td>
                  <td>{m.platforms}</td>
                </tr>
              ))}
            </tbody>
          </table>
        )}
      </div>
    );
  }
}

export default MovieForm;