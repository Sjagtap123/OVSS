import React from 'react'
import "./Reg.style.css";



export default function AdminHome ()  {

   

   
         return (
             <div>
                
                 <div className='main'>
                     
                 <h1> Welcome {JSON.parse(localStorage.getItem("loggedinuser")).firstname }</h1>
                  
                 <p> <a href="regowner"> Add Owner </a> </p> 
                 <p> <a href="#"> Check Feedbacks </a> </p> 
                  
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