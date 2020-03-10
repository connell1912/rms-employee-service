import { IRole } from "./IRole";
import { IDepartment } from "./IDepartment";

export interface IUser {
  empId: number;
  firstName: string;
  lastName: string;
  email: string;
  password: string;
  department: IDepartment;
  role: IRole;
}
