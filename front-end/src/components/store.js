import { createStore } from "redux";
import reducer1 from "./reducer1";


const initialSt = {loggedin: false};
const mystore =  createStore(reducer1, initialSt);


export {initialSt, reducer1, mystore}
//export default mystore;