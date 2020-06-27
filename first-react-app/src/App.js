import React from 'react';
import CardArray from './CardArray';
import {robots} from './robots';
import SearchBox from './SearchBox';

const App = () => {
    return(
        <div className="tc">
            <h1>RoboFriends</h1>
            <SearchBox />
            <CardArray robots={robots}/>
        </div>
        
    )
}

export default App;