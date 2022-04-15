import { useEffect, useState } from "react";
import React from 'react';
import "./Reg.style.css";
import { ReactDOM } from 'react';
import { Link, useLocation, useNavigate, useParams } from "react-router-dom";
import reactDom from "react-dom";

export  function ServiceDetails(props)
{
    

    const search = useLocation().search;
    const {id} =useParams();

    const[services,setServices] = useState({
        allservices : []
    });

    React.useEffect(() => {
        console.log("hello...");
        fetch("http://localhost:8080/getservicedetails/"+id)
        .then(resp=>resp.json())
        .then(data=>setServices({allservices:data}))
        
      },[]);

     {/* let navigate=useNavigate();
      const handleLogout=()=>{
          myStore.dispatch({type:'LOGGEDOUT'});
          localStorage.removeItem("loggedinuser");
          navigate("/home");
      }*/}

    return (
        <div className="servicedetails">
             <div>
             <h3> Owner  Information </h3>
             
             <table  className="table owner-details " border="1">
            <tr>
                <th> SERVICE ID </th>
                <th> SERVICE NAME  </th>
                <th> PRICE </th>
                <th> OWNER NAME </th>
                

            </tr>
            {
                services.allservices.map((ev)=>{
                    return(
                        <tr>
                           <td>{ev.service.service_id}</td> 
                           <td>{ev.service.service_name}</td> 
                           <td>{ev.price}</td> 
                           <td>{ev.owner.ownerName}</td> 
                           

                        </tr>

                        
                     )  

                    })
            
            }

            <tr>
                <td>  <Link to={`/bookapt/${id}`} > Book Appointment </Link> </td>
            </tr>
            <tr>
                <td> <Link to={`/getfeedback/${id}`} > View Feedbacks </Link> </td>
            </tr>
            </table>

            
                

          
             

       
         
            
         
            </div>
         
            
        </div>
    )
      

}