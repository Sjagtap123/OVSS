import { useEffect, useState } from "react";
import React from 'react';
import "./Reg.style.css";
import { ReactDOM } from 'react';
import { Link, useLocation, useNavigate, useParams } from "react-router-dom";
import reactDom from "react-dom";


export  function ViewAssignedRequests(props)
{
    
    const {id} =useParams();

    const[requests,setRequests] = useState({
        allrequests : []
    });

    const[services,setServices] = useState({
        allservices : []
    });

    
    React.useEffect(() => {
        fetch("http://localhost:8080/viewassignedreq/"+id)
        .then(resp => resp.json())
        .then(data => setRequests({allrequests:data}))

        
        
      },[]);

      const populateServices=(s)=>{

        requests.allrequests.map((ev)=>{
            var oid=ev.order_id 
        fetch("http://localhost:8080/GetAllSRDet/"+oid)
        .then(resp => resp.json())
        .then(data => setServices({allservices:data}))
    })
      }


      return (
        <div className="container">
             <div>
             <h3> Assigned Requests </h3>
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
                <th> Order Status</th>

            </tr>
            {
                requests.allrequests.map((ev)=>{
                    return(
                        <tr>
                             <td>{ev.order_id}</td> 
                            <td>{ev.customerID.firstname} {ev.customerID.lastname}</td> 
                           <td>{ev.customerID.contact}</td> 
                           <td>{ev.customerID.address}</td> 
                           <td>{ev.vehicleID.vehiclenumber},{ev.vehicleID.company},{ev.vehicleID.model}</td> 
                           <td>{ev.requested_date}</td> 
                           <td>{ev.servicing_date}</td> 
                           <td>{ev.order_status}</td> 
                           <td><Link to={`/UpdateStatus/${ev.order_id}`} > UpdateStatus</Link></td>
                           <td><a href="#" onClick={populateServices}>View Services Required</a></td>
                        </tr>
                     )  

                    })
            
            }
            
            </table>          
            </div> 
           
            <br/><br/>
            <div>
            <table  className="table" border="1">
              
                {
                services.allservices.map((ev)=>{
                    return(
                        <tr>
                             <td>{ev.service_id}</td> 
                            <td>{ev.service_name}</td> 
                           <td>{ev.category_id.category_name}</td> 
                           </tr>
                     )  

                    })
            
            }
              
                </table>    
            </div> 
             
        </div>

    )
      
}