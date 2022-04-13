import React from 'react'
import "./Reg.style.css";



export default function EmployeeHome ()  {

   

   
         return (
             <div>
                 <img src="./images/owner.jpg" alt=""  className='image'/>
                 <div className='main'>
                     
                 <h1> Welcome {JSON.parse(localStorage.getItem("loggedinuser")).firstname }</h1>
                  
                 <p> <a href="#"> Create Job Card  </a> </p> 
                 <p> <a href="#"> Craete Invoice  </a> </p> 
                  
                 </div>
                
                 
                 
             </div>
             


             

         );
    
}