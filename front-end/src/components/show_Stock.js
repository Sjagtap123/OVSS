import{useState} from 'react'
import { ReactDOM } from 'react';
import {Link, useNavigate } from 'react-router-dom';
import React, { useCallback } from 'react';
import "./Reg.style.css";

export default function ShowStock()
{
        const [stock, setStock] = useState([]);
    const [stock_name, setName] = useState("");
    const [stock_price, setprice] = useState(null);
    const [stock_qty, setqty] = useState(null);
    const [stockID,setstockID]=useState(null);
    let navigate = useNavigate();
    React.useEffect(() => {
    fetch("http://localhost:8080/AllStock")
        .then(resp => resp.json())//.then(data => alert(JSON.stringify(data)))
        .then(data => setStock(data))
    }, []);

    function selectUser(stockID)
    {
        let item=stock[stockID-1];
        setName(item.stock_name)
        setprice(item.stock_price)
        setqty(item.stock_qty);
        setstockID(item.stockID)
        //alert(item.stockID);
    }
    function refreshPage() {
        window.location.reload(false);
      }
    function updateStock()
    {
      let item={stock_name,stock_price,stock_qty,stockID}
      console.warn("item",item)
      fetch("http://localhost:8080/updatestock", {
        method: 'PUT',
        headers:{
          'Accept':'application/json',
          'Content-Type':'application/json'
        },
        body:JSON.stringify(item)
      }).then((result) => {
        result.json().then((resp) => {
            console.log(resp);
            if(resp.length!=0){
               { alert("SUCCESSS"); 
                refreshPage();
            }
            }else
            {
                alert("SOMETHING WENT WRONG");
            }
      
        })
      })
    }

return (
    
    
       <div className="stocks"> 
       <div className="stock-info">
       <h2 style={{color:"black"}}> Stock Information </h2>
       <p></p>
       <hr/>
        <table class="table table-striped table-bordered" border="1" style={{ float: 'left' }}>
            <tbody>
            <tr>
                <th> # </th>
                <th> name </th>
                <th> price  </th>
                <th> qty  </th>
                <th> Operations  </th>

            </tr>
           
            {
                stock.map((v)=>
                    
                        <tr >
                            <td>{v.stockID}</td> 
                           <td>{v.stock_name}</td> 
                           <td>{v.stock_price}</td>
                           <td>{v.stock_qty}</td> 
                           <td><a href="#update" onClick={()=> selectUser(v.stockID)}>Update</a></td>
                        </tr>
                    
                )
            }
             </tbody>
        </table>
        <div>
            <a id='update'></a>
        <div >
            Name : 
        <input type="text" value={stock_name} onChange={(e)=>{setName(e.target.value)}} /> <br /><br />
            Price  :
        <input type="number" value={stock_price} onChange={(e)=>{setprice(e.target.value)}} /> <br /><br />
        Qty :
        <input type="number" value={stock_qty}  onChange={(e)=>{setqty(e.target.value)}} /> <br /><br />
        <button onClick={updateStock} >Update Stock</button>  
      </div>


        </div>
        </div>
    </div>
)
        }

