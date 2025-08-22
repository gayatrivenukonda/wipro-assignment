import React from "react";
class MenuItem extends React.Component {
  render() {
    const { name, price, category, available } = this.props;
    return (
      <div>
        {name} - ₹{price} ({category}) - {available ? "Available" : "Not Available"}
      </div>
    );
  }
}

export default class Restaurant extends React.Component {
  render() {
    const menu = [
      { name: "Paneer Butter Masala", price: 150, category: "Main Course", available: true },
      { name: "Chicken Biryani", price: 200, category: "Main Course", available: true },
      { name: "Masala Dosa", price: 80, category: "Breakfast", available: true },
      { name: "Gulab Jamun", price: 40, category: "Dessert", available: false },
    ];
    return (
      <div>
        <h2>Restaurant Name: Spice Hub</h2>
        <p>Location: Block B, First Floor</p>
        <p>Open Hours: 10 AM - 10 PM</p>
        <h3>Restaurant Menu</h3>
        {menu.map((item, i) => (
          <MenuItem key={i} {...item} />
        ))}
      </div>
    );
  }
}