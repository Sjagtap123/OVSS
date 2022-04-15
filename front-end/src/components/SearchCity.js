import React from 'react';

class SearchCity extends  React.Component{
    constructor(props)
    {
        super(props);
        this.state={
            cities: [],
            cityID: 0
        }
        this.cityID = this.cityID.bind(this)
    }

    componentDidMount=()=>{
        fetch("http://localhost:8080/allcities")
        .then(resp => resp.json())
        .then(data => this.setState({cities:data}));
    }
    
    cityID=(e)=>{
    this.setState({cityID: e.target.value})
    }

    render(){
        return(
            <div>
                Select city :
                <select name="city" onChange={(e)=>{this.cityID(e)}}>
                    {
                        this.state.cities.map(city => {
                            return(<option value={city.cityID}>{city.cityNM} </option>)
                        })
                    }
                </select> <br />
                <p> {this.state.cityID} </p>

        


            </div>
        )
    }


}

export default SearchCity;