import { useEffect, useState } from "react";
import React from 'react';
import "./Reg.style.css";
import { ReactDOM } from 'react';
import { Link, useLocation, useNavigate, useParams } from "react-router-dom";
import reactDom from "react-dom";


export  function ViewNewRequests(props)
{
    
    const {id} =useParams();

    const[requests,setRequests] = useState({
        allrequests : []
    });

    
    React.useEffect(() => {
        fetch("http://localhost:8080/viewpendingreq/"+id)
        .then(resp => resp.json())
        .then(data => setRequests({allrequests:data}))
        
      },[]);


      return (
        <div className="container">
             <div>
             <h3> New Pending Requests </h3>
             <hr />
             <table className="table table-bordered " >
            <tr>
                <th>Order ID</th>
                <th>Customer Name</th>
                <th>Customer Contact</th>
                <th>Customer Address</th>
                <th>Customer Vehicle</th>
                <th> Request date  </th>
                <th> Expected servicing date  </th>

            </tr>
            {
                requests.allrequests.map((ev)=>{
                    return(
                        <tr>
                             <td>{ev.order_id}</td> 
                            <td>{ev.customerID.firstname},{ev.customerID.lastname}</td> 
                           <td>{ev.customerID.contact}</td> 
                           <td>{ev.customerID.address}</td> 
                           <td>{ev.vehicleID.vehiclenumber},{ev.vehicleID.company},{ev.vehicleID.model}</td> 
                           <td>{ev.requested_date}</td> 
                           <td>{ev.servicing_date}</td> 
                           <td><Link to={`/AssignEmp/${ev.order_id}`} > Assign Employee</Link></td>
                        </tr>
                     )  

                    })
            
            }
            </table>          
            </div>  
             
        </div>

    )
      
}