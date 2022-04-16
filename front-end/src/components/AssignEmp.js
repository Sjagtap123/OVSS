import { useEffect, useState } from "react";
import React from 'react';
import "./Reg.style.css";
import { ReactDOM } from 'react';
import { Link, useLocation, useNavigate, useParams } from "react-router-dom";
import reactDom from "react-dom";


export  function AssignEmp(props)
{
    let navigate = useNavigate();
    const {id} =useParams();
    let ownerid=JSON.parse(localStorage.getItem("loggedinuser")).ownerid;
    const[employee,setEmployee] = useState({
        allemployee : []
    });
    const [state,setState]=useState({
        empid:0,
        order_id:0
    });
    
    const handleInput=(ev)=>{
        setState((state)=>({
            ...state,
            [ev.target.name]:ev.target.value

        }));
    }
   
    React.useEffect(() => {
        fetch("http://localhost:8080/getEmpbyoid/"+ownerid)
        .then(resp => resp.json())
        .then(data => setEmployee({allemployee:data}));
       

        
        
      },[]);

const  submitData=(e)=>{
    e.preventDefault();
    const reqOptions = {
        method: "POST",
        headers: {
            'Content-Type':'application/json'
        },
        body: JSON.stringify({
            empid: state.empid,
            order_id:id  

        })
    }

   fetch("http://localhost:8080/AssignEmp/",reqOptions)
       .then(resp => resp.text())//.then(data => alert(JSON.stringify(data)))
       .then(data => {console.log(data);
        alert("Task Assigned Success");
        navigate("/ownerhome");
    });
}
      return (
        <div className="container">
             <div>
             <h3> Assign Emp </h3>
             </div> 
             <hr />
             
             <form>
            <div className="empid">
            <h5 className="form-label col-md-2">Select Employee:</h5>
                 <select name="empid" onChange={handleInput}>
                 <option>Select One</option>
                            {                                        
                                        employee.allemployee.map((s) => {
                                            //alert(JSON.stringify(s.Statename))
                                            return(<option  key={s.empid} value={s.empid}> {s.firstname} </option>)
                                        })
                            }
                            </select>
             </div>
             <input type="submit" name="submit"  onClick={submitData} value="submit" class="btn btn-primary" ></input> 
            
            </form>
        </div>

    )
      
}