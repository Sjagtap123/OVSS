import React, { useState } from 'react'
import "./Reg.style.css";
import { useNavigate} from "react-router-dom";
import { mystore } from './store';


function RegistrationOwner()
{   
    let navigate = useNavigate();
    const[areas,setAreas]=useState({
        allareas : []
        
     });
     const[cities,setCities] = useState({
         allcities : [],
        // cityID:0
     })
     const[questions,setquestions] = useState({
         allquestions : []
     })
   
    const [state,setState]=useState({
        oname:"",
        addressLine1:"",
        addressLine2:"",
        pincode:"",
        contact:"",
        questionID:0,
        answer:"",
        areaID:0,
        email:"",
        password:"",
        cityID:""
        
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
                email: state.email,
                password: state.password,
                user_type: "owner",
                 isactive:1,
	             questionID:state.questionID,
	            ownerName : state.oname,
	            contact:state.contact,
                addressLine1:state.addressLine1,
                addressLine2:state.addressLine2,
                pincode:state.pincode,
	            areaID:state.areaID,
                answer:state.answer

            })
        }
    
        fetch("http://localhost:8080/addowner",reqOptions)
        .then(resp=> resp.json())
        .then(data=> { console.log(data);
            
            alert("Owner registered successfully");
           {/* localStorage.setItem("loggedinuser",JSON.stringify(data));
        mystore.dispatch({type: 'LOGGEDIN'})*/}
                    
        });
    }

    React.useEffect(() => {
        fetch("http://localhost:8080/getallcities")
        .then(resp => resp.json())
        //.then(data => alert(JSON.stringify(data)))
        .then(data => setCities({allcities : data}))
        //alert(JSON.stringify(cities.allcities))

        fetch("http://localhost:8080/getallquestions")
        .then(resp => resp.json())//.then(data => alert(JSON.stringify(data)))
        .then(data => setquestions({allquestions : data}))

      }, []);
      //c.target.value
     const PopulateArea = (c) => 
     {     
        fetch("http://localhost:8080/getarea/"+c.target.value)
       .then(resp => resp.json())//.then(data => alert(JSON.stringify(data)))
       .then(data => setAreas({allareas : data}))

     }

    return (

        
        <div className='container-fluid'> 
     <div className="app-wrapper">
         
             <h2 className='title'> Create  Owner Account </h2>
         
         
         <form>
             
             <div className='label'> 
                 <h4 className='sub'> Enter Email </h4>
             </div>
             <div className="email">
                <input className='input' type="text" name="email" onChange={handleInput}  placeholder='email' value={state.email}/>
                </div>
             <div className="label">
             <h4 className='sub'>Enter Password </h4>
              </div> 
              <div className="password">
                 <input className='input' name="password" type="password" onChange={handleInput}  placeholder='password' value={state.password} />
             </div>
             <div className="label">
             <h4 className='sub'>Enter Owner(Service Station) Name </h4>
              </div> 
              <div className="oname">
              <input className='input' type="text" name="oname" onChange={handleInput}  placeholder='Enter Owner(Service Station) Name'  value={state.oname}  />
             </div>
            
             <div className="label">
             <h4 className='sub'> Enter Address </h4>
              </div> 
              <div className="address">
                 <input className='input' type="text"  name="addressLine1"  onChange={handleInput} placeholder='addressLine1' value={state.addressLine1}  /> 
             </div>
             <div className="address">
                 <input className='input' type="text"  name="addressLine2"  onChange={handleInput} placeholder='addressLine2'  value={state.addressLine2} /> 
             </div>
             <div className="contact">
             <h4 className='sub'>Enter Pincode</h4>
              </div> 
              <div className="label">
                 <input className='input' type="text" name="pincode" onChange={handleInput}  placeholder='Enter Pincode'  value={state.pincode}  />
             </div>
             <div className="contact">
             <h4 className='sub'>Enter Contact </h4>
              </div> 
              <div className="label">
                 <input className='input' type="text" name="contact" onChange={handleInput}  placeholder='Contact' value={state.contact} />
             </div>

           

             <div>
                      <h5 className="form-label col-md-2">Security Question:</h5>
					  <select className="form-select"  name="questionID"  onChange={handleInput} >
                          <option>Select question</option>
						     {
								 questions.allquestions.map((s) => {
								 return(<option key={s.questionID} value={s.questionID}>{s.question}</option>)
								 })
							 }
                         
                      </select>
                  </div>
                  <div className="label">
                  </div> 
         
             <div className="label">
             <h4 className='sub'> Enter Answer </h4>
              </div> 
              <div className="answer">
                 <input className='input'  type="text"  name="answer"  onChange={handleInput} placeholder='enter answer' value={state.answer}/> 
             </div>
             

             <div className="label">
             <h4 className='sub'> select city </h4>
              </div> 
              <div className="city">
              <select name="cityID" onChange={(c) => {PopulateArea(c)}}>
                            {                                        
                                        cities.allcities.map((s) => {
                                            return(<option value={s.cityID}> {s.cityNM} </option>)
                                        })
                            }
                            </select>
             </div>

             <div className="label">
             <h4 className='sub'> select area </h4>
              </div> 
              <div className="areaid">
              <select name="areaID"  onChange={handleInput} >
                                    { 
                                        
                                        areas.allareas.map((s) => {
                                            return(<option value={s.areaID}> {s.areaNM} </option>)
                                        })
                                    }
                                </select> 
             </div>
            
            
             
             <input type="submit" name="submit"  onClick={submitData} value="submit" class="btn btn-primary" ></input>

       </form>
       


         </div>
        </div> 

);
}
export default RegistrationOwner;