import { useEffect, useState } from "react";
import React from 'react';
import "./Reg.style.css";
import { ReactDOM } from 'react';
import { Link, useLocation, useNavigate, useParams } from "react-router-dom";
import reactDom from "react-dom";


export  function AddFeedback(props)
{
    let navigate = useNavigate();
    const {id} =useParams();
    let cid=JSON.parse(localStorage.getItem("loggedinuser")).customerID;
  
    var today = new Date();
    var date = today.getFullYear()+'-'+(today.getMonth()+1)+'-'+today.getDate();
  // alert(date);
    const [state,setState]=useState({
        customer:0,
        owner:0,
        feedback_text:"",
        created_on:'0000-00-00'
    });
    
    const handleInput=(ev)=>{
        setState((state)=>({
            ...state,
            [ev.target.name]:ev.target.value

        }));
        
    }
   

const  submitData=(e)=>{
    e.preventDefault();
    const reqOptions = {
        method: "POST",
        headers: {
            'Content-Type':'application/json'
        },
        body: JSON.stringify({
            customer: cid,
             owner:id,
           feedback_text:state.feedback_text,
           created_on:state.created_on

        })
    }

   fetch("http://localhost:8080/addfeedback/",reqOptions)
       .then(resp => resp.text())//.then(data => alert(JSON.stringify(data)))
       .then(data => {console.log(data);
        alert("feedback added");
        navigate("/customerhome");
    });
}
      return (
        <div className="container">
             <div>
             <h3> Provide Feedback </h3>
             </div> 
             <hr />
             
             <form>
            <div className="feedback_text">
                <textarea name="feedback_text" onChange={handleInput}></textarea>
             </div>
             <div className="created_on">
                 <input type="date" name="created_on" onChange={handleInput}></input>
             </div>
             <input type="submit" name="submit"  onClick={submitData} value="submit" class="btn btn-primary" ></input> 
            
      </form>
        </div>

    )
      
}