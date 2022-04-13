import React from 'react'
import "./Reg.style.css";



export default function OwnerHome ()  {

   

   
         return (
             <div>
                 <img src="./images/owner.jpg" alt=""  className='image'/>
                 <div className='main'>
                     
                 <h1> Welcome {JSON.parse(localStorage.getItem("loggedinuser")).ownerName }</h1>
                  
                 <p> <a href="/regemp" className='href'> Add Employee </a> </p> 
                 <p> <a href="#" className='href'> Check Feedbacks </a> </p> 
                 <p> <a href="getstocks" className='href'> Get Stock Details  </a> </p> 
                 <p> <a href="addstocks" className='href'> Add Stocks  </a> </p> 
                 <p> <a href="addservicedetails" className='href'> Add Service Details   </a> </p> 
                  
                 </div>
                
                  <div className='footerimage'>
                 <img src="./images/REPAIR.png" alt=""  />

                  </div>
                  <div className="text">
                      <p> One  Stop Shop for all auto repair </p>
                      <p> Complete Computer Diagnostics </p>
                      <p> Complete Safety Analysis </p>
                      <p> Drivability  Problems  </p>
                      <p> Performance Upgrade  </p>
                  </div>

                  <div className='aboutus'>
                      <p> Contact us  </p>
                      <p> About  us  </p>

                  </div>
                 
             </div>
             


             

         );
    
}