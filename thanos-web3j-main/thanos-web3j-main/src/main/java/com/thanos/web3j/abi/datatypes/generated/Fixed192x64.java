package com.thanos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import com.thanos.web3j.abi.datatypes.Fixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link com.thanos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Fixed192x64 extends Fixed {
    public static final Fixed192x64 DEFAULT = new Fixed192x64(BigInteger.ZERO);

    public Fixed192x64(BigInteger value) {
        super(192, 64, value);
    }

    public Fixed192x64(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(192, 64, m, n);
    }
}
