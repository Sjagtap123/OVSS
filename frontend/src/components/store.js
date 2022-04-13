import { createStore } from "redux";


const initialState = {count: 10}

const myreducer = function(state=initialState, action) {
    switch(action.type)
    {
        case 'INCREMENT' :
            return {...state, count: state.count + 1}
        case 'DECREMENT':
            return {...state, count: state.count - 1}
        

    }
}

const mystore = createStore(myreducer, initialState);

export {initialState, myreducer, mystore}