package com.thanos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import com.thanos.web3j.abi.datatypes.Ufixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link com.thanos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Ufixed80x160 extends Ufixed {
    public static final Ufixed80x160 DEFAULT = new Ufixed80x160(BigInteger.ZERO);

    public Ufixed80x160(BigInteger value) {
        super(80, 160, value);
    }

    public Ufixed80x160(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(80, 160, m, n);
    }
}
