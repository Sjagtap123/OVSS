import React, { useState } from 'react'
import "./Reg.style.css";
import { useNavigate} from "react-router-dom";
import { mystore } from './store';


function AddServiceDetails()
{   
    //let navigate = useNavigate();

    const[categories,setcategories] = useState({
        allcategories : []
    });
    const[services,setservices] = useState({
        allservices : []
    });
    let ownerid=JSON.parse(localStorage.getItem("loggedinuser")).ownerid;
    const [state,setState]=useState({
        "service_id":0,
        "ownerid":0,
        "price":0,
        "description":""
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
                service_id:state.service_id,
                ownerid:ownerid,
                price:state.price,
                description:state.description

            })
        }
    
        fetch("http://localhost:8080/addServiceDetails",reqOptions)
        .then(resp=> resp.json())
        .then(data=> { console.log(data);
                
        });
    }

    React.useEffect(() => {
        fetch("http://localhost:8080/getAllCat")
        .then(resp => resp.json())
        //.then(data => alert(JSON.stringify(data)))
        .then(data => setcategories({allcategories : data}))
        //alert(JSON.stringify(cities.allcities))


       }, []);
    const PopulateService = (c) => 
    {     
       fetch("http://localhost:8080/getallservicesbyCat/"+c.target.value)
      .then(resp => resp.json())//.then(data => alert(JSON.stringify(data)))
      .then(data => setservices({allservices : data}))

    }

    return (
        <div className='container-fluid'> 
     <div className="app-wrapper">
         
             <h2 className='title'> Add Service Details </h2>
         
         
         <form>

         <div className="label">
             <h4 className='sub'> Select Category</h4>
              </div> 
         <div className="category_id">
              <select name="category_id" onChange={(c) => {PopulateService(c)}}>
              <option> Select one </option>
                            {                                        
                                        categories.allcategories.map((s) => {
                                            return(<option key={s.category_id} value={s.category_id}> {s.category_name} </option>)
                                        })
                            }
                            </select>
                                

                  </div>
         <div className="label">
             <h4 className='sub'> Select Service</h4>
              </div> 
              <div className="service_id">
               
                 <select name="service_id" onChange={handleInput}>
                     <option> Select one </option>
                            {                                        
                                        services.allservices.map((s) => {
                                            //alert(JSON.stringify(s.Statename))
                                            return(<option  key={s.service_id} value={s.service_id}> {s.service_name} </option>)
                                        })
                            }
                            </select>
             </div>

             <div className="label">
             <h4 className='sub'>Enter price/rate </h4>
              </div> 
              <div className="price">
                 <input className='input' type="number"  name="price" onChange={handleInput}  placeholder='enter price' />
             </div>
             
             <div className="label">
             <h4 className='sub'>Write description </h4>
              </div> 
              <div className="description">
              <input className='input' type="text" name="description" onChange={handleInput}  placeholder='Write description' />
             </div>
             
             
             <input type="submit" name="submit"  onClick={submitData} value="submit" class="btn btn-primary" ></input>

       </form>
       


         </div>
         </div>

    );
}
export default AddServiceDetails;