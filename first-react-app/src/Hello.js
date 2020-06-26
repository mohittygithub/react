import React, {Component} from 'react';
import './Hello.css';

class Hello extends Component{
    render(){
        return(
            <div>
                <h1 className="f1">{this.props.heading}</h1>
                <p>{this.props.greeting}</p>
            </div>
        );
    }
}

export default Hello;