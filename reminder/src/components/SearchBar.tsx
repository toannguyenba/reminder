import React from "react";

class SearchBar extends React.Component {

    render() {

        return (
            <div>
                <div className="btn-toolbar justify-content-between" role="toolbar" aria-label="Toolbar with button groups">
                    <div className="input-group">
                        <input type="text" className="form-control" placeholder="Search" aria-label="Input group example" aria-describedby="btnGroupAddon2" />
                    </div>
                    <div  role="group" aria-label="First group">
                        <button type="button" className="btn btn-primary me-md-2">New</button>
                        <button type="button" className="btn btn-primary me-md-2">Delete</button>
                        <button type="button" className="btn btn-primary me-md-2">Setting</button>
                    </div>
                </div>
            </div>
        );
    }
}

export default SearchBar;