import { useEffect, useState } from "react";
import React from 'react';
import "./Reg.style.css";
import { ReactDOM } from 'react';
import { Link, useLocation, useNavigate, useParams } from "react-router-dom";
import reactDom from "react-dom";


export  function GetAllFeedbacks()
{
    
    

    const[feedbacks,setFeedbacks] = useState({
        allfeedbacks : []
    });

    
    React.useEffect(() => {
        fetch("http://localhost:8080/getfeedbacks/")
        .then(resp => resp.json())
        .then(data => setFeedbacks({allfeedbacks:data}));
       

        
        
      },[]);


      return (
        <div className="feedbacks">
             <div>
             <h3> Feedbacks </h3>
             <hr />
             <table className="table owner-details" border="1"  >
            <tr>
                <th>ID</th>
                <th>Customer Name</th>
                <th> Feedback </th>
                <th> Date of Feedback  </th>
                <th> Garage  Name</th>
                <th> Address</th>

            </tr>
            {
                feedbacks.allfeedbacks.map((ev)=>{
                    return(
                        <tr>
                             <td>{ev.feedbackID}</td> 
                            <td>{ev.customer.firstname}</td> 
                           <td>{ev.feedback_text}</td> 
                           <td>{ev.createdOn}</td> 
                           <td>{ev.owner.ownerName}</td> 
                           <td>{ev.owner.areaID.areaNM}</td> 
                           
                        </tr>
                     )  

                    })
            
            }
            </table>          
            </div>      
        </div>

    )
      
}