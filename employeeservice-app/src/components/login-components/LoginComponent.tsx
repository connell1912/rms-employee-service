import React, { SyntheticEvent } from "react";
import { Form, Input, Button } from "reactstrap";
import { IUser } from "../../model/IUser";

interface ILoginState {
  email: string;
  password: string;
}

interface ILoginProps {
  currentUser: IUser;
  updateCurrentUser: (e: string, p: string) => void;
  loginMessage: string;
}

export class LoginComponent extends React.Component<ILoginProps, ILoginState> {
  constructor(props: any) {
    super(props);
    this.state = {
      email: "",
      password: ""
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

  // submitLogin = async (event: SyntheticEvent) => {
  //   event.preventDefault();
  //   this.props.updateCurrentUser(
  //     this.state.email,
  //     this.state.password
  //   );

    submitLogin = async (event: SyntheticEvent) => {
      event.preventDefault();
      this.props.updateCurrentUser(this.state.email, this.state.password);
    };

  //   console.log(this.props.currentUser);
  //   if (this.props.currentUser === null) {
  //     console.log("You are not a user");
  //   } else {
  //     // this.props.currentUser["role"] === "ADMIN"
  //     if (this.props.currentUser[IRole] === "ADMIN") {
  //       console.log("Admin");
  //       this.props.history.push("/admin");
  //     } else if (this.props.currentUser["role"] !== "ADMIN") {
  //       console.log("employee");
  //       this.props.history.push("/employee");
  //     }
  //   }
  // };

  render() {
    return (
      <div>
        <Form onSubmit={this.submitLogin}>
          <Input
            required
            type="email"
            placeholder="email@email.com"
            value={this.state.email}
            onChange={this.updateEmail}
          />
          <Input
            required
            type="password"
            placeholder="secret"
            value={this.state.password}
            onChange={this.updatePassword}
          />
          <Button id="login">Login</Button>
        </Form>
        <p>{this.props.loginMessage}</p>
      </div>
    );
  }
}
