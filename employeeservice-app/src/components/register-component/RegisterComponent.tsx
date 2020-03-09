import React, { SyntheticEvent } from "react";
import { Link } from "react-router-dom";
import { apiRegister } from "../../remote/register";

interface IRegisterState {
  password: string;
  firstName: string;
  lastName: string;
  email: string;
  role: string;
  department: string;
}

interface IRegisterProps {
  message: string;
}

export class RegisterComponent extends React.Component<any, IRegisterState> {
  constructor(props: any) {
    super(props);
    this.state = {
      password: "",
      firstName: "",
      lastName: "",
      email: "",
      role: "",
      department: ""
    };
    
  }

  updateEmail = (event: any) => {
    this.setState({
      ...this.state,
      email: event.target.value
    });
  };

  updatePassword = (event: any) => {
    this.setState({
      ...this.state,
      password: event.target.value
    });
  };
  updateFirstName = (event: any) => {
    this.setState({
      ...this.state,
      firstName: event.target.value
    });
  };
  updateLastName = (event: any) => {
    this.setState({
      ...this.state,
      lastName: event.target.value
    });
  };
  updateRole = (event: any) => {
    this.setState({
      ...this.state,
      role: event.target.value
    });
  };
  updateDepartment = (event: any) => {
    this.setState({
      ...this.state,
      role: event.target.value
    });
  };

  register = async (event: SyntheticEvent) => {
    event.preventDefault();
    apiRegister(
      this.state.password,
      this.state.firstName,
      this.state.lastName,
      this.state.email,
      this.state.role,
      this.state.department
    );
    this.props.history.push("login");
  };

  render() {
    return (
      <div id="body">
        <div className="signup">
          <div>
            <h1>Sign up</h1>
            First Name:
            <input
              type="text"
              placeholder="First Name"
              className="txtb"
              required
              value={this.state.firstName}
              onChange={this.updateFirstName}
            />
            Last Name:
            <input
              type="text"
              placeholder="Last Name"
              className="txtb"
              required
              value={this.state.lastName}
              onChange={this.updateLastName}
            />
            Email:
            <input
              type="email"
              placeholder="example@email.com"
              className="txtb"
              required
              value={this.state.email}
              onChange={this.updateEmail}
            />
            Password:
            <input
              type="password"
              placeholder="Password"
              className="txtb"
              required
              value={this.state.password}
              onChange={this.updatePassword}
            />
            Department:
            <select
              className="txtb"
              defaultValue="TRANING"
              onChange={this.updateRole}
            >
              <option value="TRANING">Training</option>
              <option value="STAGING">Staging</option>
              <option value="QC">QC</option>
              <option value="RETENTION">Retention</option>
              <option value="HR">HR</option>
            </select>
            Role:
            <select
              className="txtb"
              defaultValue="TRAINER"
              onChange={this.updateRole}
            >
              <option value="TRAINER">Trainer</option>
              <option value="TRNG_MNGR">Training Manager</option>
              <option value="BLDG_MNGR">Building Manager</option>
              <option value="LOCKED">Locked</option>
            </select>
            <input
              type="submit"
              value="Create Account"
              className="signup-btn"
              onClick={this.register}
            />
            <Link id="link" to="/login">
              Sign in
            </Link>
          </div>
        </div>
      </div>
    );
  }
}
