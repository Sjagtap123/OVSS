import React, { Component, useState } from "react";
import   "./faq.css"



export function FAQ1() {
  
    const [selected,setSelected] = useState(null)
 
    const toggle = (i)=>{
      if(selected === i) {
          return setSelected(null)
      }     
     
      setSelected(i)
    }

    return (
        <div className="container-fluid">
         <div class="wrapper">
            
          <div className="accordion"> 
          <h1> Frequently Asked Questions </h1>
          {data.map((item, i) =>(
              <div className="item">
                  <div className="title" onClick={() => toggle(i)} >
                      <h5> {item.question}</h5>
                      <span> {selected === i ? '-' : '+' } </span>
                      </div>
                      <div className={selected === i ? 'content-show':'content '}> {item.answer}</div>
                  </div>
                
             ))}
        </div>
      </div>
      </div>
    )
  }

   const data = [
    {
        
        question:"What is Car Service App?",
        answer:"   Car service is a platform to book your car service and track it from our web App."
    },
    {
        
        question:"What is An Oil Change?",
        answer:" Your motor oil is considered the lifeblood of your vehicle because it protects and keeps your engine performing correctly. An oil change iswhen you drain the old, dirty oil out of the reservoir and replace it with the proper amount of clean conventional or synthetic motor oil."
    },
    {
        
        question:"Why Are Routine Oil Changes Important?",
        answer:"   Because your motor oil is there to protect your engine, it's important that you have it changed during the recommended mileage intervals to keep your engine performing at the highest level. The motor oil is responsible for catching any loose dirt, dust or debris that might find its way into your engine, while also working to cool and lubricate the many moving engine parts. When you don't change your oil after therecommended amount of miles traveled, it can end up affecting your engine and the overall performance of your vehicle."
    },

    {
        
        question:"What is Recommended Routine Maintenance?",
        answer:"   For routine and seasonal maintenance, we'll give your vehicle a full multi-point inspection to find out what needs attention. We suggest an oil change, tire rotation, fluid replacement, wheel alignment, and moreso you can drive with confidence knowing that your vehicle is prepared to continue performing at a high level well into the future."
    }
    
]