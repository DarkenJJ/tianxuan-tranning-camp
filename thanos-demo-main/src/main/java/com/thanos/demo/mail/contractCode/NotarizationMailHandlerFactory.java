package com.thanos.demo.mail.contractCode;

import com.thanos.web3j.channel.client.TransactionSucCallback;
import com.thanos.web3j.abi.EventEncoder;
import com.thanos.web3j.abi.EventValues;
import com.thanos.web3j.abi.FunctionEncoder;
import com.thanos.web3j.abi.TypeReference;
import com.thanos.web3j.abi.datatypes.Address;
import com.thanos.web3j.abi.datatypes.Event;
import com.thanos.web3j.abi.datatypes.Function;
import com.thanos.web3j.abi.datatypes.Type;
import com.thanos.web3j.crypto.Credentials;
import com.thanos.web3j.model.ThanosTransactionReceipt;
import com.thanos.web3j.protocol.Web3j;
import com.thanos.web3j.protocol.core.DefaultBlockParameter;
import com.thanos.web3j.protocol.core.methods.request.EthFilter;
import com.thanos.web3j.protocol.core.methods.response.Log;
import com.thanos.web3j.tx.Contract;
import com.thanos.web3j.tx.TransactionManager;
import rx.Observable;
import rx.functions.Func1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>, or {@link com.thanos.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 */
public final class NotarizationMailHandlerFactory extends Contract {
//    private static String BINARY = "6060604052341561000c57fe5b60405160208061112e833981016040528080519060200190919050505b80600060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b505b6110b28061007c6000396000f30060606040526000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806348b5744514610051578063af2b8c52146100a3578063f77c4791146100f5575bfe5b341561005957fe5b610061610147565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34156100ab57fe5b6100b36103c5565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34156100fd57fe5b610105610643565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b60006000610153610669565b809050604051809103906000f080151561016957fe5b9050600060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16631e59c529826000604051602001526040518263ffffffff167c010000000000000000000000000000000000000000000000000000000002815260040180806020018373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001828103825260178152602001807f4e6f746172697a6174696f6e4d61696c48616e646c657200000000000000000081525060200192505050602060405180830381600087803b151561026657fe5b6102c65a03f1151561027457fe5b50505060405180519050508073ffffffffffffffffffffffffffffffffffffffff166392eefe9b600060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff166000604051602001526040518263ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001915050602060405180830381600087803b151561034157fe5b6102c65a03f1151561034f57fe5b50505060405180519050507fd48a3367e9d4b68bf56c2f3a09c4f33ac41b10a851d74b6290cba55aa4e9ecc681604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390a18091505b5090565b600060006103d1610669565b809050604051809103906000f08015156103e757fe5b9050600060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16632cff89c9826000604051602001526040518263ffffffff167c010000000000000000000000000000000000000000000000000000000002815260040180806020018373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001828103825260178152602001807f4e6f746172697a6174696f6e4d61696c48616e646c657200000000000000000081525060200192505050602060405180830381600087803b15156104e457fe5b6102c65a03f115156104f257fe5b50505060405180519050508073ffffffffffffffffffffffffffffffffffffffff166392eefe9b600060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff166000604051602001526040518263ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001915050602060405180830381600087803b15156105bf57fe5b6102c65a03f115156105cd57fe5b50505060405180519050507fd48a3367e9d4b68bf56c2f3a09c4f33ac41b10a851d74b6290cba55aa4e9ecc681604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390a18091505b5090565b600060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b604051610a0d8061067a83390190560060606040525b32600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b5b6109b6806100576000396000f30060606040523615610076576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff168063057af1c41461007857806338278cda146100ea578063893d20e8146102255780638da5cb5b1461027757806392eefe9b146102c9578063f77c479114610317575bfe5b341561008057fe5b6100d0600480803590602001908201803590602001908080601f01602080910402602001604051908101604052809392919081815260200183838082843782019150505050505091905050610369565b604051808215151515815260200191505060405180910390f35b34156100f257fe5b61020b600480803590602001908201803590602001908080601f0160208091040260200160405190810160405280939291908181526020018383808284378201915050505050509190803590602001908201803590602001908080601f0160208091040260200160405190810160405280939291908181526020018383808284378201915050505050509190803590602001908201803590602001908080601f0160208091040260200160405190810160405280939291908181526020018383808284378201915050505050509190803590602001908201803590602001908080601f01602080910402602001604051908101604052809392919081815260200183838082843782019150505050505091905050610517565b604051808215151515815260200191505060405180910390f35b341561022d57fe5b610235610839565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b341561027f57fe5b610287610864565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34156102d157fe5b6102fd600480803573ffffffffffffffffffffffffffffffffffffffff1690602001909190505061088a565b604051808215151515815260200191505060405180910390f35b341561031f57fe5b610327610964565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b6000600060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663dfcd15786000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401809050602060405180830381600087803b15156103f957fe5b6102c65a03f1151561040757fe5b5050506040518051905073ffffffffffffffffffffffffffffffffffffffff1663057af1c4836000604051602001526040518263ffffffff167c010000000000000000000000000000000000000000000000000000000002815260040180806020018281038252838181518152602001915080519060200190808383600083146104b0575b8051825260208311156104b05760208201915060208101905060208303925061048c565b505050905090810190601f1680156104dc5780820380516001836020036101000a031916815260200191505b5092505050602060405180830381600087803b15156104f757fe5b6102c65a03f1151561050557fe5b5050506040518051905090505b919050565b6000600060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663dfcd15786000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401809050602060405180830381600087803b15156105a757fe5b6102c65a03f115156105b557fe5b5050506040518051905073ffffffffffffffffffffffffffffffffffffffff166338278cda868686866000604051602001526040518563ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401808060200180602001806020018060200185810385528981815181526020019150805190602001908083836000831461066d575b80518252602083111561066d57602082019150602081019050602083039250610649565b505050905090810190601f1680156106995780820380516001836020036101000a031916815260200191505b508581038452888181518152602001915080519060200190808383600083146106e1575b8051825260208311156106e1576020820191506020810190506020830392506106bd565b505050905090810190601f16801561070d5780820380516001836020036101000a031916815260200191505b50858103835287818151815260200191508051906020019080838360008314610755575b80518252602083111561075557602082019150602081019050602083039250610731565b505050905090810190601f1680156107815780820380516001836020036101000a031916815260200191505b508581038252868181518152602001915080519060200190808383600083146107c9575b8051825260208311156107c9576020820191506020810190506020830392506107a5565b505050905090810190601f1680156107f55780820380516001836020036101000a031916815260200191505b5098505050505050505050602060405180830381600087803b151561081657fe5b6102c65a03f1151561082457fe5b5050506040518051905090505b949350505050565b6000600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1690505b90565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b6000600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163273ffffffffffffffffffffffffffffffffffffffff161415156108e95760006000fd5b81600060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055507f15504e11775a2cc1976320e3c666e5965057d329614934f0b707fc711dfb82ec60405180905060405180910390a1600190505b5b919050565b600060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16815600a165627a7a72305820e56545c5e8e02b3c95ff255f86d35a68d89a8b809021d6d980520314253d22640029a165627a7a723058201d6c23c8b3e6236a44efd49bab55c99899eb9b4be308e08bd6076b6855f6fec40029";
    private static String BINARY = "608060405234801561001057600080fd5b50604051602080610ba9833981016040525160008054600160a060020a03909216600160a060020a0319909216919091179055610b57806100526000396000f3006080604052600436106100565763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166348b57445811461005b578063af2b8c5214610099578063f77c4791146100ae575b600080fd5b34801561006757600080fd5b506100706100c3565b6040805173ffffffffffffffffffffffffffffffffffffffff9092168252519081900360200190f35b3480156100a557600080fd5b506100706102b4565b3480156100ba57600080fd5b50610070610389565b6000806100ce6103a5565b604051809103906000f0801580156100ea573d6000803e3d6000fd5b5060008054604080517f1e59c52900000000000000000000000000000000000000000000000000000000815273ffffffffffffffffffffffffffffffffffffffff808616602483015260048201839052601760448301527f4e6f746172697a6174696f6e4d61696c48616e646c657200000000000000000060648301529151949550911692631e59c52992608480840193602093929083900390910190829087803b15801561019857600080fd5b505af11580156101ac573d6000803e3d6000fd5b505050506040513d60208110156101c257600080fd5b505060008054604080517f92eefe9b00000000000000000000000000000000000000000000000000000000815273ffffffffffffffffffffffffffffffffffffffff92831660048201529051918416926392eefe9b926024808401936020939083900390910190829087803b15801561023a57600080fd5b505af115801561024e573d6000803e3d6000fd5b505050506040513d602081101561026457600080fd5b50506040805173ffffffffffffffffffffffffffffffffffffffff8316815290517fd48a3367e9d4b68bf56c2f3a09c4f33ac41b10a851d74b6290cba55aa4e9ecc69181900360200190a1919050565b6000806102bf6103a5565b604051809103906000f0801580156102db573d6000803e3d6000fd5b5060008054604080517f2cff89c900000000000000000000000000000000000000000000000000000000815273ffffffffffffffffffffffffffffffffffffffff808616602483015260048201839052601760448301527f4e6f746172697a6174696f6e4d61696c48616e646c657200000000000000000060648301529151949550911692632cff89c992608480840193602093929083900390910190829087803b15801561019857600080fd5b60005473ffffffffffffffffffffffffffffffffffffffff1681565b604051610776806103b6833901905600608060405260018054600160a060020a03191632179055610751806100256000396000f30060806040526004361061005e5763ffffffff60e060020a600035041663057af1c4811461006357806338278cda146100d0578063893d20e8146101e35780638da5cb5b1461021457806392eefe9b14610229578063f77c47911461024a575b600080fd5b34801561006f57600080fd5b506040805160206004803580820135601f81018490048402850184019095528484526100bc94369492936024939284019190819084018382808284375094975061025f9650505050505050565b604080519115158252519081900360200190f35b3480156100dc57600080fd5b506040805160206004803580820135601f81018490048402850184019095528484526100bc94369492936024939284019190819084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a9998810197919650918201945092508291508401838280828437509497506103d39650505050505050565b3480156101ef57600080fd5b506101f8610687565b60408051600160a060020a039092168252519081900360200190f35b34801561022057600080fd5b506101f8610696565b34801561023557600080fd5b506100bc600160a060020a03600435166106a5565b34801561025657600080fd5b506101f8610716565b60008060009054906101000a9004600160a060020a0316600160a060020a031663dfcd15786040518163ffffffff1660e060020a028152600401602060405180830381600087803b1580156102b357600080fd5b505af11580156102c7573d6000803e3d6000fd5b505050506040513d60208110156102dd57600080fd5b50516040517f057af1c4000000000000000000000000000000000000000000000000000000008152602060048201818152855160248401528551600160a060020a039094169363057af1c493879383926044909201919085019080838360005b8381101561035557818101518382015260200161033d565b50505050905090810190601f1680156103825780820380516001836020036101000a031916815260200191505b5092505050602060405180830381600087803b1580156103a157600080fd5b505af11580156103b5573d6000803e3d6000fd5b505050506040513d60208110156103cb57600080fd5b505192915050565b60008060009054906101000a9004600160a060020a0316600160a060020a031663dfcd15786040518163ffffffff1660e060020a028152600401602060405180830381600087803b15801561042757600080fd5b505af115801561043b573d6000803e3d6000fd5b505050506040513d602081101561045157600080fd5b50516040517f38278cda000000000000000000000000000000000000000000000000000000008152608060048201908152875160848301528751600160a060020a03909316926338278cda92899289928992899291829160248101916044820191606481019160a49091019060208b019080838360005b838110156104e05781810151838201526020016104c8565b50505050905090810190601f16801561050d5780820380516001836020036101000a031916815260200191505b5085810384528851815288516020918201918a019080838360005b83811015610540578181015183820152602001610528565b50505050905090810190601f16801561056d5780820380516001836020036101000a031916815260200191505b50858103835287518152875160209182019189019080838360005b838110156105a0578181015183820152602001610588565b50505050905090810190601f1680156105cd5780820380516001836020036101000a031916815260200191505b50858103825286518152865160209182019188019080838360005b838110156106005781810151838201526020016105e8565b50505050905090810190601f16801561062d5780820380516001836020036101000a031916815260200191505b5098505050505050505050602060405180830381600087803b15801561065257600080fd5b505af1158015610666573d6000803e3d6000fd5b505050506040513d602081101561067c57600080fd5b505195945050505050565b600154600160a060020a031690565b600154600160a060020a031681565b600154600090600160a060020a031632146106bf57600080fd5b6000805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0384161781556040517f15504e11775a2cc1976320e3c666e5965057d329614934f0b707fc711dfb82ec9190a1506001919050565b600054600160a060020a0316815600a165627a7a723058208c00df3f72152d746dea6d517ec95f9116c7f2dcc66f479168fd023daa432c690029a165627a7a723058208f6d7dc3b9189cad45bc092380d14e4fe9664b58f6323a1d79b4a4cebb12be280029";

    public static final String ABI = "[{\"constant\":false,\"inputs\":[],\"name\":\"createHandler\",\"outputs\":[{\"name\":\"\",\"type\":\"address\"}],\"payable\":false,\"type\":\"function\"},{\"constant\":false,\"inputs\":[],\"name\":\"updateHandler\",\"outputs\":[{\"name\":\"\",\"type\":\"address\"}],\"payable\":false,\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"controller\",\"outputs\":[{\"name\":\"\",\"type\":\"address\"}],\"payable\":false,\"type\":\"function\"},{\"inputs\":[{\"name\":\"_controller\",\"type\":\"address\"}],\"payable\":false,\"type\":\"constructor\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":false,\"name\":\"addr\",\"type\":\"address\"}],\"name\":\"createSuccessEvent\",\"type\":\"event\"}]";

    private NotarizationMailHandlerFactory(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, Boolean isInitByName) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit, isInitByName);
    }

    private NotarizationMailHandlerFactory(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, Boolean isInitByName) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit, isInitByName);
    }

    private NotarizationMailHandlerFactory(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit, false);
    }

    private NotarizationMailHandlerFactory(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit, false);
    }

    public static List<CreateSuccessEventEventResponse> getCreateSuccessEventEvents(ThanosTransactionReceipt transactionReceipt) {
        final Event event = new Event("createSuccessEvent",
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        List<EventValues> valueList = extractEventParameters(event, transactionReceipt);
        ArrayList<CreateSuccessEventEventResponse> responses = new ArrayList<CreateSuccessEventEventResponse>(valueList.size());
        for (EventValues eventValues : valueList) {
            CreateSuccessEventEventResponse typedResponse = new CreateSuccessEventEventResponse();
            typedResponse.addr = (Address) eventValues.getNonIndexedValues().get(0);
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<CreateSuccessEventEventResponse> createSuccessEventEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("createSuccessEvent",
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, CreateSuccessEventEventResponse>() {
            @Override
            public CreateSuccessEventEventResponse call(Log log) {
                EventValues eventValues = extractEventParameters(event, log);
                CreateSuccessEventEventResponse typedResponse = new CreateSuccessEventEventResponse();
                typedResponse.addr = (Address) eventValues.getNonIndexedValues().get(0);
                return typedResponse;
            }
        });
    }

    public Future<ThanosTransactionReceipt> createHandler() {
        Function function = new Function("createHandler", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public void createHandler(TransactionSucCallback callback) {
        Function function = new Function("createHandler", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        executeTransactionAsync(function, callback);
    }

    public Future<ThanosTransactionReceipt> updateHandler() {
        Function function = new Function("updateHandler", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public void updateHandler(TransactionSucCallback callback) {
        Function function = new Function("updateHandler", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        executeTransactionAsync(function, callback);
    }

    public Future<Address> controller() {
        Function function = new Function("controller",
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public static Future<NotarizationMailHandlerFactory> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, Address _controller) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(_controller));
        return deployAsync(NotarizationMailHandlerFactory.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    public static Future<NotarizationMailHandlerFactory> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue, Address _controller) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(_controller));
        return deployAsync(NotarizationMailHandlerFactory.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor, initialWeiValue);
    }

    public static NotarizationMailHandlerFactory load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new NotarizationMailHandlerFactory(contractAddress, web3j, credentials, gasPrice, gasLimit, false);
    }

    public static NotarizationMailHandlerFactory load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new NotarizationMailHandlerFactory(contractAddress, web3j, transactionManager, gasPrice, gasLimit, false);
    }

    public static NotarizationMailHandlerFactory loadByName(String contractName, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new NotarizationMailHandlerFactory(contractName, web3j, credentials, gasPrice, gasLimit, true);
    }

    public static NotarizationMailHandlerFactory loadByName(String contractName, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new NotarizationMailHandlerFactory(contractName, web3j, transactionManager, gasPrice, gasLimit, true);
    }

    public static class CreateSuccessEventEventResponse {
        public Address addr;
    }
}
