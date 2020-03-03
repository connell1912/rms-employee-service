import { combineReducers } from "redux";
/* import { registerReducer } from "./register-reducer"; */
import { loginReducer } from "./login-reducer";
import { IUser } from "../model/IUser";

export interface IUserState {
  currentUser: IUser;
  loginMessage: string;
}

/* export interface IRegisterState {
  message: string;
} */

export interface IState {
  userState: IUserState;
  /* registerState: IRegisterState; */
}

export const state = combineReducers<IState>({
  /* registerState: registerReducer, */
  userState: loginReducer
});
