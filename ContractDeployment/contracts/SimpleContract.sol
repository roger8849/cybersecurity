 pragma solidity ^0.4.0;

/**
 * Contract created by Roger Ramirez
 */
contract SimpleContract {
    uint id;
    string name;
    
    function setId(uint idValue) public {
        id = idValue;
    }
    function getId () public view returns (uint) {
        return id;
    }
    
    function setName(string nameValue) public {
        name = nameValue;
    }
    
    function getName() public view returns (string) {
        return name;
    }
}