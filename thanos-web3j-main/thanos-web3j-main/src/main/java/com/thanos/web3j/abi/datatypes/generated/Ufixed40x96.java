package com.thanos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import com.thanos.web3j.abi.datatypes.Ufixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link com.thanos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Ufixed40x96 extends Ufixed {
    public static final Ufixed40x96 DEFAULT = new Ufixed40x96(BigInteger.ZERO);

    public Ufixed40x96(BigInteger value) {
        super(40, 96, value);
    }

    public Ufixed40x96(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(40, 96, m, n);
    }
}
