import React, { useState } from 'react'
import "./Reg.style.css";
import { useNavigate} from "react-router-dom";
import { mystore } from './store';


function RegisterEmp()
{   
    //let navigate = useNavigate();
   
    const [state,setState]=useState({
        email:"",
        password:"",
        answer:"",
        fname:"",
        mname:"",
        lname:"",
        address:"",
        contact:"",
        joindate:"",
        questionID:1,
        ownerID:""
       
       
    });

    const[questions,setquestions] = useState({
        allquestions : []
    })
  
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
                user_type: "employee",
                 isactive:1,
	         questionID:state.questionID,
	         answer : state.answer,
	        firstname : state.fname,
	         middlename: state.mname,
	        lastname:state.lname,
	        contact:state.contact,
	         address:state.address,
             joindate:state.joindate,
             ownerID:state.ownerID

            })
        }
    
        fetch("http://localhost:8080/regemp",reqOptions)
        .then(resp=> resp.json())
        .then(data=> { console.log(data);
            
          {/*  localStorage.setItem("loggedinuser",JSON.stringify(data));
            mystore.dispatch({type: 'LOGGEDIN'})
            
            console.log(JSON.parse(localStorage.getItem("loggedinuser")).user_type);
            let role = (JSON.parse(localStorage.getItem("loggedinuser")).user_type);
            if(role==="customer")
                navigate('/login');
          
        */}
           
       
        });
    }

    React.useEffect(() => {
        
        fetch("http://localhost:8080/getallquestions")
        .then(resp => resp.json())//.then(data => alert(JSON.stringify(data)))
        .then(data => setquestions({allquestions : data}))

      }, []);

    return (
        <div className='container-fluid'> 
     <div className="app-wrapper">
         
             <h2 className='title'> Create Employee Account </h2>
         
         
         <form>
             
             <div className='label'> 
                 <h4 className='sub'> Enter Email </h4>
             </div>
             <div className="email">
                <input className='input' type="text" name="email" onChange={handleInput}  placeholder='email' value={state.email} />
                </div>
             <div className="label">
             <h4 className='sub'>Enter Password </h4>
              </div> 
              <div className="password">
                 <input className='input' name="password" type="password" onChange={handleInput}  placeholder='password' value={state.password} />
             </div>
             
             <div className="label">
             <h4 className='sub'>Enter Firstname </h4>
              </div> 
              <div className="fname">
              <input className='input' type="text" name="fname" onChange={handleInput}  placeholder='Firstname' value={state.fname}/>
             </div>
           
             <div className="label">
             <h4 className='sub'> Enter Lastname </h4>
              </div> 
              <div className="lname">
                 <input className='input' type="text"  name="lname"  onChange={handleInput} placeholder='Lasttname' value={state.lname}/>
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
                 <input className='input' type="text"  name="address"  onChange={handleInput} placeholder='Address'value={state.address} />
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
                       <h4 className='sub'> Enter answer </h4>
                        </div> 
                        <div className="answer">
                           <input  className='input' type="text"  name="answer" onChange={handleInput} placeholder='answer'  />
                           
                       </div>
             <div className="label">
             <h4 className='sub'> Enter joindate </h4>
              </div> 
              <div className="joindate">
                 <input className='input' type="date"  name="joindate"  onChange={handleInput} placeholder='joindate' />
             </div>
             
             <div className="label">
             <h4 className='sub'> Enter ownerID </h4>
              </div> 
              <div className="ownerID">
                 <input className='input' type="number"  name="ownerID"  onChange={handleInput} placeholder='aiownerIDd' />
             </div>
            
             
             <input type="submit" name="submit"  onClick={submitData} value="submit" class="btn btn-primary" ></input>

       </form>
       


         </div>
         </div>

    );
}
export default RegisterEmp;