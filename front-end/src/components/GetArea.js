import{useState} from 'react'
import{ReactDOM} from 'react-dom';
import React, { useCallback } from 'react';

function Register()
{
    // const[areas,setArea]=useState({
    //    areas : []
       
    // });
    const[cities,setCities] = useState({
        cities : []
    })
    // const[questions,setquestions] = useState({
    //     allquestions : []
    // })

    React.useEffect(() => {
        
        fetch("http://localhost:8080/getallcities")
        .then(resp => resp.json())
        .then(data => this.setCities({cities:data}));

      }, []);

    // const PopulateAreas = (a) => 
    // {     
            
    //              fetch("http://localhost:8080/getarea/"+a.target.value)
    //             .then(resp => resp.json())
    //              .then(data => this.setState({areas:data})); 
        
    //  }

        

    
    return (
        <div>

{/*                
                 SELECT AREA: 
                            
                    <select name="area" onChange={(a)=>{PopulateAreas(a)}}>
                    {
                        areas.allareas.map((a) => {
                            return(<option key={a.areaID} value={a.areaID}>{a.areaNM} </option>)
                        })
                    }
                    </select> <br />
 */}

             
                        SELECT CITY : 
                        
                     <select name="city">
                    {
                        cities.allcities.map((city) => {
                            return(<option value={city.cityid}>{city.citynm} </option>)
                        })
                     }
                    </select> <br />
                    {/* <p> {this.state.cityID} </p> */}
                
                       
                        
                         {/* SELECT QUESTION :
                       
                            <select name="question">
                            {                                        
                                    questions.allquestions.map((s) => {
                                     //alert(JSON.stringify(s.Statename))
                                    return(<option value={s.qid}> {s.question} </option>)
                                    })
                            }
                            </select>
                       
                         */}
                    
        </div>
    )
}
export default Register;