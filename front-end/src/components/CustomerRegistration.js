import React, { useState } from 'react'
import "./Reg.style.css";
import { useNavigate} from "react-router-dom";
import { mystore } from './store';
import Validation from './validation';

function CustomerRegister (){

    let navigate = useNavigate();

    const[errors,setErrors] = useState({});
    const [state,setState]=useState({
        fname:"",
        mname:"",
        lname:"",
        address:"",
        contact:"",
        questionID:0,
        areaID:0,
        email:"",
        password:"",
        vehiclenumber:"",
        company:"",
	    model:"",
	    vehicle_type:""
       
        
    });

    const [role,setRole]=useState("");

    const handleInput=(ev)=>{
        setState((state)=>({
            ...state,
            [ev.target.name]:ev.target.value

        }));
        console.log(ev.target.value);
    }

    const  submitData=(e)=>{
        e.preventDefault();
        setErrors(Validation(state));
        const reqOptions = {
            method: "POST",
            headers: {
                'Content-Type':'application/json'
            },
            body: JSON.stringify({
                email: state.email,
                password: state.password,
                user_type: "customer",
                isactive:1,
	            questionID:state.questionID,
	            answer : state.answer,
	            firstname : state.fname,
	            middlename: state.mname,
	            lastname:state.lname,
	            contact:state.contact,
	            address:state.address,
                areaID:state.areaID,
                vehiclenumber:state.vehiclenumber,
                company:state.company,
                model:state.model,
                vehicle_type:state.vehicle_type
               

            })
        }
    
        
        fetch("http://localhost:8080/register",reqOptions)
        .then(resp=> resp.text())
        .then(data=> { console.log(data);
            
            if(data.length!=0)
            {
                const json=JSON.parse(data);
                if(json.vehicleID!=null)
                {
                alert("Registration successfull");
                navigate("/Login");
                }
            }
              
            
        });
    }

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
            
                <h2 className='title'> Create Account </h2>

                <form>
             
             <div className='label'> 
                 <h4 className='sub'> Enter Email </h4>
             </div>
             <div className="email">
                <input className='input' type="text" name="email" onChange={handleInput}  placeholder='email' value={state.email} />
                </div>
                <div>
                       {errors.email && <p className="error"> {errors.email} </p>}
                  </div>
             <div className="label">
             <h4 className='sub'>Enter Password </h4>
              </div> 
              <div className="password">
                 <input className='input' name="password" type="password" onChange={handleInput}  placeholder='password' value={state.password} />
             </div>
             <div>
                       {errors.password && <p className="error"> {errors.password} </p>}
                </div>
                      
             <div className="label">
             <h4 className='sub'>Enter Firstname </h4>
              </div> 
              <div className="fname">
              <input className='input' type="text" name="fname" onChange={handleInput}  placeholder='Firstname' value={state.fname} />
             </div>
             <div className="label">
                <h4 className='sub'> Enter Middlename </h4>
            </div> 

            <div className="mname">
             <input  className='input' type="text"  name="mname" onChange={handleInput} placeholder='Middlename' value={state.mname} />
            </div>
             <div className="label">
             <h4 className='sub'> Enter Lastname </h4>
              </div> 
              <div className="lname">
                 <input className='input' type="text"  name="lname"  onChange={handleInput} placeholder='Lasttname'value={state.lname} />
             </div>
             <div className="contact">
             <h4 className='sub'>Enter Contact </h4>
              </div> 
              <div className="label">
                 <input className='input' type="text" name="contact" onChange={handleInput}  placeholder='Contact'  value={state.contact}/>
             </div>
             <div className="label">
             <h4 className='sub'> Enter Address </h4>
              </div> 
              <div className="address">
                 <input className='input' type="text"  name="address"  onChange={handleInput} placeholder='Address Line1' value={state.address}/>
             </div>

             <div className="label">
             <h4 className='sub'> Select City</h4>
              </div> 
              <div className="qid">
              <select name="cityID" onChange={(c) => {PopulateArea(c)}}>
              <option> Select any one </option>
                            {                                        
                                        cities.allcities.map((s) => {
                                            return(<option key={s.cityID} value={s.cityID}> {s.cityNM} </option>)
                                        })
                            }
                            </select>
                                

                  </div>

             <div className="label">
                   <h4 className='sub'> select area </h4>
                   </div> 
                  <div className="areaid">
                  <select name="areaID"  onChange={handleInput} >
                  <option> Select any one </option>
                                    { 
                                        
                                        areas.allareas.map((s) => {
                                            return(<option key={s.areaID} value={s.areaID}> {s.areaNM} </option>)
                                        })
                                    }
                  </select> 
            </div>

             <div className="label">
             <h4 className='sub'> Select Question</h4>
              </div> 
              <div className="question">
               
                 <select name="questionID" onChange={handleInput}>
                     <option> Select any one </option>
                            {                                        
                                        questions.allquestions.map((s) => {
                                            //alert(JSON.stringify(s.Statename))
                                            return(<option  key={s.questionID} value={s.questionID}> {s.question} </option>)
                                        })
                            }
                            </select>
             </div>
  
   
             
             <div className="label">
             <h4 className='sub'> Enter Answer </h4>
              </div> 
              <div className="answer">
                 <input className='input' type="text"  name="answer"  onChange={handleInput} placeholder='enter answer'  value={state.answer}/>
             </div>
            {/* <div className="label">
             <h4 className='sub'> Select City</h4>
              </div> 
              <div className="qid">
              <select name="cityID" onChange={(c) => {PopulateArea(c)}}>
              <option> Select one </option>
                            {                                        
                                        cities.allcities.map((s) => {
                                            return(<option key={s.cityID} value={s.cityID}> {s.cityNM} </option>)
                                        })
                            }
                            </select>
                                

                        </div>*/}
            
            
               {/*   <div className="label">
             <h4 className='sub'> select area </h4>
              </div> 
              <div className="areaid">
              <select name="areaID"  onChange={handleInput} >
              <option> Select one </option>
                                    { 
                                        
                                        areas.allareas.map((s) => {
                                            return(<option key={s.areaID} value={s.areaID}> {s.areaNM} </option>)
                                        })
                                    }
                                </select> 
                                </div>*/}
         
             
             <div className="label">
             <h4 className='sub'> Enter Vehicle Number </h4>
              </div> 
              <div className="vid">
                 <input className='input' type="text"  name="vehiclenumber"  onChange={handleInput} placeholder='vehicle number' value={state.vehiclenumber} />
             </div>

             <div className="label">
             <h4 className='sub'> Enter Company </h4>
              </div> 
              <div className="comapny">
                 <input className='input' type="text"  name="company"  onChange={handleInput} placeholder='company' value={state.company} />
             </div>

             <div className="label">
             <h4 className='sub'> Enter Model </h4>
              </div> 
              <div className="mid">
                 <input className='input' type="text"  name="model"  onChange={handleInput} placeholder='model'  value={state.model}/>
             </div>

             <div className="label">
             <h4 className='sub'> Enter vehicle type </h4>
              </div> 
              <div className="vtype">
                 <input className='input' type="text"  name="vehicle_type"  onChange={handleInput} placeholder='Two wheeler or Four wheeler'  value={state.vehicle_type} />
             </div>
             
             
             <input type="submit" name="submit"  onClick={submitData} value="submit" className="btn btn-primary" ></input>

       </form>
       


         </div>
         </div>
   
 );
}
export default CustomerRegister;



      



