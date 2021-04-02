# Blockchain -  Proof of concept Smart Contracts 
## Table of contents.
- [Introduction](#introduction)
- [Testing Simple smart contract.](#testing-simple-smart-contract)
  * [Creating the contract](#creating-the-contract)
    + [Remix ethereum compiler:](#remix-ethereum-compiler-)
  * [Installing the MyEthereumWallet](#installing-the-myethereumwallet)


## Introduction
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

- [ABI](contracts/gensrc/SimpleContractABI.json)
- [Bytecode](contracts/gensrc/SimpleContractBytecode.txt)

#### Remix ethereum compiler:

![Remix compiler version](evidences/remix-compiler-version.png)

### Installing the MyEthereumWallet

The deprecated version of the Ethereum wallet chrome plugin was installed, mainly because new versions of the plugin doesn't allow to connect to localhost instances to deploy the contrats or use localhost mocked wallets.

![Opera my ether wallet installed](evidences/my-ether-wallet-installed.png)

### Adding Ganache mockup wallet.
Mockup wallet with 100 ethers to be able to transact with the contract:

![Ganache wallet added](evidences/my-ether-wallet-ganache-wallet-added.png)

My ether wallets your wallets:

![Ganache wallet view](evidences/my-ether-wallet-view.png)

### Deploying the contract.
With the [Bytecode](contracts/gensrc/SimpleContractBytecode.txt) attribute called `object` is added to deploy the contract in ether wallet.

![Contract deployed](evidences/contract-deployed.png)

### Interacting with the contract.

#### Setting the values for id and name.
Setting the value of `123456` for the attribute `id`

![Set id](evidences/contract-interact-setId.png)

Setting the value of `Roger` for the attribute `Name`

![Set name](evidences/contract-interact-setName.png)

#### Getting the values for id and name.

Getting the value of the attribute `id`

![Get id](evidences/contract-interact-getId.png)

Getting the value of the attribute `Name`

![Set id](evidences/contract-interact-getName.png)


#### Transaction evidences in ganache.

Wallet transactions discounted:
![Ganache wallets](evidences/ganache-wallet-transactions.png)

Blockchain transactions:
![Ganache transactions](evidences/ganache-blockchain.png)

Transaction detail.
![Ganache transaction detail](evidences/ganache-transaction-detail.png)
