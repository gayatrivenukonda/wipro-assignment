import React from "react";
import GroceryList from "./GroceryList";
import Car from "./Car";
import Phone from "./Phone";
import SweetsList from "./SweetsList"
import Electronics from"./Electronics"
import CanteenMenu from"./CanteenMenu"
import JuiceList from"./JuiceList"
import Restaurant from"./Restaurant"
import TempleList from"./TempleList"
import TailorShop from"./TailorShop"
import FruitsList from"./ReactAssignments/FruitsList"
import Television from"./ReactAssignments/Television"
import MarriageForm from"./ReactAssignments/MarriageForm"
import AccessoriesForm from "./ReactAssignments/AccessoriesForm"
import BakingItemsForm from "./ReactAssignments/BakingItemsForm"
import MovieForm from "./ReactAssignments/MovieForm"
import TernaryOperators from "./ReactAssignments/TernaryOperators"
import FlightBookingControlled from "./ReactAssignments/FlightBookingControlled";
import FlightBookingUncontrolled from "./ReactAssignments/FlightBookinUncontrolled";
import FurnitureStore from "./ReactAssignments/FurnitureStore";
import FestivalApp from "./ReactAssignments/FestivalApp";
import RestaurantForm from "./ReactAssignments/RestaurantForm";
import Question21 from "./ReactAssignments/Question21"
import 'bootstrap/dist/css/bootstrap.min.css';//Bootstrap styling
function App() {
  const groceries = ["Rice", "Wheat", "Sugar", "Milk", "Oil"];

  return (
    <div>
      <h1>React Assignment</h1>

      {/* 1. Grocery List Component */}
      <GroceryList items={groceries} />

      <hr />

      {/* 2. Car Component */}
      <Car brand="Toyota" model="Fortuner" color="Black" year="2022" />

      <hr />

      {/* 3. Phone Component */}
      <Phone brand="Samsung" model="Galaxy S23" price="75000"/>
      <phone brand="Apple" model="iphone 15" price="120000" />

      <hr/>
      {/* 4. SweetsList Component */}
      <SweetsList />

      <hr/>
      {/* 5. Electronics Component*/}
      <Electronics/>

      <hr/>
      {/* 6.CanteenMenu Component*/}
      <CanteenMenu/>

      <hr/>
      {/* 7. JuiceList Component*/}
      <JuiceList/>

      <hr/>
      {/* 8. Restaurant Component*/}
      <Restaurant/>

      <hr/>
      {/* 9. TempleList Component*/}
      <TempleList/>

      <hr/>
      {/* 10. TailorShop Component*/}
      <TailorShop/>
      
       <hr/>
      {/* 11. FruitsList Component*/}
      <FruitsList/>

      <hr/>
      {/* 12. Television Component*/}
      <Television/>

      <hr/>
      {/* 13. MarriageForm Component*/}
      <MarriageForm/>

      <hr/>
      {/* 14. AccessoriesForm Component*/}
      <AccessoriesForm />

      <hr/>
      {/* 14. BakingItemsForm Component*/}
      <BakingItemsForm />

      <hr/>
      {/* 15. MovieForm Component*/}
      <MovieForm />

      <hr/>
      {/* 16. TernaryOperators Component*/}
      <TernaryOperators />

      <hr/>
      {/* 17. FlightBookinfControlled Component*/}
      <FlightBookingControlled />

      <hr/>
      {/* 18. FlightBookingUncontrolled Component*/}
      <FlightBookingUncontrolled />

      <hr/>
      {/* 19. FurnitureStore Component*/}
      <FurnitureStore />

      <hr/>
      {/* 20. FestivalApp Component*/}
      <FestivalApp />

       <hr/>
      {/* 21. RestaurantForm Component*/}
      <RestaurantForm />

       <hr/>
      {/* 22. Question21 Component*/}
      <Question21 />

    
    </div>
  );
}

export default App;