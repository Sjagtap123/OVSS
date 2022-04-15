
const Validation = (values) => {

    let errors = {};

    if(!values.email){
         errors.email="Email is required."
    }
    else if(!/\S+@\S+\.\S+/.test(values.email)){
        errors.email="Email is invalid."
    }
    if(!values.password){
        errors.password="Passord is required."
    }
    else if(values.password < 3 ){
        errors.password="Password must be more than 3 characters."
    }

    return errors;
}

export default Validation;