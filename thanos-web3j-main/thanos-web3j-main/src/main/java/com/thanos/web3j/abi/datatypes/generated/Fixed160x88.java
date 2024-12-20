package com.thanos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import com.thanos.web3j.abi.datatypes.Fixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link com.thanos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Fixed160x88 extends Fixed {
    public static final Fixed160x88 DEFAULT = new Fixed160x88(BigInteger.ZERO);

    public Fixed160x88(BigInteger value) {
        super(160, 88, value);
    }

    public Fixed160x88(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(160, 88, m, n);
    }
}
