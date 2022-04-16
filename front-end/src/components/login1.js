import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';
import "./login.style.css";
import { mystore } from './store';
import Validation from './validation';



  function Login ()
  {
    let navigate = useNavigate();
   
   const[state,setState] = useState({
        email:"",
        password:"",
        customer:{},
        owner:{},
        employee:{},
        admin:{},
        loginerror:""
        
   }); 

   const[errors,setErrors] = useState({});
  
   const handleInput=(ev)=>{

    setState((state)=> ({
        ...state,
        [ev.target.name]: ev.target.value
    }));
} 

function refreshPage() {
    window.location.reload(false);
  }
 
const  submitData=(e)=>{
    e.preventDefault();
    //setErrors(Validation(state));
    const reqOptions = {
        method: "POST",
        headers: {
            'Content-Type':'application/json'
        },
        body: JSON.stringify({
            email: state.email,
            password: state.password,
        })
    }

    fetch("http://localhost:8080/checkLogin",reqOptions)
    .then(resp=> resp.text())
    .then(data=> { console.log(data);

        if(data.length!=0)
        {
            
           console.log(data);
           const json = JSON.parse(data);
           if(json.login.userType == "customer")
           {
               setState({customer:json});

               localStorage.setItem("loggedinuser",JSON.stringify(json));
               mystore.dispatch({type:"LOGGEDIN"})
               navigate("/customerhome")
           }
           else if(json.login.userType == "owner")
           {
            setState({owner:json});

            localStorage.setItem("loggedinuser",JSON.stringify(json));
            mystore.dispatch({type:"LOGGEDIN"})
            navigate("/ownerhome")
           }
           else if(json.login.userType == "employee")
           {
            setState({employee:json});

            localStorage.setItem("loggedinuser",JSON.stringify(json));
            mystore.dispatch({type:"LOGGEDIN"})
            navigate("/employeehome")
           }
           else if(json.login.userType == "admin")
           {
            setState({admin:json});

            localStorage.setItem("loggedinuser",JSON.stringify(json));
            mystore.dispatch({type:"LOGGEDIN"})
            navigate("/adminhome")
           }
           else{
               state({loginerror:"Wrong ID Password"})
           }
        }
        else{
        
            alert("email/password incorrect");
            refreshPage();
        }
        
        {/*localStorage.setItem("loggedinuser",JSON.stringify(data));
       

        
        
        console.log(JSON.parse(localStorage.getItem("loggedinuser")).login.userType);
      //  let role = (JSON.parse(localStorage.getItem("loggedinuser")).login.userType);
       
        mystore.dispatch({type: 'LOGGEDIN'})
     
        let role = (JSON.parse(localStorage.getItem("loggedinuser")).login.userType);
        if(role=="customer")
        //this.props.history.push("/customerhome");
            navigate('/customerhome');
        else if(role=="owner")
           navigate("/ownerhome");
        else if(role=="employee")
           navigate("/employeehome");
        else if(role=="admin")
    navigate("/adminhome");*/}

       
    });
}



    

        return (
            <div className='container-fluid'> 
               <div className="app-wrapper">
                   
                       <h2 className='title'> LOGIN </h2>
                     
                    
                   <form>
                       
                       <div className='label'> 
                           <h4 className='sub'>  Email </h4>
                       </div>
                       <div className="email">
                       <input className='input' type="text" name="email"  onChange={handleInput} /> 
                       
                  </div>
                  <div>
                       {errors.email && <p className="error"> {errors.email} </p>}
                  </div>
                       <div className="label">
                       <h4 className='sub'> Password </h4>
                      
                        </div> 
                        <div className="password">
                        <input className='input' type="password" name="password"   onChange={handleInput} />
                      
                       </div>
                  <div>
                       {errors.password && <p className="error"> {errors.password} </p>}
                </div>
                      
                      
                       <div>
                           <p> </p>
                       </div>
                       
                         <input type="submit" value="SignIn" name="login"  onClick={submitData} class="btn btn-primary"/>
                       
                        
                       <div>
                           <p> </p>
                       </div>

                     
                 </form>
                 
                
                 
                

                 <div>
                           <a href="#" > Forgot Password </a>
                       </div>


                       <div>
                           <a href="#" > Contact us </a>
                       </div>
                 </div>

               
            </div>
             
            
            
        );
    
}

export default Login;