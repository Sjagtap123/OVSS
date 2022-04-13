import{useState} from 'react'
import{ReactDOM} from 'react-dom';
import React, { useCallback } from 'react';
import { mystore } from './store';
import { Link, useNavigate } from "react-router-dom";
import "./Reg.style.css";




function FindGarages()
{
    const[areas,setAreas]=useState({
       allareas : []
       
    });
    const[cities,setCities] = useState({
        allcities : []
       
    });
    const[garages,setGarages] = useState({
        allgarages : []
    });
    
    const[services,setServices] = useState({
        allservices : []
    });
    

    React.useEffect(() => {
        fetch("http://localhost:8080/getallcities")
        .then(resp => resp.json())
        //.then(data => alert(JSON.stringify(data)))
        .then(data => setCities({allcities : data}))
        //alert(JSON.stringify(cities.allcities))

      }, []);
     
     const PopulateArea = (c) => 
     {     
        fetch("http://localhost:8080/getarea/"+c.target.value)
       .then(resp => resp.json())//.then(data => alert(JSON.stringify(data)))
       .then(data => setAreas({allareas : data}))

     }

     const PopulateGarages = (g) => 
     {     
        fetch("http://localhost:8080/getOwnerbyArea/"+g.target.value)
       .then(resp => resp.json())//.then(data => alert(JSON.stringify(data)))
       .then(data => setGarages({allgarages : data}))

       

     }

    {/* const PopulateServices = (sr) => 
     {     
        fetch("http://localhost:8080/getservicedetails/"+sr.target.value)
       .then(resp => resp.json()).then(data => alert(JSON.stringify(data)))
       .then(data=> setServices({allservices : data}))
        
      {/*  localStorage.setItem("services",JSON.stringify(data));
        mystore.dispatch({type: 'SERVICES'})

     }
     */}
            


     
    
    return (
        <div className='findgarage'>
                <form >
                    <div>
                           <p> SELECT CITY: </p> 
                            <select name="city" onChange={(c) => {PopulateArea(c)}}>
                            <option>select one</option>
                            {                                        
                                        cities.allcities.map((s) => {
                                            return(<option value={s.cityID}> {s.cityNM} </option>)
                                        })
                            }
                            </select>  
                        </div>
                        <div> 
                        <p>SELECT AREA : </p>
                        <select name="area" onChange={(g) => {PopulateGarages(g)}} >
                                   
                        <option>select one</option>
                         { 
                                    areas.allareas.map((s) => {
                                            return(
                                           
                                            <option value={s.areaID}> {s.areaNM} </option>)
                                        })
                                    }
                                </select> 
                         </div>
                         
                        </form>
                        
                                                  
                       <p> Garages available : </p>
                        <table border="1" className='table table-striped '>
                        <tr><th>Owner ID</th>
                        <th>Garage Name</th>
                        <th>AddressLine1</th>
                        <th>AddressLine2</th>
                        <th>Pincode</th>
                        <th>contact</th>
                        </tr>
                                    { 
                                        
                                        garages.allgarages.map((s) => {
                                            return(
                                                
                                                <tr>
                                                <td>{s.ownerid }</td>
                                                <td>{s.ownerName }</td>
                                                <td>{s.addressLine1}</td>
                                                <td>{s.addressLine2}</td>
                                                <td>{s.pincode}</td>
                                                <td>{s.contact}</td>
                                               <td><Link to={`/getservicedetails/${s.ownerid}`} > View Owner</Link> </td>
                                              
                                            </tr>
                                      

                                                )
                                        })
                                       
                                    }
                                     
                                 </table>
                                 
                                
                                 </div>
    )
}
export default FindGarages;