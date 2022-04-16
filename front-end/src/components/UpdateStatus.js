import { useEffect, useState } from "react";
import React from 'react';
import "./Reg.style.css";
import { ReactDOM } from 'react';
import { Link, useLocation, useNavigate, useParams } from "react-router-dom";
import reactDom from "react-dom";


export  function UpdateStatus(props)
{
    let navigate = useNavigate();
    const {id} =useParams();
  
    const [state,setState]=useState({
        order_status:"",
        order_id:0
    });
    
    const handleInput=(ev)=>{
        setState((state)=>({
            ...state,
            [ev.target.name]:ev.target.value

        }));
        //alert(ev.target.value);
    }
   

const  submitData=(e)=>{
    e.preventDefault();
    const reqOptions = {
        method: "POST",
        headers: {
            'Content-Type':'application/json'
        },
        body: JSON.stringify({
            order_status: state.order_status,
            order_id:id  

        })
    }

   fetch("http://localhost:8080/UpdateStatus/",reqOptions)
       .then(resp => resp.text())//.then(data => alert(JSON.stringify(data)))
       .then(data => {console.log(data);
        alert("Status Update Success");
        navigate("/employeehome");
    });
}
      return (
        <div className="container">
             <div>
             <h3> Update Status </h3>
             </div> 
             <hr />
             
             <form>
            <div className="order_status">
            <h5 className="form-label col-md-2">Select Status:</h5>
                 <select name="order_status" onChange={handleInput}>
                 <option>Select One</option>
                            <option>In Progress</option>
                            <option>Completed</option>
                            </select>
             </div>
             <input type="submit" name="submit"  onClick={submitData} value="submit" class="btn btn-primary" ></input> 
            
            </form>
        </div>

    )
      
}