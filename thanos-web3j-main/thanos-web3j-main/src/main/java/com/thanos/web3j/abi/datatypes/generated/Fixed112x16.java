package com.thanos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import com.thanos.web3j.abi.datatypes.Fixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link com.thanos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Fixed112x16 extends Fixed {
    public static final Fixed112x16 DEFAULT = new Fixed112x16(BigInteger.ZERO);

    public Fixed112x16(BigInteger value) {
        super(112, 16, value);
    }

    public Fixed112x16(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(112, 16, m, n);
    }
}
