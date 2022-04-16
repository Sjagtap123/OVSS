import React, { Component,useState } from 'react'
import { Navbar, Nav } from 'react-bootstrap';
import { BrowserRouter, Route, Link, Routes} from 'react-router-dom';
import { Aboutus } from './Aboutus';
import { AddFeedback } from './AddFeedback';
import AddServiceDetails from './AddServiceDetails';
import AddStock from './Add_Stock';
import AdminHome from './AdminHome';
import { AssignEmp } from './AssignEmp';
import BookingService from './BookingService';
import { Contactus } from './Contactus';
import CustomerHome from './CustomerHome';
import CustomerRegister from './CustomerRegistration';
import DefaultPage from './DefaultPage';
import EmployeeHome from './EmployeeHome';
import { FAQ1 } from './faq1';
import FindGarages from './FindGarage';
import { GetAllFeedbacks } from './GetAllFeedback';
import { GetFeedbacks } from './GetFeedback';
import HomeComponent from './HomeComponent';
import Login from './login1';
import OwnerHome from './OwnerHome';
import RegisterEmp from './RegistrationEmp';
import RegistrationOwner from './RegistrationOwner';
import { ServiceDetails } from './ServiceDetails';
import ShowStock from './show_Stock';
import { mystore } from "./store";
import { TrackOrder } from './TrackOrder';
import { UpdateStatus } from './UpdateStatus';
import { ViewAssignedRequests } from './ViewAssignedRequests';
import { ViewNewRequests } from './ViewNewRequests';




export default class MainMenu extends React.Component
{

    constructor(props){
          super(props)
          this.state={flag:false}

    }
    render(){
    
        mystore.subscribe(()=>{this.setState({flag:mystore.getState().loggedin})})
        return(


            
          <BrowserRouter> 
          <div style={{display:this.state.flag?'none':'block'}}>
              <div>
                  <Navbar bg="dark" variant={"dark"} expand="lg" >
                      <Navbar.Brand href="#" style={{fontSize:"25px"}}> </Navbar.Brand>
                      <Navbar.Toggle aria-controls="navbarScroll" />
                      <Navbar.Collapse id="navbarScroll">
                         <div>
                          <Nav
                              className="mr-auto my-2 my-lg-0"
                              style={{ maxHeight: '100px' }}
                              navbarScroll> 
                          
                            
                              <Nav.Link as={Link} to="/"  style={{fontSize:"20px"}}>Home</Nav.Link>
                              <Nav.Link as={Link} to="/Aboutus" style={{fontSize:"20px"}}>Aboutus</Nav.Link>
                              <Nav.Link as={Link} to="/Contactus" style={{fontSize:"20px"}}>Contactus</Nav.Link>
                              <Nav.Link as={Link} to="/FAQs" style={{fontSize:"20px"}}>FAQs</Nav.Link>
                              <Nav.Link as={Link} to="/RegisterCust" style={{fontSize:"20px"}} >SignUp</Nav.Link>
                              <Nav.Link as={Link} to="/Login" style={{fontSize:"20px"}}>Login</Nav.Link>
  
                              
              
                          </Nav>
                          </div>
                      

                      </Navbar.Collapse>
                  </Navbar>
                 </div> 

                <div>
                  <Routes>
                      <Route path="/" element={<HomeComponent/>} />
                          
                      
                      <Route path="/Aboutus" element={<Aboutus/>} />
                          
                      
                      <Route path="/Contactus" element={<Contactus/>} />
          
                      <Route path="/Login" element={<Login/>} />

                     < Route path="/RegisterCust" element={<CustomerRegister/>} />
                     < Route path="/FAQs" element={<FAQ1/>} />
                     
                   
                    

                   </Routes>
                   </div>  
            </div>   

        
          <Routes>
                 <Route path="/customerhome" element={<CustomerHome/>}/>
                 <Route path="/regemp" element={<RegisterEmp/>}/>
                 <Route path="/getservicedetails/:id" element={<ServiceDetails/>}/>
                 <Route path="/adminhome" element={<AdminHome/>}/>
                 <Route path="/regowner" element={<RegistrationOwner />}/>
                 <Route path="/getstocks" element={<ShowStock/>}/>
                 <Route path="/addstocks" element={<AddStock />}/>
                 <Route path="/findgarage" element={<FindGarages/>}/>
                 <Route path="/bookapt/:id" element={<BookingService/>}/>
                 <Route path="/getfeedback/:id" element={<GetFeedbacks/>}/>
                 <Route path="/addservicedetails" element={<AddServiceDetails />}/>
                 <Route path="/ownerhome" element={<OwnerHome/>}/>
                 <Route path="/employeehome" element={<EmployeeHome/>}/>
                 <Route path="/allfeedbacks" element={<GetAllFeedbacks/>}/>
                 <Route path="/viewpendingreq/:id" element={<ViewNewRequests/>}/>
                 <Route path="/AssignEmp/:id" element={<AssignEmp/>}/>
                 <Route path="/viewassignedreq/:id" element={<ViewAssignedRequests/>}/>
                 <Route path="/UpdateStatus/:id" element={<UpdateStatus/>}/>
                 <Route path="/TrackOrder" element={<TrackOrder/>}/>
                 
                 <Route path="/addfeedback/:id" element={<AddFeedback/>}/>


          </Routes>
        
</BrowserRouter>
              
            
        )
     
        }
    
}