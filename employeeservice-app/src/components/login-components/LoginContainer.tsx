import { connect } from "react-redux";
import { IState } from "../../reducers";
import { LoginComponent } from "./LoginComponent";
import { updateCurrentUser } from '../../action-mappers/login-action';


const mapStateToProps = (state:IState) => {
    return {
        currentUser: state.userState.currentUser,
        loginMessage:state.userState.loginMessage
    }
}


const mapDispatchToProps = {
    updateCurrentUser
}

export default connect(mapStateToProps,mapDispatchToProps)(LoginComponent)