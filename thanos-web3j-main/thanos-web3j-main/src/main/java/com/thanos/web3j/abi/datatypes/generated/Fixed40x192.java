package com.thanos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import com.thanos.web3j.abi.datatypes.Fixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link com.thanos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Fixed40x192 extends Fixed {
    public static final Fixed40x192 DEFAULT = new Fixed40x192(BigInteger.ZERO);

    public Fixed40x192(BigInteger value) {
        super(40, 192, value);
    }

    public Fixed40x192(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(40, 192, m, n);
    }
}
