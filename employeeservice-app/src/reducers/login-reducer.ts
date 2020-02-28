import { IUserState } from "."
import { loginTypes } from "../action-mappers/login-action";

// first, we define the initial state of this piece of the store
const initialState:IUserState = {
    currentUser:null,
    loginMessage:''
}


export const loginReducer = (state = initialState, action:any) => {
   
    switch (action.type) {
        case loginTypes.SUCCESSFUL_LOGIN:{
            return {
                ...state,
                currentUser:action.payload.currentUser,
                loginMessage: 'You have Logged in'
            }
        }
        case loginTypes.LOGOUT: {
            return {
                ...state,
                currentUser: null
            }
        } 
        case loginTypes.UNSUCCESSFUL_LOGIN: {
            return {
                ...state,
                loginMessage:action.payload.loginMessage
            }
        } 
    
        default:
            return state;
    }
}