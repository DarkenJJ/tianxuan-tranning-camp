package com.thanos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import com.thanos.web3j.abi.datatypes.Ufixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link com.thanos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Ufixed32x224 extends Ufixed {
    public static final Ufixed32x224 DEFAULT = new Ufixed32x224(BigInteger.ZERO);

    public Ufixed32x224(BigInteger value) {
        super(32, 224, value);
    }

    public Ufixed32x224(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(32, 224, m, n);
    }
}
