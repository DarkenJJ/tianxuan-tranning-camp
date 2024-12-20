package com.thanos.web3j.protocol.core;

import java.math.BigInteger;
import java.util.List;

import com.thanos.web3j.protocol.core.methods.request.ShhFilter;
import com.thanos.web3j.protocol.core.methods.response.*;

//增加eth_pbftView接口


/**
 * Core Ethereum JSON-RPC API.
 */
public interface Ethereum {
    Request<?, Web3ClientVersion> web3ClientVersion();

    Request<?, Web3Sha3> web3Sha3(String data);

    Request<?, NetVersion> netVersion();

    Request<?, NetListening> netListening();

    Request<?, NetPeerCount> netPeerCount();

    Request<?, EthProtocolVersion> ethProtocolVersion();

    Request<?, EthCoinbase> ethCoinbase();

    Request<?, EthSyncing> ethSyncing();

    Request<?, EthMining> ethMining();

    Request<?, EthHashrate> ethHashrate();

    Request<?, EthGasPrice> ethGasPrice();

    Request<?, EthAccounts> ethAccounts();

    Request<?, EthBlockNumber> ethBlockNumber();

    //增加eth_pbftView接口
    Request<?, EthPbftView> ethPbftView();

    Request<?, EthGetBalance> ethGetBalance(
            String address, DefaultBlockParameter defaultBlockParameter);

    Request<?, EthGetBalance> ethGetBalanceCNS(
            String contractName, DefaultBlockParameter defaultBlockParameter);

    Request<?, EthGetStorageAt> ethGetStorageAt(
            String address, BigInteger position,
            DefaultBlockParameter defaultBlockParameter);

    Request<?, EthGetStorageAt> ethGetStorageAtCNS(
            String contractName, BigInteger position,
            DefaultBlockParameter defaultBlockParameter);

    Request<?, EthGetTransactionCount> ethGetTransactionCount(
            String address, DefaultBlockParameter defaultBlockParameter);

    Request<?, EthGetTransactionCount> ethGetTransactionCountCNS(
            String contractName, DefaultBlockParameter defaultBlockParameter);

    Request<?, EthGetBlockTransactionCountByHash> ethGetBlockTransactionCountByHash(
            String blockHash);

    Request<?, EthGetBlockTransactionCountByNumber> ethGetBlockTransactionCountByNumber(
            DefaultBlockParameter defaultBlockParameter);

    Request<?, EthGetUncleCountByBlockHash> ethGetUncleCountByBlockHash(String blockHash);

    Request<?, EthGetUncleCountByBlockNumber> ethGetUncleCountByBlockNumber(
            DefaultBlockParameter defaultBlockParameter);

    Request<?, EthGetCode> ethGetCode(String address, DefaultBlockParameter defaultBlockParameter);

    Request<?, EthGetCode> ethGetCodeCNS(String contractName, DefaultBlockParameter defaultBlockParameter);

    Request<?, EthSign> ethSign(String address, String sha3HashOfDataToSign);

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthSendTransaction> ethSendTransaction(
            com.thanos.web3j.protocol.core.methods.request.Transaction transaction);

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthSendTransaction> ethSendTransactionCNS(
            String contractName,
            com.thanos.web3j.protocol.core.methods.request.Transaction transaction);

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthSendTransaction> ethSendRawTransaction(
            String signedTransactionData);

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthCall> ethCall(
            com.thanos.web3j.protocol.core.methods.request.Transaction transaction,
            DefaultBlockParameter defaultBlockParameter);

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthCall> ethCallCNS(
            String contractName,
            com.thanos.web3j.protocol.core.methods.request.Transaction transaction,
            DefaultBlockParameter defaultBlockParameter);

    Request<?, EthEstimateGas> ethEstimateGas(
            com.thanos.web3j.protocol.core.methods.request.Transaction transaction);

    Request<?, EthBlock> ethGetBlockByHash(String blockHash, boolean returnFullTransactionObjects);

    Request<?, EthBlock> ethGetBlockByNumber(
            DefaultBlockParameter defaultBlockParameter,
            boolean returnFullTransactionObjects);

    Request<?, EthTransaction> ethGetTransactionByHash(String transactionHash);

    Request<?, EthTransaction> ethGetTransactionByBlockHashAndIndex(
            String blockHash, BigInteger transactionIndex);

    Request<?, EthTransaction> ethGetTransactionByBlockNumberAndIndex(
            DefaultBlockParameter defaultBlockParameter, BigInteger transactionIndex);

    Request<?, EthGetTransactionReceipt> ethGetTransactionReceipt(String transactionHash);

    Request<?, EthBlock> ethGetUncleByBlockHashAndIndex(
            String blockHash, BigInteger transactionIndex);

    Request<?, EthBlock> ethGetUncleByBlockNumberAndIndex(
            DefaultBlockParameter defaultBlockParameter, BigInteger transactionIndex);

    Request<?, EthGetCompilers> ethGetCompilers();

    Request<?, EthCompileLLL> ethCompileLLL(String sourceCode);

    Request<?, EthCompileSolidity> ethCompileSolidity(String sourceCode);

    Request<?, EthCompileSerpent> ethCompileSerpent(String sourceCode);

    Request<?, EthFilter> ethNewFilter(com.thanos.web3j.protocol.core.methods.request.EthFilter ethFilter);

    Request<?, EthFilter> ethNewBlockFilter();

    Request<?, EthFilter> ethNewPendingTransactionFilter();

    Request<?, EthUninstallFilter> ethUninstallFilter(BigInteger filterId);

    Request<?, EthLog> ethGetFilterChanges(BigInteger filterId);

    Request<?, EthLog> ethGetFilterLogs(BigInteger filterId);

    Request<?, EthLog> ethGetLogs(com.thanos.web3j.protocol.core.methods.request.EthFilter ethFilter);

    Request<?, EthGetWork> ethGetWork();

    Request<?, EthSubmitWork> ethSubmitWork(String nonce, String headerPowHash, String mixDigest);

    Request<?, EthSubmitHashrate> ethSubmitHashrate(String hashrate, String clientId);

    Request<?, DbPutString> dbPutString(String databaseName, String keyName, String stringToStore);

    Request<?, DbGetString> dbGetString(String databaseName, String keyName);

    Request<?, DbPutHex> dbPutHex(String databaseName, String keyName, String dataToStore);

    Request<?, DbGetHex> dbGetHex(String databaseName, String keyName);

    Request<?, com.thanos.web3j.protocol.core.methods.response.ShhPost> shhPost(
            com.thanos.web3j.protocol.core.methods.request.ShhPost shhPost);

    Request<?, ShhVersion> shhVersion();

    Request<?, ShhNewIdentity> shhNewIdentity();

    Request<?, ShhHasIdentity> shhHasIdentity(String identityAddress);

    Request<?, ShhNewGroup> shhNewGroup();

    Request<?, ShhAddToGroup> shhAddToGroup(String identityAddress);

    Request<?, ShhNewFilter> shhNewFilter(ShhFilter shhFilter);

    Request<?, ShhUninstallFilter> shhUninstallFilter(BigInteger filterId);

    Request<?, ShhMessages> shhGetFilterChanges(BigInteger filterId);

    Request<?, ShhMessages> shhGetMessages(BigInteger filterId);

    Request<?, EthPeers> getAdminPeers();

    BigInteger getBlockNumberCache();

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthGetProofMerkle> ethGetProofMerkle(
            com.thanos.web3j.protocol.core.methods.request.ProofMerkle proofMerkle);


    //================================ 3.0 接口 ==================================

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthSendTransaction> thanosSendEthRawTransaction(
            String signedTransactionData);

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthSendTransactionList> thanosSendEthRawTransactionList(
            List<byte[]> transactionDataList);

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthSendTransaction> thanosSendGlobalNodeEvent(
            String signedEventData);

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthGetString> thanosEthCall(String signedTransactionData);

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthGetNumber> thanosGetLatestBeExecutedNum();

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthGetNumber> thanosGetLatestConsensusNumber();

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthGetNumber> thanosGetCurrentCommitRound();

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthGetString> thanosGetBlockByNumber(String blockNumber);

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthGetString> thanosGetEthTransactionByHash(String transactionHash);

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthGetString> thanosGetEthTransactionByHashByChain(String transactionHash);

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthGetStringList> thanosGetEthTransactionsByHashes(String transactionHashs);

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthGetString> thanosGetGlobalNodeEventByHash(String transactionHash);

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthGetString> thanosGetGlobalNodeEventByHashByChain(String transactionHash);

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthGetString> thanosGetGlobalNodeEventReceiptByHash(String transactionHash);

    Request<?, com.thanos.web3j.protocol.core.methods.response.EthGetString> thanosGetEpochState();

}
