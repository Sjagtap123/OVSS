import React, { useState } from 'react'
import "./Reg.style.css";
import { useNavigate} from "react-router-dom";
import { mystore } from './store';


function AddStock()
{   
    //let navigate = useNavigate();
   
    const [state,setState]=useState({
        stock_name:"",
        stock_price:"",
        stock_qty:"",
    });
    const [role,setRole]=useState("");

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
                stock_name: state.stock_name,
                stock_price: state.stock_price,
                stock_qty: state.stock_qty

            })
        }
    
        fetch("http://localhost:8080/getStock",reqOptions)
        .then(resp=> resp.json())
        .then(data=> { console.log(data);
            
            localStorage.setItem("loggedinuser",JSON.stringify(data));
            mystore.dispatch({type: 'STOCK'})
            
          {/*  console.log(JSON.parse(localStorage.getItem("loggedinuser")).user_type);
            let role = (JSON.parse(localStorage.getItem("loggedinuser")).user_type);
            if(role==="customer")
                navigate('/login');
          
        */}
              
            
        });
    }

    return (
        <div className='container-fluid'> 
     <div className="app-wrapper">
         
             <h2 className='title'> Add Stock </h2>
         
         
         <form>
             
             <div className='label'> 
                 <h4 className='sub'> Enter stock_name </h4>
             </div>
             <div className="stock_name">
                <input className='input' type="text" name="stock_name" onChange={handleInput}  placeholder='stock_name' />
                </div>

             <div className="label">
             <h4 className='sub'>Enter stock_price </h4>
              </div> 
              <div className="stock_price">
                 <input className='input'  name="stock_price" onChange={handleInput}  placeholder='stock_price' />
             </div>
             
             <div className="label">
             <h4 className='sub'>Enter stock_qty </h4>
              </div> 
              <div className="stock_qty">
              <input className='input' type="number" name="stock_qty" onChange={handleInput}  placeholder='stock_qty' />
             </div>
             
             
             <input type="submit" name="submit"  onClick={submitData} value="submit" class="btn btn-primary" ></input>

       </form>
       


         </div>
         </div>

    );
}
export default AddStock;