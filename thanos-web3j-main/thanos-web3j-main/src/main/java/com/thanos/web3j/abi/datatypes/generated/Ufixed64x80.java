package com.thanos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import com.thanos.web3j.abi.datatypes.Ufixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link com.thanos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Ufixed64x80 extends Ufixed {
    public static final Ufixed64x80 DEFAULT = new Ufixed64x80(BigInteger.ZERO);

    public Ufixed64x80(BigInteger value) {
        super(64, 80, value);
    }

    public Ufixed64x80(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(64, 80, m, n);
    }
}
