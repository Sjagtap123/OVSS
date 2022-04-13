import logo from './logo.svg';
import './App.css';


import '../node_modules/bootstrap/dist/css/bootstrap.min.css';

import { BrowserRouter, Route, Link, Routes} from 'react-router-dom';



import SearchCity from './components/SearchCity';

import Login from './components/login1';

import CustomerHome from './components/CustomerHome';
import OwnerHome from './components/OwnerHome';
import EmployeeHome from './components/EmployeeHome';
import AdminHome from './components/AdminHome';
import { HomePageDetailComponent } from './components/HomePageDetailComponent';
import HomeComponent from './components/HomeComponent';
import { Aboutus } from './components/Aboutus';
import { Contactus } from './components/Contactus';

import Register from './components/GetArea';
import { FAQ1 } from './components/faq1';
import RegisterEmp from './components/RegistrationEmp';
import RegistrationOwner from './components/RegistrationOwner';
import FindGarages from './components/FindGarage';
import { ServiceDetails } from './components/ServiceDetails';
import ShowStock from './components/show_Stock';
import Stock from './components/Add_Stock';
import AddStock from './components/Add_Stock';
import RegistrationCustomer from './components/CustomerRegistration';
import CustomerRegister from './components/CustomerRegistration';
import BookingService from './components/BookingService';
import { GetFeedbacks } from './components/GetFeedback';
import AddServiceDetails from './components/AddServiceDetails';
import HomePage from './components/HomePage';














function App() {
  var arr=["Saurabh","Vikram","Gaurav"];
  return (
    <div className="App">
     

         {/*<BrowserRouter>
            <ul className="nav nav-tabs">
              <li className="nav-item"><Link className="nav-link" to="/login"> Login Form</Link> </li>
              <li className="nav-item"><Link className="nav-link" to="/reg">Register Form</Link> </li>
              <li className="nav-item"><Link className="nav-link" to="/msgstt">Message State</Link> </li>
              <li className="nav-item"><Link className="nav-link" to="/colorstt">Color State</Link> </li>
            </ul>
            <Routes>
              <Route path="/login" element={<LoginForm />} />
              <Route path="/reg" element={<FormComp /> } />
              <Route path="/msgstt" element={<MountingPhase />} />
              <Route path="/colorstt" element={<UpdatingPhase />} />
            </Routes>
         </BrowserRouter>

         
         
       
    <SearchCity /> 
        
    <Registration /> */}
      
  
      
      {/*
        <Link to="/aboutus"> ABOUTUS </Link>
        <Link to="/contactus"> CONTACTUS </Link>
        <Link to="/login"> LOGIN </Link>
         <Link to="/regcustomer"> SIGNUP </Link>
             <Routes>

              <Route path="/customerhome" element={<CustomerHome/>}/>
              <Route path="/login" element={<Login/>}/>
              <Route path="/ownerhome" element={<OwnerHome/>}/>
              <Route path="/employeehome" element={<EmployeeHome/>}/>
              <Route path="/regcustomer" element={<RegistrationCustomer/>}/>
              <Route path="/adminhome" element={<AdminHome/>}/>
              <Route path="/" element={<HomeComponent/>}/>
              <Route path="/aboutus" element={<Aboutus/>}/>
              <Route path="/contactus" element={<Contactus/>}/>
             
            </Routes>
  */}  

         {/*     
             <ul className="nav nav-tabs" >
              <li className="nav-item"><Link className="nav-link" to="/home">Home</Link></li>
              <li className="nav-item"><Link className="nav-link" to="/Aboutus">Aboutus</Link></li>
              <li className="nav-item"><Link className="nav-link" to="/FAQs">FAQs</Link></li>
              <li className="nav-item"><Link className="nav-link" to="/Contactus">Contactus</Link></li>
              <li className="nav-item"><Link className="nav-link" to="/RegisterCust">SIGN UP</Link></li>
              <li className="nav-item"><Link className="nav-link" to="/Login">SIGN IN</Link></li>
            </ul> 
            <Routes>
              <Route path="/home" element={<HomeComponent/>}/>
              <Route path="/Aboutus" element={<Aboutus/>}/>
              <Route path="/ownerhome" element={<OwnerHome/>}/>
              <Route path="/Contactus" element={<Contactus/>}/>
              <Route path="/RegisterCust" element={<RegistrationCustomer/>}/>
              <Route path="/Login" element={<Login/>}/>
              <Route path="/FAQs" element={<FAQ1/>}/>
              <Route path="/customerhome" element={<CustomerHome/>}/>
              <Route path="/regemp" element={<RegisterEmp/>}/>
              <Route path="/getservicedetails/:id" element={<ServiceDetails/>}/>
              <Route path="/adminhome" element={<AdminHome/>}/>
              <Route path="/regowner" element={<RegistrationOwner/>}/>
              <Route path="/getstocks" element={<ShowStock/>}/>
              <Route path="/addstocks" element={<AddStock />}/>
              <Route path="/findgarage" element={<FindGarages/>}/>
              <Route path="/bookapt/:id" element={<BookingService/>}/>
              <Route path="/getfeedback/:id" element={<GetFeedbacks/>}/>
              <Route path="/addservicedetails" element={<AddServiceDetails />}/>
               

            </Routes>
      */}


    
  {/*<Routes>
   <Route path="/getservicedetails/:id" element={<ServiceDetails/>}/>
 
   <Route path="/ownerhome" element={<OwnerHome/>}/>
</Routes> */}
  
 
 

  <HomePage />


    

     {/* </header>*/}
    
 

  </div>
  

  );
}

export default App;
