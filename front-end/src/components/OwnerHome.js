import React from 'react'
import "./Reg.style.css";
import { useNavigate } from 'react-router-dom';
import { mystore } from './store';
import { Navbar, Nav } from 'react-bootstrap';
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link,
    Routes,
    Navigate,
} from "react-router-dom";


export default function OwnerHome ()  {

   

    let navigate=useNavigate();

    const logout=()=>{

        mystore.dispatch({type:'LOGGEDOUT'});
        localStorage.removeItem("loggedinuser");
         navigate("/home");
        

     }
   
         return (
            <div>
            <div>

            <Navbar bg="dark" variant={"dark"} expand="lg" >
                     <Navbar.Brand href="#" style={{fontSize:"25px"}}></Navbar.Brand>
                     <Navbar.Toggle aria-controls="navbarScroll" />
                     <Navbar.Collapse id="navbarScroll">
                         <Nav
                             className="mr-auto my-2 my-lg-0"
                             style={{ maxHeight: '100px' }}
                             navbarScroll
                         >
                             
                             <Nav.Link as={Link} to="/regemp" style={{fontSize:"20px"}}>Add Employee </Nav.Link>
                             <Nav.Link as={Link} to="/getstocks" style={{fontSize:"20px"}}> View Stocks </Nav.Link>
                             <Nav.Link as={Link} to="/addstocks" style={{fontSize:"20px"}}>Add Stocks </Nav.Link>
                             <Nav.Link as={Link} to="/addservicedetails" style={{fontSize:"20px"}}>Add Service-Details </Nav.Link>
                             <Nav.Link as={Link} to="/" style={{fontSize:"20px"}} onClick={logout}>Logout</Nav.Link>


             
                         </Nav>

                     </Navbar.Collapse>
                 </Navbar>

            </div>
          <div>
                 
          <h1>Welcome { JSON.parse(localStorage.getItem("loggedinuser")).ownerName}</h1>
          <img src="./images/owner.jpg" alt="" className='image'/>
          </div>


    </div>

 );
    
}