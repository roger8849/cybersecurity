# Blockchain -  Proof of concept Smart Contracts 

Along this simple repository I've done a proof of concept about Smart contracts using blockchain. All the information here it's mocked and the tools used are meant to be tested in local environments. Toolset:

- [Ethereum wallet v3.4.0](https://github.com/MyEtherWallet/etherwallet/releases/tag/v3.40.0)
- [Ganache](https://www.trufflesuite.com/ganache)
- [Remix Ethereum online editor](https://remix.ethereum.org)

## Testing Simple smart contract.

### Creating the contract
A simple contract was defined in the [SimpleContract](contracts/SingleContract.sol) as shown below.

![SimpleContract](evidences/simple-contract.png)

This contract only sets two attributes: `id` and `name` with it's accessors getters and setters.

This contract was deployed using Remix Ethereum online editor to speed up the process and avoid to compile it locally. The ABI files and the bytecode was extracted from the online editor.

- [ABI](contracts/gensrc/ABI.json)
- [Bytecode](contracts/gensrc/Bytecode.txt)

#### Remix ethereum compiler:

![Image](evidences/remix-compiler-version.png)

### Installing the MyEthereumWallet

The deprecated version of the Ethereum wallet chrome plugin was installed, mainly because new versions of the plugin doesn't allow to connect to localhost instances to deploy the contrats or use localhost mocked wallets.