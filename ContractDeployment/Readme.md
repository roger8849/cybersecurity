# Blockchain -  Proof of concept Smart Contracts 

Along this simple repository I've done a proof of concept about Smart contracts using blockchain. All the information here it's mocked and the tools used are meant to be tested in local environments. Toolset:

- [Ethereum wallet v3.4.0](https://github.com/MyEtherWallet/etherwallet/releases/tag/v3.40.0)
- [Ganache](https://www.trufflesuite.com/ganache)

## Testing Simple smart contract.

### Creating the contract
Firs the simple contract was created in the file [SimpleContract](contract/SingleContract.sol) as shwon below.

This contract only sets two attributes: `id` and `name` with it's accessors getters and setters.