package com.thanos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import com.thanos.web3j.abi.datatypes.Ufixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link com.thanos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Ufixed24x112 extends Ufixed {
    public static final Ufixed24x112 DEFAULT = new Ufixed24x112(BigInteger.ZERO);

    public Ufixed24x112(BigInteger value) {
        super(24, 112, value);
    }

    public Ufixed24x112(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(24, 112, m, n);
    }
}
