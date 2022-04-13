import React from 'react'
import "./Reg.style.css";


export default function CustomerHome ()  {

   

   
         return (
             <div>
                 <img src="./images/car-service.jpg" alt=""  className='image'/>
                 <h1> Welcome {JSON.parse(localStorage.getItem("loggedinuser")).firstname }</h1>
                 <br/>
                 <ul>
                     <li> <a href="#"> Make Appointment </a></li>
                     <li> <a href="findgarage"> Search Garages </a></li>
                 </ul>
                 <div>
               
              </div> 

                 
             </div>
             


             

         );
    
}