package com.thanos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import com.thanos.web3j.abi.datatypes.Fixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link com.thanos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Fixed160x32 extends Fixed {
    public static final Fixed160x32 DEFAULT = new Fixed160x32(BigInteger.ZERO);

    public Fixed160x32(BigInteger value) {
        super(160, 32, value);
    }

    public Fixed160x32(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(160, 32, m, n);
    }
}
