package com.thanos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import com.thanos.web3j.abi.datatypes.Fixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link com.thanos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Fixed128x120 extends Fixed {
    public static final Fixed128x120 DEFAULT = new Fixed128x120(BigInteger.ZERO);

    public Fixed128x120(BigInteger value) {
        super(128, 120, value);
    }

    public Fixed128x120(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(128, 120, m, n);
    }
}
