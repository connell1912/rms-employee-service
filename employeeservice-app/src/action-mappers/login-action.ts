import { apiLogin } from "../remote/login"
import {history} from "../history/history";
export const loginTypes = {
    SUCCESSFUL_LOGIN: 'LOGIN_SUCCESSFUL_LOGIN',
    UNSUCCESSFUL_LOGIN: 'LOGIN_UNSUCCESSFUL_LOGIN',
    LOGOUT: 'LOGOUT'
}

export const updateCurrentUser = (email:string, password:string
    /* ,logout: boolean */
    ) => async (dispatch:any) => {
    /* if(logout === true){
        dispatch({
            type:loginTypes.LOGOUT,
            payload:{
                currentUser: null
            }
        })
        return;
    } */
    let response:any = await apiLogin(email, password)
    console.log(response);
    if(response.body){
        dispatch({
            type:loginTypes.SUCCESSFUL_LOGIN,
            payload:{
                currentUser:response.body
            }
        })
        history.push("/addroom");
    }
    else {
        dispatch({
            type:loginTypes.UNSUCCESSFUL_LOGIN,
            payload: {
                loginMessage:response.loginMessage
            }
        })

    }

}