import { apiRegister } from "../remote/register";
import { IRole } from "../model/IRole";
import { IDepartment } from "../model/IDepartment";

export const registerTypes = {
  SUCCESSFUL_REGISTRATION: "REGISTRATION_SUCCESSFUL_REGISTRATION",
  UNSUCCESSFUL_REGISTRATION: "REGISTRATION_UNSUCCESSFUL_REGISTRATION"
};

export const registerUser = (
  password: string,
  firstName: string,
  lastName: string,
  email: string,
  role: IRole,
  department: IDepartment
) => async (dispatch: any) => {
  let response: any = await apiRegister(
    password,
    firstName,
    lastName,
    email,
    IRole[role],
    IDepartment[department]
  );
  if (response.body) {
    dispatch({
      type: registerTypes.SUCCESSFUL_REGISTRATION,
      payload: {
        message: response.message
      }
    });
  } else {
    dispatch({
      type: registerTypes.UNSUCCESSFUL_REGISTRATION,
      payload: {
        message: response.message
      }
    });
  }
};
