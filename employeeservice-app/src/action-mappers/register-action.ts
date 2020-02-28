import { apiRegister } from "../remote/register"



export const registerTypes = {
    SUCCESSFUL_REGISTRATION: 'REGISTRATION_SUCCESSFUL_REGISTRATION',
    UNSUCCESSFUL_REGISTRATION: 'REGISTRATION_UNSUCCESSFUL_REGISTRATION'
}


export const registerUser = (password:string, firstName:string, lastName:string, email:string, role:string, department:string) => async (dispatch:any) => {
    let response:any = await apiRegister(password,firstName,lastName,email,role, department)
    if(response.body){
        dispatch({
            type:registerTypes.SUCCESSFUL_REGISTRATION,
            payload:{
                message:response.message
            }
        })
    }else {
        dispatch({
            type:registerTypes.UNSUCCESSFUL_REGISTRATION,
            payload: {
                message:response.message
            }
        })

    }


}