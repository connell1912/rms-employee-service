import axios from 'axios';

export const apiRegister = async (password: string, firstName: string, lastName: string, email: string, role: string, department: string): Promise<object> => {
    let user = {
        password,
        firstName,
        lastName,
        email,
        role,
        department
    }
    try {
        const response = await axios.post('http://localhost:8080/employee/save', {
            "password": password,
            "firstName": firstName,
            "lastName": lastName,
            "email": email,
            "role": role,
            "department": department
        })
        if (response.status === 200) {
            const body = await response.data
            if (body["role"] === "ADMIN") {
                try {
                    const response2 = await axios.post('http://localhost:8080/employee/register/customer', {
                            "id": body["id"],
                            "password": body["password"],
                            "firstName": body["firstName"],
                            "lastName": body["lastName"],
                            "email": body["email"],
                            "role": body["role"],
                            "department": body["department"]
                    
                    });
                    if(response2.status === 200){
                        console.log("Customer created Successfully!");
                    }
                    else if (response2.status === 500) {
                        return {
                            message: "Failed to register you!",
                            body: null
                        }
                    } else {
                        return {
                            message: "Something Went Wrong",
                            body: null
                        }
                    }
                } catch (e) {
                    console.log(e);
                    return {
                        registerMessage: "Something Went Wrong",
                    }
                }
            }
           
            return {
                body,
                message: 'You have been registered!'
            }
        } else if (response.status === 500) {
            return {
                message: "Failed to register you!",
                body: null
            }
        } else {
            return {
                message: "Something Went Wrong",
                body: null
            }
        }
    } catch (e) {
        console.log(user);
        console.log(e);
        return {
            registerMessage: "Something Went Wrong",

        }
    }
}