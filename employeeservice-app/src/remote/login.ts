import { axiosconfig } from "../remote/axiosconfig";

export const apiLogin = async (email: string, password: string) => {
  try {
    const response = await axiosconfig.post("employee/auth", {
      email,
      password
    });
    if (response.status === 200) {
      const body = await response.data;
      console.log(body);
      return {
        body,
        loginMessage: "successful login"
      };
    } else if (response.status === 401) {
      return {
        loginMessage: "Incorrect Email or Password",
        body: null
      };
    } else {
      return {
        loginMessage: "Something Went Wrong",
        body: null
      };
    }
  } catch (e) {
    console.log(e);
    return {
      loginMessage: "Something Went Wrong"
    };
  }
};
