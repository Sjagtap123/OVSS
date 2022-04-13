





import { BrowserRouter, Route, Link, Routes} from 'react-router-dom';
import { Aboutus } from './Aboutus';
import AddServiceDetails from './AddServiceDetails';
import AddStock from './Add_Stock';
import AdminHome from './AdminHome';
import BookingService from './BookingService';
import { Contactus } from './Contactus';
import CustomerHome from './CustomerHome';
import CustomerRegister from './CustomerRegistration';
import { FAQ1 } from './faq1';
import FindGarages from './FindGarage';
import { GetFeedbacks } from './GetFeedback';
import HomeComponent from './HomeComponent';
import Login from './login1';
import OwnerHome from './OwnerHome';
import RegisterEmp from './RegistrationEmp';
import RegistrationOwner from './RegistrationOwner';
import { ServiceDetails } from './ServiceDetails';
import ShowStock from './show_Stock';







function HomePage() {
   
    return (
      <div className="Home">
       
  
         
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
                <Route path="/RegisterCust" element={<CustomerRegister/>}/>
                <Route path="/Login" element={<Login/>}/>
                <Route path="/FAQs" element={<FAQ1/>}/>
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
                 
  
              </Routes>
      
   
  
    </div>
    
  
    );
  }
  
  export default HomePage;