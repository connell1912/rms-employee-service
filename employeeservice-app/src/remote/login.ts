import axios from 'axios';


export const apiLogin = async (email: string, password: string): Promise<object> => {
    try {
        const response = await axios.post('http://localhost:8080/employee/auth', {
            "email": email,
            "password": password
        })
        if (response.status === 200) {
            const body = await response.data
            console.log(body)
            return {
                body,
                loginMessage: 'successful login'
            }
        } else if (response.status === 401) {
            return {
                loginMessage: "Incorrect Username or Password",
                body: null
            }
        } else {
            return {
                loginMessage: "Something Went Wrong",
                body: null
            }
        }
    } catch (e) {
        console.log(e);
        return {
            loginMessage: "Something Went Wrong",

        }
    }
}