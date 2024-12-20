package com.thanos.web3j.crypto;

import com.thanos.web3j.crypto.sm2.SM2Sign;
import com.thanos.web3j.crypto.sm3.SM3Digest;

/**
 * Created by blockchain.dev on 2018/4/25.
 */
public class EncryptType {
    public static int encryptType = 0;//0:ECDSA 1:SM2
    public EncryptType(int encryptType){
        EncryptType.encryptType = encryptType;
        SignInterface signInterface;
        HashInterface hashInterface;
        if (encryptType == 1){
            signInterface = new SM2Sign();
            hashInterface = new SM3Digest();
        }
        else {
            signInterface = new ECDSASign();
            hashInterface = new SHA3Digest();
        }
        Sign.setSignInterface(signInterface);
        Hash.setHashInterface(hashInterface);
    }
    public int getEncryptType() {
        return encryptType;
    }

    public void setEncryptType(int encryptType) {
        EncryptType.encryptType = encryptType;
    }
}
