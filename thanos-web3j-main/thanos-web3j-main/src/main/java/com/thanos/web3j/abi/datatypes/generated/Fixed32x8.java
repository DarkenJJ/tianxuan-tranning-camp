package com.thanos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import com.thanos.web3j.abi.datatypes.Fixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link com.thanos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Fixed32x8 extends Fixed {
    public static final Fixed32x8 DEFAULT = new Fixed32x8(BigInteger.ZERO);

    public Fixed32x8(BigInteger value) {
        super(32, 8, value);
    }

    public Fixed32x8(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(32, 8, m, n);
    }
}
