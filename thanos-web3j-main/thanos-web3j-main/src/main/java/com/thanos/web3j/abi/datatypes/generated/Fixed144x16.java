package com.thanos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import com.thanos.web3j.abi.datatypes.Fixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link com.thanos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Fixed144x16 extends Fixed {
    public static final Fixed144x16 DEFAULT = new Fixed144x16(BigInteger.ZERO);

    public Fixed144x16(BigInteger value) {
        super(144, 16, value);
    }

    public Fixed144x16(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(144, 16, m, n);
    }
}
