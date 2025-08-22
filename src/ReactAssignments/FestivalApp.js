import React, { useState, useEffect } from "react";

function FestivalApp() {
  const [festival, setFestival] = useState("Diwali");
  const [countdown, setCountdown] = useState(10);

  // Helper function: formatted timestamp
  const getTimeStamp = () => {
    const now = new Date();
    return now.toLocaleTimeString("en-GB") + "." + now.getMilliseconds();
  };

  // Q1: Festival Greeting (Every Render)
  useEffect(() => {
    console.log("Festival App Rendered");
    console.log(getTimeStamp());
  });

  // Q2: Welcome Message (Run Once)
  useEffect(() => {
    console.log("Welcome to Diwali Festival App");
    console.log(getTimeStamp());
    alert("Welcome to Diwali Festival App 🎉");
  }, []);

  // Q3 + Q5 merged: Track changes in festival OR countdown
  useEffect(() => {
    console.log(`Festival: ${festival}, Seconds left: ${countdown}`);
    console.log(getTimeStamp());
  }, [festival, countdown]);

  // Q4: Countdown Timer with Cleanup
  useEffect(() => {
    const timer = setInterval(() => {
      setCountdown((prev) => (prev > 0 ? prev - 1 : 0));
    }, 1000);

    return () => clearInterval(timer);
  }, []);

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1>🎊 Festival App 🎊</h1>

      <h2>Current Festival: {festival}</h2>
      <h3>Countdown: {countdown}</h3>

      <div style={{ marginTop: "20px" }}>
        <button onClick={() => setFestival("Diwali")}>Diwali</button>
        <button onClick={() => setFestival("Holi")} style={{ marginLeft: "10px" }}>
          Holi
        </button>
        <button onClick={() => setFestival("Pongal")} style={{ marginLeft: "10px" }}>
          Pongal
        </button>
      </div>
    </div>
  );
}

export default FestivalApp;