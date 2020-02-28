import { IRegisterState } from ".";
import { registerTypes } from "../action-mappers/register-action";



const initialState:IRegisterState = {
    message:''
}

export const registerReducer = (state = initialState, action:any) => {
    switch (action.type) {
        case registerTypes.SUCCESSFUL_REGISTRATION:{
            return {
                ...state,
                message: 'Employee been registered!'
            }
        }
        case registerTypes.UNSUCCESSFUL_REGISTRATION: {
            return {
                ...state,
                message:action.payload.message
            }
        } 
    
        default:
            return state;
    }
}