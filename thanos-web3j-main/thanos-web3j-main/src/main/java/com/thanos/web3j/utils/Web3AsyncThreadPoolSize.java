package com.thanos.web3j.utils;

/**
 * Created by blockchain.dev on 2018/8/24.
 */
public class Web3AsyncThreadPoolSize {
    public static Integer web3AsyncPoolSize = 100;
	public static Integer web3AsyncCorePoolSize = 50;
    public Web3AsyncThreadPoolSize(int web3AsyncPoolSize,int web3AsyncCorePoolSize){
        this.web3AsyncPoolSize = web3AsyncPoolSize;
		this.web3AsyncCorePoolSize = web3AsyncCorePoolSize;
    }
}

